package com.kdpwallet.kdpwallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages = {"com.kdpwallet.kdpwallet.controller"})
public class KdpwalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(KdpwalletApplication.class, args);
	}

}
