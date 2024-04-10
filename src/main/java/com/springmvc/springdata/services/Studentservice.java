package com.springmvc.springdata.services;

import com.springmvc.springdata.entitiies.Student;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Studentservice {

    public Student createstud(Student stud);

    public List<Student> getAllStudents();
    public  Student updateStudent(Student s);
    public  Student getStudentById(Integer Id);

    public boolean deleteStudentById(Integer Id);
    public  Student getStudentByName(String Name);
    public  Student getStudentByEmailAndPassword(String Email,String Password);
}
