package com.tvz.mobilnelabapi.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tvz.mobilnelabapi.mappers.dao.AuthorityMapper;
import com.tvz.mobilnelabapi.mappers.dao.UserMapper;
import com.tvz.mobilnelabapi.model.User;
import com.tvz.mobilnelabapi.security.JwtUserFactory;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    
    @Autowired
	AuthorityMapper authorityMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {;
        User user = userMapper.selectByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            return JwtUserFactory.create(user, authorityMapper.selectAuthorityByUsername(username));
        }
    }
}
