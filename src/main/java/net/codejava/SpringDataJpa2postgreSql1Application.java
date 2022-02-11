package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class SpringDataJpa2postgreSql1Application implements CommandLineRunner {
	 @Autowired
     private StudentRepository studentRepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa2postgreSql1Application.class, args);
	  
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	List<student> student = studentRepo.findAll();
	 student.forEach(System.out :: println);
	}

}
