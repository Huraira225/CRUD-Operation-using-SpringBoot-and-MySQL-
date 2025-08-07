package com.testProject.SpringBoot;

import com.testProject.SpringBoot.model.Employee;
import com.testProject.SpringBoot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Huraira");
		employee.setLastName("Tasawar");
		employee.setEmailId("huraira_tasawar@hotmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Zayaan");
		employee1.setLastName("Huraira");
		employee1.setEmailId("zayaan_huraira@hotmail.com");
		employeeRepository.save(employee1);
	}
}
