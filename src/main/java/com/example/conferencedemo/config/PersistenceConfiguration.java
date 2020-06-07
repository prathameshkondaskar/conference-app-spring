package com.example.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/conference_app");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("pass@123");
        System.out.println("My custom data sourcw has been called");
        return  dataSourceBuilder.build();

    }
}
