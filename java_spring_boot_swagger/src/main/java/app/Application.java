package app;

import java.util.Collections;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ConfigurationProperties
@ComponentScan(basePackages = { "com.example" })
@EnableSwagger2
public class Application {

	
	public static void main(String[] args) {
				
		SpringApplication.run(Application.class, args);
	}


	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}

	private static ApiInfo apiInfo() {
		return new ApiInfo("EXAMPLE REST API", "An example of Swagger API with Spring Boot.", "API example",
				"Terms of service",
				new Contact("Jose Maria Alvarez", "http://www.josemalvarez.es", "josemaria.alvarez@uc3m.es"),
				"Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
	}

}