package com.tvz.mobilnelabapi.model;

import java.io.Serializable;
import java.util.Date;

public class Measurements implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mob.Measurements.ID
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mob.Measurements.Name
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mob.Measurements.Data
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	private String data;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mob.Measurements.DateOfCreation
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	private Date dateofcreation;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mob.Measurements.UserID
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	private Integer userid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mob.Measurements.Username
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mob.Measurements.TypeID
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	private Integer typeid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mob.Measurements.DeviceID
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	private Integer deviceid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mob.Measurements.ID
	 * @return  the value of mob.Measurements.ID
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mob.Measurements.ID
	 * @param id  the value for mob.Measurements.ID
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mob.Measurements.Name
	 * @return  the value of mob.Measurements.Name
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mob.Measurements.Name
	 * @param name  the value for mob.Measurements.Name
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mob.Measurements.Data
	 * @return  the value of mob.Measurements.Data
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public String getData() {
		return data;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mob.Measurements.Data
	 * @param data  the value for mob.Measurements.Data
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mob.Measurements.DateOfCreation
	 * @return  the value of mob.Measurements.DateOfCreation
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public Date getDateofcreation() {
		return dateofcreation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mob.Measurements.DateOfCreation
	 * @param dateofcreation  the value for mob.Measurements.DateOfCreation
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public void setDateofcreation(Date dateofcreation) {
		this.dateofcreation = dateofcreation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mob.Measurements.UserID
	 * @return  the value of mob.Measurements.UserID
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public Integer getUserid() {
		return userid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mob.Measurements.UserID
	 * @param userid  the value for mob.Measurements.UserID
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mob.Measurements.Username
	 * @return  the value of mob.Measurements.Username
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mob.Measurements.Username
	 * @param username  the value for mob.Measurements.Username
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mob.Measurements.TypeID
	 * @return  the value of mob.Measurements.TypeID
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public Integer getTypeid() {
		return typeid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mob.Measurements.TypeID
	 * @param typeid  the value for mob.Measurements.TypeID
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mob.Measurements.DeviceID
	 * @return  the value of mob.Measurements.DeviceID
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public Integer getDeviceid() {
		return deviceid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mob.Measurements.DeviceID
	 * @param deviceid  the value for mob.Measurements.DeviceID
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public void setDeviceid(Integer deviceid) {
		this.deviceid = deviceid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
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
		Measurements other = (Measurements) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
				&& (this.getData() == null ? other.getData() == null : this.getData().equals(other.getData()))
				&& (this.getDateofcreation() == null ? other.getDateofcreation() == null
						: this.getDateofcreation().equals(other.getDateofcreation()))
				&& (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
				&& (this.getUsername() == null ? other.getUsername() == null
						: this.getUsername().equals(other.getUsername()))
				&& (this.getTypeid() == null ? other.getTypeid() == null : this.getTypeid().equals(other.getTypeid()))
				&& (this.getDeviceid() == null ? other.getDeviceid() == null
						: this.getDeviceid().equals(other.getDeviceid()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + ((getData() == null) ? 0 : getData().hashCode());
		result = prime * result + ((getDateofcreation() == null) ? 0 : getDateofcreation().hashCode());
		result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
		result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
		result = prime * result + ((getTypeid() == null) ? 0 : getTypeid().hashCode());
		result = prime * result + ((getDeviceid() == null) ? 0 : getDeviceid().hashCode());
		return result;
	}
}