package com.tvz.mobilnelabapi.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mob.User.ID
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mob.User.Username
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mob.User.Password
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mob.User.Firstname
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    private String firstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mob.User.Lastname
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    private String lastname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mob.User.Email
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mob.User.Enabled
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    private Boolean enabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mob.User.LastPasswordResetDate
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    private Date lastpasswordresetdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mob.User
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mob.User.ID
     *
     * @return the value of mob.User.ID
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mob.User.ID
     *
     * @param id the value for mob.User.ID
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mob.User.Username
     *
     * @return the value of mob.User.Username
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mob.User.Username
     *
     * @param username the value for mob.User.Username
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mob.User.Password
     *
     * @return the value of mob.User.Password
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mob.User.Password
     *
     * @param password the value for mob.User.Password
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mob.User.Firstname
     *
     * @return the value of mob.User.Firstname
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mob.User.Firstname
     *
     * @param firstname the value for mob.User.Firstname
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mob.User.Lastname
     *
     * @return the value of mob.User.Lastname
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mob.User.Lastname
     *
     * @param lastname the value for mob.User.Lastname
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mob.User.Email
     *
     * @return the value of mob.User.Email
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mob.User.Email
     *
     * @param email the value for mob.User.Email
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mob.User.Enabled
     *
     * @return the value of mob.User.Enabled
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mob.User.Enabled
     *
     * @param enabled the value for mob.User.Enabled
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mob.User.LastPasswordResetDate
     *
     * @return the value of mob.User.LastPasswordResetDate
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public Date getLastpasswordresetdate() {
        return lastpasswordresetdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mob.User.LastPasswordResetDate
     *
     * @param lastpasswordresetdate the value for mob.User.LastPasswordResetDate
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public void setLastpasswordresetdate(Date lastpasswordresetdate) {
        this.lastpasswordresetdate = lastpasswordresetdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.User
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getLastpasswordresetdate() == null ? other.getLastpasswordresetdate() == null : this.getLastpasswordresetdate().equals(other.getLastpasswordresetdate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.User
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getLastpasswordresetdate() == null) ? 0 : getLastpasswordresetdate().hashCode());
        return result;
    }
}