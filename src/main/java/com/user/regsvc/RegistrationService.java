package com.user.regsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;



@SpringBootApplication
@SpringBootConfiguration 
public class RegistrationService extends SpringBootServletInitializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SpringApplication.run(RegistrationService.class, args);
	}
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RegistrationService.class);
    }

}
