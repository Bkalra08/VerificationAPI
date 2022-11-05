package com.Verification.VerificationAPI2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Verification API2",version = "1.0" , description= "Verification"))

public class VerificationApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(VerificationApi2Application.class, args);
	}

}
