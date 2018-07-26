package com.tvz.mobilnelabapi.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import com.google.common.base.Predicates;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Value("${app.version}")
	private String API_VERSION;

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Mobilne lab REST services V" + getApiVersion())
				.apiInfo(getApiInfo()).select().apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.paths(Predicates.not(PathSelectors.regex("/error"))).build().securitySchemes(Arrays.asList(apiKey()))
				.securityContexts(Arrays.asList(securityContext()));
	}

	private ApiInfo getApiInfo() {
		Contact contact = new Contact("TVZ", "http://tvz.hr", "tvz@tvz.hr");
		return new ApiInfoBuilder().title("TVZ Mobilne lab REST api dokumentacija")
				.description("Dokumentacija internog rest api-ja Mobilne lab REST za Tehničko veleučilište u Zagrebu. ")
				.version(getApiVersion()).license("Apache 2.0 \n")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0").contact(contact).build();
	}

	private String getApiVersion() {
		String apiVersion = API_VERSION;
		return apiVersion;
	}

	private ApiKey apiKey() {
        return new ApiKey("apiKey", "Authorization", "header");
    }
	
	private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.regex("/api.*"))
                .build();
    }

	private List<SecurityReference> defaultAuth() {
		AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
		AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
		authorizationScopes[0] = authorizationScope;
		return Arrays.asList(new SecurityReference("apiKey", authorizationScopes));
	}

}
