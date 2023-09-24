package com.example.madhu.configaration;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.example.madhu.configaration")
public class AppConfig {

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
		driverManagerDataSource.setUsername("postgres");
		driverManagerDataSource.setPassword("madhu");
		driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
		return driverManagerDataSource;
		
		
		
	}
}
