package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import services.InitialRunService;


@ComponentScan({"services"})
@ComponentScan({"entities"})
@ComponentScan({"repositories"})
@SpringBootApplication
public class EzParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EzParkingApplication.class, args);
	}
	
	@Bean
    @Transactional
    public CommandLineRunner demo(InitialRunService initialRunService) {
		return (args) -> {
			initialRunService.inserts();
			};
    
    
	}
}
