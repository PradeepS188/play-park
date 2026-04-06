package com.playpark.person_register;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "PLAYPARK - Person Register Microservices Documentation",
				description = "It handles people information",
				contact = @Contact(
						name = "Pradeep Sugumaran",
						email = "pradeepsugumaran1818@gmail.com"
				)
		),
		servers = @Server(
				description = "It's hosted in LocalHost",
				url = "http://localhost:8081"
		)
)
public class PersonRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonRegisterApplication.class, args);
	}

}
