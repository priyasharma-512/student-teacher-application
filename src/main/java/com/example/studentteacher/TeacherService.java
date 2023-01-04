package com.example.studentteacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;
    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public Teacher getTeacherByName(String name) {
        return teacherRepository.findByName(name);
    }
}
