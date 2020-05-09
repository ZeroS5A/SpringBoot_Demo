package com.dao;

import com.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentDao {
    @Select("select * from t_student")
    public List<Student> selAllStudent();
}
