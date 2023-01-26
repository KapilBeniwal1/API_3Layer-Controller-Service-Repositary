package com.IronMan.LayerStudentManagementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/*
Inside this class we will only define our API
pass the information to the service layer , It will not do any kind of processing task it will just
pass the info to the service layer
 */
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("id")int id){
        return studentService.getStudent(id);
    }

    @PutMapping("/update_student")
    public String updateStudent(@RequestParam("id") int id,@RequestParam("age") int age){
        return studentService.updateStudent(id, age);
    }

    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("/delete_student")
    public String deleteStudent(@RequestParam("id") int id){
        return studentService.deleteStudent(id);
    }
}
