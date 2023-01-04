package com.example.studentteacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student) {
        studentRepository.save(student);
    }


    public Student getStudentByName(String name) {
       return studentRepository.findByName(name);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
