package com.tvz.mobilnelabapi.mappers.dao;

import com.tvz.mobilnelabapi.model.UserAuthority;
import com.tvz.mobilnelabapi.model.UserAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface UserAuthorityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tvz.user_authority
	 * @mbg.generated  Thu Jul 26 22:42:58 CEST 2018
	 */
	@SelectProvider(type = UserAuthoritySqlProvider.class, method = "countByExample")
	long countByExample(UserAuthorityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tvz.user_authority
	 * @mbg.generated  Thu Jul 26 22:42:58 CEST 2018
	 */
	@DeleteProvider(type = UserAuthoritySqlProvider.class, method = "deleteByExample")
	int deleteByExample(UserAuthorityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tvz.user_authority
	 * @mbg.generated  Thu Jul 26 22:42:58 CEST 2018
	 */
	@Insert({ "insert into tvz.user_authority (user_id, authority_id)",
			"values (#{userId,jdbcType=INTEGER}, #{authorityId,jdbcType=INTEGER})" })
	int insert(UserAuthority record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tvz.user_authority
	 * @mbg.generated  Thu Jul 26 22:42:58 CEST 2018
	 */
	@InsertProvider(type = UserAuthoritySqlProvider.class, method = "insertSelective")
	int insertSelective(UserAuthority record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tvz.user_authority
	 * @mbg.generated  Thu Jul 26 22:42:58 CEST 2018
	 */
	@SelectProvider(type = UserAuthoritySqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
			@Result(column = "authority_id", property = "authorityId", jdbcType = JdbcType.INTEGER) })
	List<UserAuthority> selectByExampleWithRowbounds(UserAuthorityExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tvz.user_authority
	 * @mbg.generated  Thu Jul 26 22:42:58 CEST 2018
	 */
	@SelectProvider(type = UserAuthoritySqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
			@Result(column = "authority_id", property = "authorityId", jdbcType = JdbcType.INTEGER) })
	List<UserAuthority> selectByExample(UserAuthorityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tvz.user_authority
	 * @mbg.generated  Thu Jul 26 22:42:58 CEST 2018
	 */
	@UpdateProvider(type = UserAuthoritySqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") UserAuthority record, @Param("example") UserAuthorityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tvz.user_authority
	 * @mbg.generated  Thu Jul 26 22:42:58 CEST 2018
	 */
	@UpdateProvider(type = UserAuthoritySqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") UserAuthority record, @Param("example") UserAuthorityExample example);
}