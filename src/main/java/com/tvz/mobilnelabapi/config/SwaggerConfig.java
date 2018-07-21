package com.tvz.mobilnelabapi.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import com.google.common.base.Predicates;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Value("${app.version}")
	private String API_VERSION;
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Mobilne lab REST services V" + getApiVersion())
				.apiInfo(getApiInfo())
				.select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.paths(Predicates.not(PathSelectors.regex("/error")))
				.build();
	}

	private ApiInfo getApiInfo() {
		Contact contact = new Contact("TVZ", "http://tvz.hr", "tvz@tvz.hr");
		return new ApiInfoBuilder()
				.title("TVZ Mobilne lab REST api dokumentacija")
				.description("Dokumentacija internog rest api-ja Mobilne lab REST za Tehničko veleučilište u Zagrebu. ")
				.version(getApiVersion())
				.license("Apache 2.0 \n")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
				.contact(contact)
				.build();
	}
	
	private String getApiVersion() {
		String apiVersion = API_VERSION;
		return apiVersion;
	}
	
}
