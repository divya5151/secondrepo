package com.springmvc.springdata.services.Impl;

import com.springmvc.springdata.entitiies.Student;
import com.springmvc.springdata.repositories.StudentRepository;
import com.springmvc.springdata.services.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class StudentServiceImpl implements Studentservice {
    @Autowired
    public StudentRepository stud;

    @Override
    public Student createstud(Student st) {
        st.setEnable(false);
        return stud.save(st);
    }
    @Override
    public Student getStudentByEmail(String Email) {
        return stud.getStudentByEmail(Email);
    }
    @Override
    public Student getStudentByEmailAndPassword(String Email, String Password) {
        return stud.getStudentByEmailAndPassword(Email,Password);
    }
    @Override
    public Student updateStudent(Student s) {
        return stud.save(s);
    }

  /*  @Override
    public List<Student> getAllStudents() {
        return stud.getAllStudents();
    }
*/


   /* @Override
    public Student getStudentById(Integer Id) {
        return stud.getStudentById(Id);
    }

    @Override
    public boolean deleteStudentById(Integer Id) {
        Integer i = stud.deleteStudentById(Id);
        System.out.println(i);
        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public Student getStudentByName(String Name) {
        return stud.getStudentByName(Name);
    }


*/
  /*  @Override
    public List<Student> getAllStudnetsByEnable() {
        return stud.getAllStudnetsByEnable();
    }

    @Override
    public List<Student> getAllStudentsByEnable(Boolean b) {
        return stud.getAllStudentsByEnable(true);
    }*/

}