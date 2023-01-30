package com.IronMan.LayerStudentManagementApp;
//Service layer will talk with repositary layer means it will call the function present in
// repositary layer

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// To call the function present in repo either I will make an object then call OR
//
@Service
public class StudentService {

    @Autowired //assume that we have made object of the layer = studentRepositary class
    StudentRepositary studentRepositary;

    public String addStudent(Student student) {
        //any logic that need to be done before sending it to the repo layer
        // those logic will be write here(before returning) respectively
        return studentRepositary.addStudent(student); //calling the function that was present in studentRepositary layer
    }

    public Student getStudent(int id) {
        return studentRepositary.getStudent(id);
    }

    public String deleteStudent(int id) {
        return studentRepositary.deleteStudent(id);
    }

    public String updateStudent(int id, int age) {
        return studentRepositary.updateStudent(id, age);
    }


}
