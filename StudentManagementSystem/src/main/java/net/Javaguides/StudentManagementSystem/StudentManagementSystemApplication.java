package net.Javaguides.StudentManagementSystem;

import net.Javaguides.StudentManagementSystem.entity.Student;
import net.Javaguides.StudentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
    @Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

		/*Student student1=new Student("Ramesh","Bawa","rameshb@gmail.com");
		studentRepository.save(student1);

		Student student2=new Student("Hritik","Chugh","hritikc@gmail.com");
		studentRepository.save(student2);

		Student student3=new Student("Tony","Stark","TonyS@gmail.com");
		studentRepository.save(student3);
*/
	}
}
