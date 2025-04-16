package com.boot.formbased.auth.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//to scan (@EntityScan) the package for utilize the entities of other modules
//@EntityScan(basePackages = {"com.boot.master.model"}) 
@SpringBootApplication
public class BootFormBasedAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootFormBasedAuthApplication.class, args);
	}

}
