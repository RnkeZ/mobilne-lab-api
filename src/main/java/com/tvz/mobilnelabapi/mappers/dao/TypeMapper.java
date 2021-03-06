package com.tvz.mobilnelabapi.mappers.dao;

import com.tvz.mobilnelabapi.model.Type;
import com.tvz.mobilnelabapi.model.TypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface TypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Type
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    @SelectProvider(type=TypeSqlProvider.class, method="countByExample")
    long countByExample(TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Type
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    @DeleteProvider(type=TypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Type
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    @Delete({
        "delete from mob.Type",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Type
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    @Insert({
        "insert into mob.Type (ID, Name)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR})"
    })
    int insert(Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Type
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    @InsertProvider(type=TypeSqlProvider.class, method="insertSelective")
    int insertSelective(Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Type
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    @SelectProvider(type=TypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    List<Type> selectByExampleWithRowbounds(TypeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Type
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    @SelectProvider(type=TypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    List<Type> selectByExample(TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Type
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    @Select({
        "select",
        "ID, Name",
        "from mob.Type",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    Type selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Type
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    @UpdateProvider(type=TypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Type record, @Param("example") TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Type
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    @UpdateProvider(type=TypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Type record, @Param("example") TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Type
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    @UpdateProvider(type=TypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mob.Type
     *
     * @mbg.generated Sun Jul 29 14:44:38 CEST 2018
     */
    @Update({
        "update mob.Type",
        "set Name = #{name,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Type record);
}