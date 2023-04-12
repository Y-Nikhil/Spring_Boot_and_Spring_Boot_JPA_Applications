package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Bookss;

@SpringBootApplication
public class SpringbootJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootJpaApplication.class, args);
		
		BookRepository repo = context.getBean(BookRepository.class);
		
		Bookss b = new Bookss();
		
		b.setBookId(1010);
		b.setBookName("Nikh");
		b.setBookPrice(1000.00);
		
		repo.save(b);
		
		System.out.println("Record inserted...");
	}

}
