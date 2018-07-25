package com.tvz.mobilnelabapi.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

//@Configuration()
//@ConfigurationProperties(prefix="spring.datasource.secondary")
//@MapperScan(basePackages = "com.tvz.mobilnelabapi", sqlSessionTemplateRef = "SecondarySqlSessionTemplate")
public class SecondaryDatabaseConfiguration extends HikariConfig {
//    @Bean (name="Secondary")
//    public DataSource dataSource() {
//    	HikariDataSource hk = new HikariDataSource(this);
//          return hk;
//    }
//    
//    @Bean(name = "SecondarySqlSessionFactory")
//	public SqlSessionFactory SecondarySqlSessionFactory(@Qualifier("Secondary") DataSource dataSource)
//			throws Exception {
//		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//		bean.setDataSource(dataSource);
//		bean.setMapperLocations(
//				new PathMatchingResourcePatternResolver().getResources("com/tvz/mobilnelabapi/*.java"));
//		return bean.getObject();
//	}
//
//	@Bean(name = "SecondaryTransactionManager")
//	public DataSourceTransactionManager SecondaryTransactionManager(@Qualifier("Secondary") DataSource dataSource) {
//		return new DataSourceTransactionManager(dataSource);
//	}
//
//	@Bean(name = "SecondarySqlSessionTemplate")
//	public SqlSessionTemplate SecondarySqlSessionTemplate(
//			@Qualifier("SecondarySqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}

}
