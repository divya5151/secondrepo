package com.springmvc.springdata.services.Impl;

import com.springmvc.springdata.entitiies.Student;
import com.springmvc.springdata.repositories.StudentRepository;
import com.springmvc.springdata.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    public StudentRepository stud;
    @Override
    public List<Student> getAllStudents() {
        return stud.getAllStudents();
    }

    @Override
    public Student updateStudent(Student s) {
        s.setEnable(true);
        return stud.save(s);
    }

    @Override
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

    @Override
    public Student getStudentByEmail(String Email) {
        return stud.getStudentByEmail(Email);
    }
    @Override
    public List<Student> getAllStudnetsByEnable() {
        return stud.getAllStudnetsByEnable();
    }

    @Override
    public List<Student> getAllStudentsByEnable(Boolean b) {
        return stud.getAllStudentsByEnable(true);
    }

    @Override
    public Student getStudentByEmailAndPassword(String Email, String Password) {
        return stud.getStudentByEmailAndPassword(Email,Password);
    }

    @Override
    public Student updateStudentById(Integer Id) {
        Student studentById = stud.getStudentById(Id);
        Student st=new Student();
        st.setId(studentById.getId());
        st.setName(studentById.getName());
        st.setContact(studentById.getContact());
        st.setEmail(studentById.getEmail());
        st.setPassword(studentById.getPassword());
        st.setEnable(true);
      return   stud.save(st);

}

    @Override
    public List<Student> findByNameLike(String Name) {
        return stud.findByNameLike(Name);
    }
}
