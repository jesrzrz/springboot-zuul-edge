package es.jr.sbzu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class EdgeServiceApp {
	 public static void main(String[] args) {		 
	        SpringApplication.run(EdgeServiceApp.class, args);
    }
	 
	 @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
}
