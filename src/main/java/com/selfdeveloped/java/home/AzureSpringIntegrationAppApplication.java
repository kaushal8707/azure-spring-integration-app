package com.selfdeveloped.java.home;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AzureSpringIntegrationAppApplication {

	@GetMapping("/message")
	public String message() {
		return "Congrats ! Your App deployed Successfully on Azure";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AzureSpringIntegrationAppApplication.class, args);
	}

}