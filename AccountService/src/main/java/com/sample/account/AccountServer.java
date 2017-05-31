package com.sample.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sample.account.services.AccountRepository;

@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableJpaRepositories(basePackages="com.sample.account.services")
@SpringBootApplication(scanBasePackages="com.sample.account.services")
public class AccountServer {

	
	@Autowired
	protected AccountRepository accountRepository;
	
	public static void main(String[] args) {
		 // Will configure using accounts-service.yml
        System.setProperty("spring.config.name", "account-service");
		SpringApplication.run(AccountServer.class, args);
	}
	
	
   
	
}
