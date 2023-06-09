package com.example.demo.swaggerconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2

public class SwaggerConfiguration {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo")).paths(PathSelectors.any()).build();
				
	}

//	@SuppressWarnings("deprecation")
//	private ApiInfo apid2etails() {
//		return new ApiInfo("Pass Project", "This is a demo project that follow the standards when we writing API's",
//				"1.0.0", "TOS", "Rami Samara", "licence", "licence URL");
//
//	}
}
