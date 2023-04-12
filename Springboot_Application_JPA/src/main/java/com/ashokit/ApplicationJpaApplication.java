package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Book;
import com.ashokit.repository.BookRepository;

@SpringBootApplication
public class ApplicationJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ApplicationJpaApplication.class, args);
		
		BookRepository repo = context.getBean(BookRepository.class);
		
		Book b = new Book();
		
		b.setBookId(101);
		b.setBookName("Spring");
		b.setBookPrice(1000.0);
		
		repo.save(b);
		
	}

}
