package org.spring.tech_registry.config;



import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Tech Registry API", version = "1.0", description = "API for managing tech registry"))
public class OpenApiConfig {
}