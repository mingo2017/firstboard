package com.ming.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String pathPatterns = "/**";
        String locations = "classpath:static/";
        int cachePeriod = 0;

        if (!registry.hasMappingForPattern("/")) {
            registry.addResourceHandler("/").addResourceLocations(
                    "classpath:/templates/*");
        }

        registry.addResourceHandler(pathPatterns)
                .addResourceLocations(locations)
                .setCachePeriod(cachePeriod);
    }
}