package com.tvz.mobilnelabapi.security.controller;

import java.util.Objects;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tvz.mobilnelabapi.composite.UserComposite;
import com.tvz.mobilnelabapi.mappers.dao.UserMapper;
import com.tvz.mobilnelabapi.security.JwtAuthenticationRequest;
import com.tvz.mobilnelabapi.security.JwtTokenUtil;
import com.tvz.mobilnelabapi.security.JwtUser;
import com.tvz.mobilnelabapi.security.service.JwtAuthenticationResponse;

import io.swagger.annotations.Api;

@RestController
@Api(value = "Mobilne lab REST controller", tags = { "Authentication" })
public class AuthenticationRestController {

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
    UserMapper userMapper;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    @Qualifier("jwtUserDetailsService")
    private UserDetailsService userDetailsService;
    
    @RequestMapping(value = "${jwt.route.authentication.path}", method = RequestMethod.POST)
    public UserComposite createAuthenticationUserAndToken(@RequestBody JwtAuthenticationRequest authenticationRequest) throws AuthenticationException {
        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
        // Reload password post-security so we can generate the token
        UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        UserComposite user = userMapper.selectByUsernameComposite(userDetails.getUsername());
//        user.setNovi(upitMapper.selectCompositeByKorisnickoIme(userDetails.getUsername()).size() == 0);
        user.setToken(jwtTokenUtil.generateToken(userDetails));
        return user;
    }
    


    @RequestMapping(value = "${jwt.route.authentication.refresh}", method = RequestMethod.GET)
    public ResponseEntity<?> refreshAndGetAuthenticationToken(HttpServletRequest request) {
        String authToken = request.getHeader(tokenHeader);
        final String token = authToken.substring(7);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);

        if (jwtTokenUtil.canTokenBeRefreshed(token, user.getLastPasswordResetDate())) {
            String refreshedToken = jwtTokenUtil.refreshToken(token);
            return ResponseEntity.ok(new JwtAuthenticationResponse(refreshedToken));
        } else {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @ExceptionHandler({AuthenticationException.class})
    public ResponseEntity<String> handleAuthenticationException(AuthenticationException e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
    }

    /**
     * Authenticates the user. If something is wrong, an {@link AuthenticationException} will be thrown
     */
    private void authenticate(String username, String password) {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new AuthenticationException("User is disabled!", e);
        } catch (BadCredentialsException e) {
            throw new AuthenticationException("Bad credentials!", e);
        }
    }
}
