package com.tvz.mobilnelabapi.mappers.dao;

import com.tvz.mobilnelabapi.composite.MeasurementsComposite;
import com.tvz.mobilnelabapi.model.Device;
import com.tvz.mobilnelabapi.model.Measurements;
import com.tvz.mobilnelabapi.model.MeasurementsExample;
import com.tvz.mobilnelabapi.model.Type;

import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MeasurementsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	@SelectProvider(type = MeasurementsSqlProvider.class, method = "countByExample")
	long countByExample(MeasurementsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	@DeleteProvider(type = MeasurementsSqlProvider.class, method = "deleteByExample")
	int deleteByExample(MeasurementsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	@Delete({ "delete from mob.Measurements", "where ID = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	@Insert({ "insert into mob.Measurements (ID, Name, ", "Data, DateOfCreation, ", "UserID, Username, ",
			"TypeID, DeviceID)", "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
			"#{data,jdbcType=NVARCHAR}, #{dateofcreation,jdbcType=TIMESTAMP}, ",
			"#{userid,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
			"#{typeid,jdbcType=INTEGER}, #{deviceid,jdbcType=INTEGER})" })
	int insert(Measurements record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	@InsertProvider(type = MeasurementsSqlProvider.class, method = "insertSelective")
	int insertSelective(Measurements record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	@SelectProvider(type = MeasurementsSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "ID", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "Name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "Data", property = "data", jdbcType = JdbcType.NVARCHAR),
			@Result(column = "DateOfCreation", property = "dateofcreation", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "UserID", property = "userid", jdbcType = JdbcType.INTEGER),
			@Result(column = "Username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "TypeID", property = "typeid", jdbcType = JdbcType.INTEGER),
			@Result(column = "DeviceID", property = "deviceid", jdbcType = JdbcType.INTEGER) })
	List<Measurements> selectByExampleWithRowbounds(MeasurementsExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	@SelectProvider(type = MeasurementsSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "ID", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "Name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "Data", property = "data", jdbcType = JdbcType.NVARCHAR),
			@Result(column = "DateOfCreation", property = "dateofcreation", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "UserID", property = "userid", jdbcType = JdbcType.INTEGER),
			@Result(column = "Username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "TypeID", property = "typeid", jdbcType = JdbcType.INTEGER),
			@Result(column = "DeviceID", property = "deviceid", jdbcType = JdbcType.INTEGER) })
	List<Measurements> selectByExample(MeasurementsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	@Select({ "select", "ID, Name, Data, DateOfCreation, UserID, Username, TypeID, DeviceID", "from mob.Measurements",
			"where ID = #{id,jdbcType=INTEGER}" })
	@Results({ @Result(column = "ID", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "Name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "Data", property = "data", jdbcType = JdbcType.NVARCHAR),
			@Result(column = "DateOfCreation", property = "dateofcreation", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "UserID", property = "userid", jdbcType = JdbcType.INTEGER),
			@Result(column = "Username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "TypeID", property = "typeid", jdbcType = JdbcType.INTEGER),
			@Result(column = "DeviceID", property = "deviceid", jdbcType = JdbcType.INTEGER) })
	Measurements selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	@UpdateProvider(type = MeasurementsSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") Measurements record, @Param("example") MeasurementsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	@UpdateProvider(type = MeasurementsSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") Measurements record, @Param("example") MeasurementsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	@UpdateProvider(type = MeasurementsSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Measurements record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mob.Measurements
	 * @mbg.generated  Sun Jul 29 14:44:38 CEST 2018
	 */
	@Update({ "update mob.Measurements", "set Name = #{name,jdbcType=VARCHAR},", "Data = #{data,jdbcType=NVARCHAR},",
			"DateOfCreation = #{dateofcreation,jdbcType=TIMESTAMP},", "UserID = #{userid,jdbcType=INTEGER},",
			"Username = #{username,jdbcType=VARCHAR},", "TypeID = #{typeid,jdbcType=INTEGER},",
			"DeviceID = #{deviceid,jdbcType=INTEGER}", "where ID = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(Measurements record);
	
	@SelectProvider(type = MeasurementsSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "ID", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "Name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "Data", property = "data", jdbcType = JdbcType.NVARCHAR),
			@Result(column = "DateOfCreation", property = "dateofcreation", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "UserID", property = "userid", jdbcType = JdbcType.INTEGER),
			@Result(column = "Username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "TypeID", property = "typeid", jdbcType = JdbcType.INTEGER),
			@Result(column = "DeviceID", property = "deviceid", jdbcType = JdbcType.INTEGER),
			@Result(column = "DeviceID", property = "device", javaType = Device.class, one = @One(select = "com.tvz.mobilnelabapi.mappers.dao.DeviceMapper.selectByPrimaryKey")),
			@Result(column = "TypeID", property = "type", javaType = Type.class, one = @One(select = "com.tvz.mobilnelabapi.mappers.dao.TypeMapper.selectByPrimaryKey"))})
	List<MeasurementsComposite> selectCompositeByExample(MeasurementsExample example);
}