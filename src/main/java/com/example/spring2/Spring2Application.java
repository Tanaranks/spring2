package com.example.spring2;

import com.example.spring2.student.student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class Spring2Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring2Application.class, args);
	}
@GetMapping (path = "/ranks")
	public List<student> detts(){
	return List.of(new student(011,"Akubeze",23, LocalDate.of(2000,12,11),"ayika22@gmail.com"));
}
}
