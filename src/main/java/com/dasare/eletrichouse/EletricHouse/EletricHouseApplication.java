package com.dasare.eletrichouse.EletricHouse;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "EletricHouse", version = "1.0", description = "calculo Eletrico"))

public class EletricHouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EletricHouseApplication.class, args);
	}

}
