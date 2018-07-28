package com.tvz.mobilnelabapi.mappers.dao;

import com.tvz.mobilnelabapi.model.User;
import com.tvz.mobilnelabapi.model.UserExample.Criteria;
import com.tvz.mobilnelabapi.model.UserExample.Criterion;
import com.tvz.mobilnelabapi.model.UserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table [mob].[user]
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public String countByExample(UserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("[mob].[user]");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table [mob].[user]
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public String deleteByExample(UserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("[mob].[user]");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table [mob].[user]
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("[mob].[user]");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("Username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("Password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getFirstname() != null) {
            sql.VALUES("Firstname", "#{firstname,jdbcType=VARCHAR}");
        }
        
        if (record.getLastname() != null) {
            sql.VALUES("Lastname", "#{lastname,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("Email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getEnabled() != null) {
            sql.VALUES("Enabled", "#{enabled,jdbcType=BIT}");
        }
        
        if (record.getLastpasswordresetdate() != null) {
            sql.VALUES("LastPasswordResetDate", "#{lastpasswordresetdate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table [mob].[user]
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public String selectByExample(UserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("Username");
        sql.SELECT("Password");
        sql.SELECT("Firstname");
        sql.SELECT("Lastname");
        sql.SELECT("Email");
        sql.SELECT("Enabled");
        sql.SELECT("LastPasswordResetDate");
        sql.FROM("[mob].[user]");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table [mob].[user]
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        User record = (User) parameter.get("record");
        UserExample example = (UserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("[mob].[user]");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("Username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("Password = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getFirstname() != null) {
            sql.SET("Firstname = #{record.firstname,jdbcType=VARCHAR}");
        }
        
        if (record.getLastname() != null) {
            sql.SET("Lastname = #{record.lastname,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("Email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getEnabled() != null) {
            sql.SET("Enabled = #{record.enabled,jdbcType=BIT}");
        }
        
        if (record.getLastpasswordresetdate() != null) {
            sql.SET("LastPasswordResetDate = #{record.lastpasswordresetdate,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table [mob].[user]
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("[mob].[user]");
        
        sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        sql.SET("Username = #{record.username,jdbcType=VARCHAR}");
        sql.SET("Password = #{record.password,jdbcType=VARCHAR}");
        sql.SET("Firstname = #{record.firstname,jdbcType=VARCHAR}");
        sql.SET("Lastname = #{record.lastname,jdbcType=VARCHAR}");
        sql.SET("Email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("Enabled = #{record.enabled,jdbcType=BIT}");
        sql.SET("LastPasswordResetDate = #{record.lastpasswordresetdate,jdbcType=TIMESTAMP}");
        
        UserExample example = (UserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table [mob].[user]
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("[mob].[user]");
        
        if (record.getUsername() != null) {
            sql.SET("Username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("Password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getFirstname() != null) {
            sql.SET("Firstname = #{firstname,jdbcType=VARCHAR}");
        }
        
        if (record.getLastname() != null) {
            sql.SET("Lastname = #{lastname,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("Email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getEnabled() != null) {
            sql.SET("Enabled = #{enabled,jdbcType=BIT}");
        }
        
        if (record.getLastpasswordresetdate() != null) {
            sql.SET("LastPasswordResetDate = #{lastpasswordresetdate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table [mob].[user]
     *
     * @mbg.generated Sat Jul 28 14:10:31 CEST 2018
     */
    protected void applyWhere(SQL sql, UserExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}