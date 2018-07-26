package com.tvz.mobilnelabapi.security;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import com.tvz.mobilnelabapi.model.Authority;
import com.tvz.mobilnelabapi.model.User;

public final class JwtUserFactory {

	private JwtUserFactory() {

	}

	public static JwtUser create(User user, List<Authority> list) {
		return new JwtUser((long) user.getId(), user.getUsername(), user.getFirstname(), user.getLastname(),
				user.getEmail(), user.getPassword(), mapToGrantedAuthorities(list),
				user.getEnabled(), user.getLastpasswordresetdate());
	}

	private static List<GrantedAuthority> mapToGrantedAuthorities(List<Authority> authorities) {
		return authorities.stream().map(authority -> new SimpleGrantedAuthority(authority.getName()))
				.collect(Collectors.toList());
	}
}
