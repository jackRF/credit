package com.zdmoney.credit.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EntityScan("com.zdmoney.credit.domain")
@EnableJpaRepositories(basePackages = "com.zdmoney.credit.dao")
@ComponentScan("com.zdmoney.credit")
public class Bootstrap extends SpringBootServletInitializer  {
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Bootstrap.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(Bootstrap.class, args);
	}
}
