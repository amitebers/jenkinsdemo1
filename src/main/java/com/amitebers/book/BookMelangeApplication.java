package com.amitebers.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BookMelangeApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(BookMelangeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		GreetingWebClient gwc = applicationContext.getBean(GreetingWebClient.class);
		System.out.println(gwc.getResult());
	}

}
