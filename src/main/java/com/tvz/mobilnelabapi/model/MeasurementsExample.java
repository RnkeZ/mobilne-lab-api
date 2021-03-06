package com.tvz.mobilnelabapi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeasurementsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public MeasurementsExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("ID =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("ID <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("ID >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("ID >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("ID <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("ID <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("ID in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("ID not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("ID between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("Name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("Name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("Name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("Name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("Name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("Name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("Name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("Name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("Name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("Name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("Name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("Name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("Name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("Name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andDataIsNull() {
			addCriterion("Data is null");
			return (Criteria) this;
		}

		public Criteria andDataIsNotNull() {
			addCriterion("Data is not null");
			return (Criteria) this;
		}

		public Criteria andDataEqualTo(String value) {
			addCriterion("Data =", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataNotEqualTo(String value) {
			addCriterion("Data <>", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataGreaterThan(String value) {
			addCriterion("Data >", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataGreaterThanOrEqualTo(String value) {
			addCriterion("Data >=", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataLessThan(String value) {
			addCriterion("Data <", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataLessThanOrEqualTo(String value) {
			addCriterion("Data <=", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataLike(String value) {
			addCriterion("Data like", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataNotLike(String value) {
			addCriterion("Data not like", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataIn(List<String> values) {
			addCriterion("Data in", values, "data");
			return (Criteria) this;
		}

		public Criteria andDataNotIn(List<String> values) {
			addCriterion("Data not in", values, "data");
			return (Criteria) this;
		}

		public Criteria andDataBetween(String value1, String value2) {
			addCriterion("Data between", value1, value2, "data");
			return (Criteria) this;
		}

		public Criteria andDataNotBetween(String value1, String value2) {
			addCriterion("Data not between", value1, value2, "data");
			return (Criteria) this;
		}

		public Criteria andDateofcreationIsNull() {
			addCriterion("DateOfCreation is null");
			return (Criteria) this;
		}

		public Criteria andDateofcreationIsNotNull() {
			addCriterion("DateOfCreation is not null");
			return (Criteria) this;
		}

		public Criteria andDateofcreationEqualTo(Date value) {
			addCriterion("DateOfCreation =", value, "dateofcreation");
			return (Criteria) this;
		}

		public Criteria andDateofcreationNotEqualTo(Date value) {
			addCriterion("DateOfCreation <>", value, "dateofcreation");
			return (Criteria) this;
		}

		public Criteria andDateofcreationGreaterThan(Date value) {
			addCriterion("DateOfCreation >", value, "dateofcreation");
			return (Criteria) this;
		}

		public Criteria andDateofcreationGreaterThanOrEqualTo(Date value) {
			addCriterion("DateOfCreation >=", value, "dateofcreation");
			return (Criteria) this;
		}

		public Criteria andDateofcreationLessThan(Date value) {
			addCriterion("DateOfCreation <", value, "dateofcreation");
			return (Criteria) this;
		}

		public Criteria andDateofcreationLessThanOrEqualTo(Date value) {
			addCriterion("DateOfCreation <=", value, "dateofcreation");
			return (Criteria) this;
		}

		public Criteria andDateofcreationIn(List<Date> values) {
			addCriterion("DateOfCreation in", values, "dateofcreation");
			return (Criteria) this;
		}

		public Criteria andDateofcreationNotIn(List<Date> values) {
			addCriterion("DateOfCreation not in", values, "dateofcreation");
			return (Criteria) this;
		}

		public Criteria andDateofcreationBetween(Date value1, Date value2) {
			addCriterion("DateOfCreation between", value1, value2, "dateofcreation");
			return (Criteria) this;
		}

		public Criteria andDateofcreationNotBetween(Date value1, Date value2) {
			addCriterion("DateOfCreation not between", value1, value2, "dateofcreation");
			return (Criteria) this;
		}

		public Criteria andUseridIsNull() {
			addCriterion("UserID is null");
			return (Criteria) this;
		}

		public Criteria andUseridIsNotNull() {
			addCriterion("UserID is not null");
			return (Criteria) this;
		}

		public Criteria andUseridEqualTo(Integer value) {
			addCriterion("UserID =", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotEqualTo(Integer value) {
			addCriterion("UserID <>", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridGreaterThan(Integer value) {
			addCriterion("UserID >", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
			addCriterion("UserID >=", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLessThan(Integer value) {
			addCriterion("UserID <", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLessThanOrEqualTo(Integer value) {
			addCriterion("UserID <=", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridIn(List<Integer> values) {
			addCriterion("UserID in", values, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotIn(List<Integer> values) {
			addCriterion("UserID not in", values, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridBetween(Integer value1, Integer value2) {
			addCriterion("UserID between", value1, value2, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotBetween(Integer value1, Integer value2) {
			addCriterion("UserID not between", value1, value2, "userid");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNull() {
			addCriterion("Username is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("Username is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("Username =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("Username <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("Username >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("Username >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("Username <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("Username <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("Username like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("Username not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("Username in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("Username not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("Username between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("Username not between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andTypeidIsNull() {
			addCriterion("TypeID is null");
			return (Criteria) this;
		}

		public Criteria andTypeidIsNotNull() {
			addCriterion("TypeID is not null");
			return (Criteria) this;
		}

		public Criteria andTypeidEqualTo(Integer value) {
			addCriterion("TypeID =", value, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidNotEqualTo(Integer value) {
			addCriterion("TypeID <>", value, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidGreaterThan(Integer value) {
			addCriterion("TypeID >", value, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
			addCriterion("TypeID >=", value, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidLessThan(Integer value) {
			addCriterion("TypeID <", value, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidLessThanOrEqualTo(Integer value) {
			addCriterion("TypeID <=", value, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidIn(List<Integer> values) {
			addCriterion("TypeID in", values, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidNotIn(List<Integer> values) {
			addCriterion("TypeID not in", values, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidBetween(Integer value1, Integer value2) {
			addCriterion("TypeID between", value1, value2, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
			addCriterion("TypeID not between", value1, value2, "typeid");
			return (Criteria) this;
		}

		public Criteria andDeviceidIsNull() {
			addCriterion("DeviceID is null");
			return (Criteria) this;
		}

		public Criteria andDeviceidIsNotNull() {
			addCriterion("DeviceID is not null");
			return (Criteria) this;
		}

		public Criteria andDeviceidEqualTo(Integer value) {
			addCriterion("DeviceID =", value, "deviceid");
			return (Criteria) this;
		}

		public Criteria andDeviceidNotEqualTo(Integer value) {
			addCriterion("DeviceID <>", value, "deviceid");
			return (Criteria) this;
		}

		public Criteria andDeviceidGreaterThan(Integer value) {
			addCriterion("DeviceID >", value, "deviceid");
			return (Criteria) this;
		}

		public Criteria andDeviceidGreaterThanOrEqualTo(Integer value) {
			addCriterion("DeviceID >=", value, "deviceid");
			return (Criteria) this;
		}

		public Criteria andDeviceidLessThan(Integer value) {
			addCriterion("DeviceID <", value, "deviceid");
			return (Criteria) this;
		}

		public Criteria andDeviceidLessThanOrEqualTo(Integer value) {
			addCriterion("DeviceID <=", value, "deviceid");
			return (Criteria) this;
		}

		public Criteria andDeviceidIn(List<Integer> values) {
			addCriterion("DeviceID in", values, "deviceid");
			return (Criteria) this;
		}

		public Criteria andDeviceidNotIn(List<Integer> values) {
			addCriterion("DeviceID not in", values, "deviceid");
			return (Criteria) this;
		}

		public Criteria andDeviceidBetween(Integer value1, Integer value2) {
			addCriterion("DeviceID between", value1, value2, "deviceid");
			return (Criteria) this;
		}

		public Criteria andDeviceidNotBetween(Integer value1, Integer value2) {
			addCriterion("DeviceID not between", value1, value2, "deviceid");
			return (Criteria) this;
		}

		public Criteria andNameLikeInsensitive(String value) {
			addCriterion("upper(Name) like", value.toUpperCase(), "name");
			return (Criteria) this;
		}

		public Criteria andDataLikeInsensitive(String value) {
			addCriterion("upper(Data) like", value.toUpperCase(), "data");
			return (Criteria) this;
		}

		public Criteria andUsernameLikeInsensitive(String value) {
			addCriterion("upper(Username) like", value.toUpperCase(), "username");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table mob.Measurements
     *
     * @mbg.generated do_not_delete_during_merge Sat Jul 28 14:10:31 CEST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}