package com.as.traficchallan.traficchallan;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class TraficChallanApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraficChallanApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfig() {
		return new Docket(DocumentationType.SWAGGER_2).select()
//				.paths(PathSelectors.ant("*"))
				.apis(RequestHandlerSelectors.basePackage("com.as.traficchallan.traficchallan"))
				.build()
				.apiInfo(apiInfo());
	}
	
	public ApiInfo apiInfo(){
		return new ApiInfo("Traffic Challan Api",
				"This simple Api is used to store and manage Traffic Challans",
				"1.0",
				"", new Contact("Ameen Shariff", "https://github.com/ameenshariff","ameenshariff0880@gmail.com"), "", "",Collections.emptyList());
		
	}

}
