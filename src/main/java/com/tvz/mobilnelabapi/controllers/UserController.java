package com.tvz.mobilnelabapi.controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tvz.mobilnelabapi.composite.UserComposite;
import com.tvz.mobilnelabapi.mappers.dao.AuthorityMapper;
import com.tvz.mobilnelabapi.mappers.dao.UserAuthorityMapper;
import com.tvz.mobilnelabapi.mappers.dao.UserMapper;
import com.tvz.mobilnelabapi.model.Authority;
import com.tvz.mobilnelabapi.model.Measurements;
import com.tvz.mobilnelabapi.model.User;
import com.tvz.mobilnelabapi.model.UserAuthority;
import com.tvz.mobilnelabapi.security.JwtTokenUtil;
import com.tvz.mobilnelabapi.security.JwtUser;
import com.tvz.mobilnelabapi.utility.MobilneLabUtility;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api")
@Api(value = "Mobilne lab REST controller", tags = { "User" })
public class UserController {
	private static final Logger logger = LogManager.getLogger(UserController.class);
	
    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    
    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private AuthorityMapper authorityMapper;
    
    @Autowired
    private UserAuthorityMapper userAuthorityMapper;
    
    BCryptPasswordEncoder cryptPasswordEncoder = new BCryptPasswordEncoder();

    @Autowired
    @Qualifier("jwtUserDetailsService")
    private UserDetailsService userDetailsService;

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public JwtUser getAuthenticatedUser(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader).substring(7);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
        return user;
    }
    
    @RequestMapping(value = "users", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public List<UserComposite> getUsers(HttpServletRequest request) {
        List<UserComposite> users = userMapper.selectByExampleComposites(null);
        return users;
    }
    
    @RequestMapping(value = "authorities", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_USER')")
    public List<Authority> getAuthorities(HttpServletRequest request) {
        List<Authority> users = authorityMapper.selectByExample(null);
        return users;
    }
    
    @RequestMapping(value = "user", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
	public void insertUser(HttpServletRequest request, @RequestBody UserComposite user) throws JSONException {
    	user.setPassword(cryptPasswordEncoder.encode(user.getPassword()));
    	user.setEnabled(true);
    	user.setLastpasswordresetdate(new Date());
		userMapper.insertSelective(user);
		UserAuthority record = new UserAuthority();
		for (Authority item : user.getAuthority()) {
			record.setAuthorityid(item.getId());
			record.setUserid( user.getId());
			userAuthorityMapper.insertSelective(record);
		}	
	}

}
