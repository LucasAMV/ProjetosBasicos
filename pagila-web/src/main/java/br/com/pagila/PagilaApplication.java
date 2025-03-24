package br.com.pagila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class PagilaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagilaApplication.class, args);
	}

}
