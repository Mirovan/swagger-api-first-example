//package com.example.demo.config;
//
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import org.springdoc.core.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.core.env.Environment;
//
//@Configuration
//public class SwaggerConfig {
//
//    @Bean
//    @Profile("prod")
//    public GroupedOpenApi publicApi() {
//        return GroupedOpenApi.builder()
//                .group("api")
//                .packagesToScan("com.example.demo")
//                .pathsToMatch("/api/**")
//                .build();
//    }
//
//    @Bean
//    public OpenAPI springShopOpenAPI(final Environment env) {
//        return new OpenAPI()
//                .info(new Info()
//                        .title("my title")
//                        .description("Сервис промоакций и промокодов")
//                        .contact(new Contact()
//                                .name("КОРУС Консалтинг СНГ")
//                                .email("info@esphere.ru")
//                                .url("https://www.esphere.ru"))
//                );
//    }
//}
