package com.tvz.mobilnelabapi.composite;

import com.tvz.mobilnelabapi.model.User;

import java.util.List;

import com.tvz.mobilnelabapi.model.Authority;

public class UserComposite extends User {
	private static final long serialVersionUID = 1L;
	List<String> authority;
	List<Authority> authorityObject;

	public List<String> getAuthority() {
		return authority;
	}

	public void setAuthority(List<String> authority) {
		this.authority = authority;
	}

	public List<Authority> getAuthorityObject() {
		return authorityObject;
	}

	public void setAuthorityObject(List<Authority> authorityObject) {
		this.authorityObject = authorityObject;
	}

}
