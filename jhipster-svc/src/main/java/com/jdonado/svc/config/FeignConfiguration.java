package com.jdonado.svc.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.jdonado.svc")
public class FeignConfiguration {

}
