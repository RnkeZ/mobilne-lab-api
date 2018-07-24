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
@MapperScan(basePackages = "com.tvz.mobilnelabapi.mappers.dao", sqlSessionTemplateRef = "TVZSqlSessionTemplate")
public class TVZDatabaseConfiguration extends HikariConfig {
	@Bean (name="TVZ")
    @Primary
    public DataSource dataSource() {
          return new HikariDataSource(this);
    }
	
	@Bean(name = "TVZSqlSessionFactory")
	@Primary
	public SqlSessionFactory TVZSqlSessionFactory(@Qualifier("TVZ") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("com/tvz/mobilnelabapi/mappers/dao/*.java"));
		return bean.getObject();
	}
	
	@Bean(name = "TVZTransactionManager")
	@Primary
	public DataSourceTransactionManager TVZTransactionManager(@Qualifier("TVZ") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "TVZSqlSessionTemplate")
	@Primary
	public SqlSessionTemplate TVZSqlSessionTemplate(
			@Qualifier("TVZSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
	

}
