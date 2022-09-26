package net.Javaguides.StudentManagementSystem.service.impl;

import net.Javaguides.StudentManagementSystem.entity.Student;
import net.Javaguides.StudentManagementSystem.repository.StudentRepository;
import net.Javaguides.StudentManagementSystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServceImpl implements StudentService {

    private StudentRepository studentRepository;


    public StudentServceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override

    public List<Student>getAllStudents(){
        return studentRepository.findAll();

    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        studentRepository.findById(id).get();
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
