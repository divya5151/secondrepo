package com.springmvc.springdata.controllers;

import com.springmvc.springdata.entitiies.Student;
import com.springmvc.springdata.services.Impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Studentcontroller {

    @Autowired
    StudentServiceImpl stimpl;
    @PostMapping("/insertdata")
    public Student registerstud(@RequestBody Student s){

        return stimpl.createstud(s);
    }
    @GetMapping("/getdata")
    public List<Student> getall(){

        return stimpl.getAllStudents();
    }
    @PutMapping("/update")
    public Student updateStud(@RequestBody Student st) {

        return stimpl.updateStudent(st);
    }
    @GetMapping("/getinfo/{id}")
    public Student getStud(@PathVariable Integer id){

        return stimpl.getStudentById(id);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deletestud(@PathVariable Integer id){

        return stimpl.deleteStudentById(id);
    }
    @GetMapping("/getname/{name}")
    public  Student getstudbyname(@PathVariable String name){

        return stimpl.getStudentByName(name);
    }
    @PostMapping("/login")
    public  Student getemailandpassword(@RequestBody Student st){
        return stimpl.getStudentByEmailAndPassword(st.getEmail(),st.getPassword());
    }
}
