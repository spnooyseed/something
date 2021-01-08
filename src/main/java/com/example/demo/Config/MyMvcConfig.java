package com.example.demo.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author spnooyseed
 * Date on 2021/1/7  16:56
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
//    public WebMvcConfigurer webMvcConfigurer() {
//        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/").setViewName("main");
//                registry.addViewController("/toRegister").setViewName("register");
//                registry.addViewController("/toLogin").setViewName("login");
//            };
//        };
//        System.out.println("转发了") ;
//        return  webMvcConfigurer ;
//    }
}
