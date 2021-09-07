package com.example;

import com.example.primary.model.Student;
import com.example.primary.repository.StudentRepository;
import com.example.secondary.model.Employee;
import com.example.secondary.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMultiDatasourceApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMultiDatasourceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setName("rakesh");
        student.setRollNo("412");
        studentRepository.save(student);

        Employee employee=new Employee();
        employee.setName("raman");
        employee.setRollNo("Not found");
        employeeRepository.save(employee);
    }
}
