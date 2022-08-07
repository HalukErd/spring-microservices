package com.halukerd.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = {
                "com.halukerd.customer",
                "com.halukerd.amqp",
        }
)
@EnableJpaRepositories
@EnableEurekaClient
@EnableFeignClients(
        basePackages = "com.halukerd.clients"
)
@PropertySources({
        @PropertySource("classpath:clients-${spring-profiles-active}.properties")
})
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
