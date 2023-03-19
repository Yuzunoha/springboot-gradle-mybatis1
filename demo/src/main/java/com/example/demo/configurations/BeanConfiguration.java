package com.example.demo.configurations;

import com.example.demo.beans.MessageBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

  @Bean
  public MessageBean messageBean() {
    return new MessageBean();
  }
}
