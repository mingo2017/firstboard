package com.ming.configuration;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration //설정
public class DataSourceConfiguration {
//데이터 베이스 연동 설정
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	@Value("${spring.datasource.pool-size}")
	private int poolSize;
	
	@Bean //spring에 등록하기
	public DataSource dataSource(){ //오픈소스
		HikariConfig hikariConfig = new HikariConfig();

		hikariConfig.setJdbcUrl(url);
		hikariConfig.setUsername(username);
		hikariConfig.setPassword(password);
		hikariConfig.setDriverClassName(driverClassName);
		hikariConfig.setMinimumIdle(poolSize);
		hikariConfig.setMaximumPoolSize(poolSize);
		
		return new HikariDataSource(hikariConfig);
	}
	
}
