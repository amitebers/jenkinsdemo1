package com.amitebers.book;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TestConfig {

	@Bean
	@Scope("prototype")
	public GreetingWebClient GreetingWebClient() {
		return new GreetingWebClient();
	}

}
