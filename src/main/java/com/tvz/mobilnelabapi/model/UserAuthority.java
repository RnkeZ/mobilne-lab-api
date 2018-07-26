package com.tvz.mobilnelabapi.model;

import java.io.Serializable;

public class UserAuthority implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tvz.user_authority.user_id
	 * @mbg.generated  Thu Jul 26 14:06:40 CEST 2018
	 */
	private Integer userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tvz.user_authority.authority_id
	 * @mbg.generated  Thu Jul 26 14:06:40 CEST 2018
	 */
	private Integer authorityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tvz.user_authority
	 * @mbg.generated  Thu Jul 26 14:06:40 CEST 2018
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tvz.user_authority.user_id
	 * @return  the value of tvz.user_authority.user_id
	 * @mbg.generated  Thu Jul 26 14:06:40 CEST 2018
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tvz.user_authority.user_id
	 * @param userId  the value for tvz.user_authority.user_id
	 * @mbg.generated  Thu Jul 26 14:06:40 CEST 2018
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tvz.user_authority.authority_id
	 * @return  the value of tvz.user_authority.authority_id
	 * @mbg.generated  Thu Jul 26 14:06:40 CEST 2018
	 */
	public Integer getAuthorityId() {
		return authorityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tvz.user_authority.authority_id
	 * @param authorityId  the value for tvz.user_authority.authority_id
	 * @mbg.generated  Thu Jul 26 14:06:40 CEST 2018
	 */
	public void setAuthorityId(Integer authorityId) {
		this.authorityId = authorityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tvz.user_authority
	 * @mbg.generated  Thu Jul 26 14:06:40 CEST 2018
	 */
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		UserAuthority other = (UserAuthority) that;
		return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
				&& (this.getAuthorityId() == null ? other.getAuthorityId() == null
						: this.getAuthorityId().equals(other.getAuthorityId()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tvz.user_authority
	 * @mbg.generated  Thu Jul 26 14:06:40 CEST 2018
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
		result = prime * result + ((getAuthorityId() == null) ? 0 : getAuthorityId().hashCode());
		return result;
	}
}