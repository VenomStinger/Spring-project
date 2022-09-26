package net.Javaguides.StudentManagementSystem.repository;

import net.Javaguides.StudentManagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long > {
}
