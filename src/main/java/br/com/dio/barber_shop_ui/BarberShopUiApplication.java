package br.com.dio.barber_shop_ui;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(servers  = { @Server(url = "/", description = "Defualt Server URL")})
public class BarberShopUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarberShopUiApplication.class, args);
	}

}
