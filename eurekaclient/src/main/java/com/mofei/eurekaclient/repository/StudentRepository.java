package com.mofei.eurekaclient.repository;

import com.mofei.eurekaclient.entity.Student;

import java.util.Collection;

/**
 * description: StudentRepository <br>
 * date: 2019/8/5 10:04 <br>
 */

public interface StudentRepository {

    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
