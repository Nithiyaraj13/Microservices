package com.microservices.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservices RESTAPI Documentation",
				description = "EazyBank Accounts microservices REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Nithiyaraj",
						email = "nithiyarajbtech@gmail.com",
						url = "https://www.eazybytes.com"

				),
				license = @License(
						name = "Apache 2.0",
						url = "https://eazybytes.com"

				)

		),
		externalDocs = @ExternalDocumentation(
				description = "EazyBank Account microservices REST API documentation",
				url = "https://www.eazybytes.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
