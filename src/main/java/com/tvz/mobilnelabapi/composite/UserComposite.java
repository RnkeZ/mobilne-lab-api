package com.tvz.mobilnelabapi.composite;

import com.tvz.mobilnelabapi.model.User;

import java.util.List;

import com.tvz.mobilnelabapi.model.Authority;

public class UserComposite extends User {
	private static final long serialVersionUID = 1L;
	List<Authority> authority;
	List<String> authorityString;

	public List<Authority> getAuthority() {
		return authority;
	}

	public void setAuthority(List<Authority> authority) {
		this.authority = authority;
	}

	public List<String> getAuthorityString() {
		return authorityString;
	}

	public void setAuthorityString(List<String> authorityString) {
		this.authorityString = authorityString;
	}


}
