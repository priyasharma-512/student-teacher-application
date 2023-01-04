package com.example.studentteacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/add")
    public ResponseEntity<String> addTeacher(@RequestBody Teacher teacher){

        teacherService.addTeacher(teacher);

        return new ResponseEntity("Added a teacher successfully", HttpStatus.CREATED);

    }

    @GetMapping("/get-teacher-by-name/{name}")
    public ResponseEntity<Teacher> getTeacherByName(@PathVariable String name){
        Teacher teacher = teacherService.getTeacherByName(name);// Assign teacher by calling service layer method

        return new ResponseEntity<>(teacher, HttpStatus.CREATED);
    }
}
