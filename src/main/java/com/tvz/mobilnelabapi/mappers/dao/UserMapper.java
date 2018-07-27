package com.tvz.mobilnelabapi.mappers.dao;

import com.tvz.mobilnelabapi.composite.UserComposite;
import com.tvz.mobilnelabapi.model.User;
import com.tvz.mobilnelabapi.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table [tvz].[user]
	 * 
	 * @mbg.generated Thu Jul 26 22:42:58 CEST 2018
	 */
	@SelectProvider(type = UserSqlProvider.class, method = "countByExample")
	long countByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table [tvz].[user]
	 * 
	 * @mbg.generated Thu Jul 26 22:42:58 CEST 2018
	 */
	@DeleteProvider(type = UserSqlProvider.class, method = "deleteByExample")
	int deleteByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table [tvz].[user]
	 * 
	 * @mbg.generated Thu Jul 26 22:42:58 CEST 2018
	 */
	@Delete({ "delete from [tvz].[user]", "where id = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table [tvz].[user]
	 * 
	 * @mbg.generated Thu Jul 26 22:42:58 CEST 2018
	 */
	@Insert({ "insert into [tvz].[user] (id, username, ", "password, firstname, ", "lastname, email, ",
			"enabled, lastpasswordresetdate)", "values (#{id,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
			"#{password,jdbcType=VARCHAR}, #{firstname,jdbcType=VARCHAR}, ",
			"#{lastname,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
			"#{enabled,jdbcType=BIT}, #{lastpasswordresetdate,jdbcType=TIMESTAMP})" })
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table [tvz].[user]
	 * 
	 * @mbg.generated Thu Jul 26 22:42:58 CEST 2018
	 */
	@InsertProvider(type = UserSqlProvider.class, method = "insertSelective")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table [tvz].[user]
	 * 
	 * @mbg.generated Thu Jul 26 22:42:58 CEST 2018
	 */
	@SelectProvider(type = UserSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
			@Result(column = "firstname", property = "firstname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "lastname", property = "lastname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
			@Result(column = "enabled", property = "enabled", jdbcType = JdbcType.BIT),
			@Result(column = "lastpasswordresetdate", property = "lastpasswordresetdate", jdbcType = JdbcType.TIMESTAMP) })
	List<User> selectByExampleWithRowbounds(UserExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table [tvz].[user]
	 * 
	 * @mbg.generated Thu Jul 26 22:42:58 CEST 2018
	 */
	@SelectProvider(type = UserSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
			@Result(column = "firstname", property = "firstname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "lastname", property = "lastname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
			@Result(column = "enabled", property = "enabled", jdbcType = JdbcType.BIT),
			@Result(column = "lastpasswordresetdate", property = "lastpasswordresetdate", jdbcType = JdbcType.TIMESTAMP) })
	List<User> selectByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table [tvz].[user]
	 * 
	 * @mbg.generated Thu Jul 26 22:42:58 CEST 2018
	 */
	@Select({ "select", "id, username, password, firstname, lastname, email, enabled, lastpasswordresetdate",
			"from [tvz].[user]", "where id = #{id,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
			@Result(column = "firstname", property = "firstname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "lastname", property = "lastname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
			@Result(column = "enabled", property = "enabled", jdbcType = JdbcType.BIT),
			@Result(column = "lastpasswordresetdate", property = "lastpasswordresetdate", jdbcType = JdbcType.TIMESTAMP) })
	User selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table [tvz].[user]
	 * 
	 * @mbg.generated Thu Jul 26 22:42:58 CEST 2018
	 */
	@UpdateProvider(type = UserSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table [tvz].[user]
	 * 
	 * @mbg.generated Thu Jul 26 22:42:58 CEST 2018
	 */
	@UpdateProvider(type = UserSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table [tvz].[user]
	 * 
	 * @mbg.generated Thu Jul 26 22:42:58 CEST 2018
	 */
	@UpdateProvider(type = UserSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table [tvz].[user]
	 * 
	 * @mbg.generated Thu Jul 26 22:42:58 CEST 2018
	 */
	@Update({ "update [tvz].[user]", "set username = #{username,jdbcType=VARCHAR},",
			"password = #{password,jdbcType=VARCHAR},", "firstname = #{firstname,jdbcType=VARCHAR},",
			"lastname = #{lastname,jdbcType=VARCHAR},", "email = #{email,jdbcType=VARCHAR},",
			"enabled = #{enabled,jdbcType=BIT},", "lastpasswordresetdate = #{lastpasswordresetdate,jdbcType=TIMESTAMP}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(User record);

	@Select({ "select", "id, username, password, firstname, lastname, email, enabled, lastpasswordresetdate",
			"from [tvz].[user]", "where username = #{username,jdbcType=VARCHAR}" })
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
			@Result(column = "firstname", property = "firstname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "lastname", property = "lastname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
			@Result(column = "enabled", property = "enabled", jdbcType = JdbcType.BIT),
			@Result(column = "lastpasswordresetdate", property = "lastpasswordresetdate", jdbcType = JdbcType.TIMESTAMP) })
	User selectByUsername(String username);

	@SelectProvider(type = UserSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
			@Result(column = "firstname", property = "firstname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "lastname", property = "lastname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
			@Result(column = "enabled", property = "enabled", jdbcType = JdbcType.BIT),
			@Result(column = "lastpasswordresetdate", property = "lastpasswordresetdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "id", property = "authority", javaType = List.class, many = @Many(select = "com.tvz.mobilnelabapi.mappers.dao.AuthorityMapper.selectAuthorityByUserId"))})
	List<UserComposite> selectByExampleComposites(UserExample example);
}