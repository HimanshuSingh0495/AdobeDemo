package com.adobe.romannumeralapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // Redirect all unknown routes to index.html
        registry.addViewController("/{spring:[^\\.]*}").setViewName("forward:/index.html");
    }
}
