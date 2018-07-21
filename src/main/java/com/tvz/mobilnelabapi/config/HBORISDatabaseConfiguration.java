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
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration()
@ConfigurationProperties(prefix="spring.datasource")
@MapperScan(basePackages = "com.tvz.mobilnelabapi.mappers.dao", sqlSessionTemplateRef = "HBORISSqlSessionTemplate")
public class HBORISDatabaseConfiguration extends HikariConfig {
	@Bean (name="HBORIS")
    @Primary
    public DataSource dataSource() {
          return new HikariDataSource(this);
    }
	
	@Bean(name = "HBORISSqlSessionFactory")
	@Primary
	public SqlSessionFactory HBORISSqlSessionFactory(@Qualifier("HBORIS") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("com/tvz/mobilnelabapi/mappers/dao/*.java"));
		return bean.getObject();
	}
	
	@Bean(name = "HBORISTransactionManager")
	@Primary
	public DataSourceTransactionManager HBORISTransactionManager(@Qualifier("HBORIS") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "HBORISSqlSessionTemplate")
	@Primary
	public SqlSessionTemplate HBORISSqlSessionTemplate(
			@Qualifier("HBORISSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
	

}
