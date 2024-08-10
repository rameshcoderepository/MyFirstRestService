//package com.uniq.MyFirstRestService.MyFirstRestService.bean;
//
//import java.util.List;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebMvcConfig implements WebMvcConfigurer {
//
//    @Override
//    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.add(mappingJackson2XmlHttpMessageConverter());
//    }
//
//    @Bean
//    public MappingJackson2XmlHttpMessageConverter mappingJackson2XmlHttpMessageConverter() {
//        MappingJackson2XmlHttpMessageConverter converter = new MappingJackson2XmlHttpMessageConverter();
//        // Set supported media types, if necessary
//        return converter;
//    }
//}
//
