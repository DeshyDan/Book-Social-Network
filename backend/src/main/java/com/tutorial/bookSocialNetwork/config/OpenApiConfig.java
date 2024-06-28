package com.tutorial.bookSocialNetwork.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Deshy",
                        email = "thisismyemail",
                        url = "https://github.com/DeshyDan"
                ),
                description = "Open API documentation for Spring Security",
                title = "OpenAPI specification",
                version = "1.0"

        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost/api/v1"

                ),
                @Server(
                        description = "PROD ENV",
                        url = "just fo testing"
                )
        }, security = {
        @SecurityRequirement(
                name = "bearerAuth"
        )
}
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
