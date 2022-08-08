package io.anmolbrains.springbootquickstart.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.anmolbrains.springbootquickstart"})
public class CourseApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(CourseApiApplication.class, args);

	}

}
