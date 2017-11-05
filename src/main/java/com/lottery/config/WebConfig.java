package com.lottery.config;


import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

  @Value("${devMode:false}")
  private String devMode;

  //
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
      .allowedMethods("GET", "POST", "PATCH", "DELETE");
  }



  @Bean
  public Filter characterEncodingFilter() {
    CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
    characterEncodingFilter.setEncoding("UTF-8");
    characterEncodingFilter.setForceEncoding(true);
    return characterEncodingFilter;
  }

 @Override
  public void addInterceptors(InterceptorRegistry registry) {
    //if ("true".equals(devMode)) return;

  /*  registry.addInterceptor(new AuthorityInterceptor());
    super.addInterceptors(registry);*/
  }
 
   @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    // TODO Auto-generated method stub
    //super.configureDefaultServletHandling(configurer);
     configurer.enable();
  }
   
  @Bean 
  public InternalResourceViewResolver viewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
   /* resolver.setPrefix("/WEB-INF/jsp/");*/
    resolver.setPrefix("/jsp/");
    resolver.setSuffix(".jsp");
    return resolver;
  }
  
  
 
}