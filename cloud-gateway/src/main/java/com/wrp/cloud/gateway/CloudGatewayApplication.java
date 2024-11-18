package com.wrp.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wrp
 * @since 2024年11月18日 22:34
 */
@RestController
@SpringBootApplication
public class CloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class, args);
    }

    @GetMapping("demo")
    public String demo() {
        return System.currentTimeMillis() + " ms";
    }
}
