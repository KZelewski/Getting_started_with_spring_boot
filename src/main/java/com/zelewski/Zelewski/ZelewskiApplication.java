package com.zelewski.Zelewski;

import com.zelewski.Zelewski.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.List;

@SpringBootApplication
@RestController
public class ZelewskiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZelewskiApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"Eryk",
						"Eryk@sloneczko.nasze",
						LocalDate.of(2021, Month.APRIL, 20)));

	}

}
