package com.zpj.springbootdemo.server.support;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class MyWebAppConfigure extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/myresources/**").addResourceLocations("classpath:/myresources/");
        super.addResourceHandlers(registry);
    }
}
