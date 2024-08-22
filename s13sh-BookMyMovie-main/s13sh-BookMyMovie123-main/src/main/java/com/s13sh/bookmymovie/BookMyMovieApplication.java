package com.s13sh.bookmymovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BookMyMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyMovieApplication.class, args);
	}

}