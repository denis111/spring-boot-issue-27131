package com.example.springbootissues27131.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Configuration
public class UserConfig {

  @Bean
  @Lazy(false)
  @DependsOn("liquibase")
  public SpringLiquibase clientLiquibase() {
    var liquibase = new SpringLiquibase();
    liquibase.setShouldRun(false);
    return liquibase;
  }

  @Bean
  @Lazy(false)
  public SpringLiquibase liquibase() {
    var liquibase = new SpringLiquibase();
    liquibase.setShouldRun(false);
    return liquibase;
  }
}
