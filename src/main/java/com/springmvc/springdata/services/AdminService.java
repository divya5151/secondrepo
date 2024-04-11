package com.springmvc.springdata.services;

import com.springmvc.springdata.entitiies.Student;

import java.util.List;

public interface AdminService {
    public List<Student> getAllStudents();
    public  Student updateStudent(Student s);
    public  Student getStudentById(Integer Id);

    public boolean deleteStudentById(Integer Id);
    public  Student getStudentByName(String Name);
    public  Student getStudentByEmail(String Email);
    public  List<Student> getAllStudnetsByEnable();
    public List<Student> getAllStudentsByEnable(Boolean b);
    public  Student getStudentByEmailAndPassword(String Email,String Password);
    public  Student updateStudentById(Integer Id);
    public  List<Student> findByNameLike(String Name);
}
