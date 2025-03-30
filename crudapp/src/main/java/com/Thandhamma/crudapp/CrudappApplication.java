package com.Thandhamma.crudapp;

import com.Thandhamma.crudapp.respository.PersonDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.Thandhamma.crudapp.entity.Person;

@Component
public class CrudappApplication {

	@Autowired
	private PersonDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(CrudappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			saveData(dao);
		};
	}

	public void saveData(PersonDAO dao) {
		Person obj1 = new Person("ต้น", "กล้วย");
		dao.save(obj1);
		System.out.println("Insert Complete");
	}
}
