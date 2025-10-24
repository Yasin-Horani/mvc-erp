package com.yasin.mvc_erp;

import com.yasin.mvc_erp.utilities.EnvLoaderUtility;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcErpApplication {

	public static void main(String[] args) {
		EnvLoaderUtility envLoaderUtility = new EnvLoaderUtility();
		envLoaderUtility.loadIntoSystemProperties();
		SpringApplication.run(MvcErpApplication.class, args);
	}

}
