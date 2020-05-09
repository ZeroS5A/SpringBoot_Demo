package com.server.impl;

import com.bean.Student;
import com.dao.StudentDao;
import com.server.StudentSever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentServer")
public class StudentImpl implements StudentSever {
    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> selStudent() {
        return studentDao.selAllStudent();
    }
}
