package com.toyota.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan({"com.toyota.*","com.toyota.dao"})
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@EnableJpaRepositories("com.toyota.dao")
@EntityScan("com.toyota.model")
public class MainTayota {
	public static void main(String[] args) {
        SpringApplication.run(MainTayota.class, args);
    }

}
 