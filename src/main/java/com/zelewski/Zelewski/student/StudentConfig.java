package com.zelewski.Zelewski.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student eryk = new Student(
                    "Eryk",
                    "Eryk@sloneczko.nasze",
                    LocalDate.of(2021, APRIL, 20));
            Student karolcia = new Student(
                    "Karolina",
                    "Karolcia@sloneczko.nasze",
                    LocalDate.of(1994, OCTOBER, 22));

            repository.saveAll(
                    List.of(eryk, karolcia));

        };
    }
}
