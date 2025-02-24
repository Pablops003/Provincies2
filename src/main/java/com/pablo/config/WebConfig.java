package com.pablo.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
         .allowedOrigins("http://localhost:9001")
         .allowedMethods("GET", "POST", "PUT", "DELETE")
         .allowedHeaders("*");
         }}



