package com.thxy.spring_data_jpa_mysql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.thxy.spring_data_jpa_mysql.dao.EmployeeRepository;
import com.thxy.spring_data_jpa_mysql.entity.Employee;

@SpringBootApplication
public class SpringDataJpaMysqlApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringDataJpaMysqlApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaMysqlApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(EmployeeRepository repository) {
		return (args) -> {
			repository.save(new Employee("张", "三"));
			repository.save(new Employee("李", "四"));
			repository.save(new Employee("王", "五"));
			repository.save(new Employee("赵", "六"));
			log.info("Employees found with findAll()");
			log.info("-------------------------");
			for (Employee employee : (Iterable<Employee>) (repository.findAll())) {
				log.info(employee.toString());
			}
		};
	}

}
