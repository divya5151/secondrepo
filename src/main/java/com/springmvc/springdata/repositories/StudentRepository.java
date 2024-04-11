package com.springmvc.springdata.repositories;

import com.springmvc.springdata.entitiies.Student;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query(nativeQuery = true,value =" select * from student")
   public List<Student> getAllStudents();
    public  Student getStudentById(Integer Id);
    @Transactional
    public Integer deleteStudentById(Integer Id);

    public  Student getStudentByName(String Name);
    public  Student getStudentByEmail(String Email);
    @Query(nativeQuery = true,value =" select * from student where enable=true")
    public  List<Student> getAllStudnetsByEnable();

    public List<Student> getAllStudentsByEnable(Boolean b);
    public  Student getStudentByEmailAndPassword(String Email,String Password);
    public  List<Student> findByNameLike(String Name);


}
