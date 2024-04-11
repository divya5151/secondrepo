package com.springmvc.springdata.controllers;

import com.springmvc.springdata.entitiies.Student;
import com.springmvc.springdata.services.Impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Admin")
public class AdminController {
    @Autowired
    AdminServiceImpl stimpl;

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
    @GetMapping("/getemail/{Email}")
    public  Student getstudbyemail(@PathVariable String Email){

        return stimpl.getStudentByEmail(Email);
    }


    @GetMapping("/getstud")
    public ResponseEntity<List<Student>> getstudent(){
        List<Student> st=stimpl.getAllStudents();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(st);
    }
    @PutMapping("/updatestud")
    public ResponseEntity<Student> updatest(@RequestBody Student s){
        Student st=stimpl.updateStudent(s);
        return ResponseEntity.status(HttpStatus.CREATED).body(st);
    }
    @DeleteMapping("/deletestud/{id}")
    public ResponseEntity<Boolean> deletedata(@PathVariable Integer id) {
        boolean b = stimpl.deleteStudentById(id);
        if (b)
        {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(b);
        } else
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(b);
        }

    }
    @GetMapping("getstudname/{Name}")
    public ResponseEntity<Student> getname(@PathVariable String Name){
        Student st=stimpl.getStudentByName(Name);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(st);
    }
    @GetMapping("/getenable")
    public List<Student> getstudenable(){

        return stimpl.getAllStudnetsByEnable();
    }
    @GetMapping("/enable")
    public List<Student> getenable(boolean b){

        return stimpl.getAllStudentsByEnable(true);
    }
    @PostMapping("/updatedata/{id}")
    public Student updatestudent(@PathVariable Integer id){
      return stimpl.updateStudentById(id);

    }
    @GetMapping("/getbyname/{Name}")
    public List<Student> Findbyname(@PathVariable String Name){

        return stimpl.findByNameLike(Name+"%");
    }
}

