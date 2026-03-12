package com.backend.bitblock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BitblockApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitblockApplication.class, args);
	}

}
