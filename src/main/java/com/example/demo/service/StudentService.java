package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.StudentEntity;

public interface StudentService {

    StudentEntity postdata(StudentEntity stu);

    List<StudentEntity> getdata();

    StudentEntity updatedata(int id, StudentEntity std);

    String deletedata(int id);
}

