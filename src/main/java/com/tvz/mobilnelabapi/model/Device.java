package com.tvz.mobilnelabapi.model;

import java.io.Serializable;

public class Device implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mob.Device.ID
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mob.Device.Name
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mob.Device.Description
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mob.Device
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mob.Device.ID
     *
     * @return the value of mob.Device.ID
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mob.Device.ID
     *
     * @param id the value for mob.Device.ID
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mob.Device.Name
     *
     * @return the value of mob.Device.Name
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mob.Device.Name
     *
     * @param name the value for mob.Device.Name
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mob.Device.Description
     *
     * @return the value of mob.Device.Description
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mob.Device.Description
     *
     * @param description the value for mob.Device.Description
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Device
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
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
        Device other = (Device) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Device
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
}