package com.fxb.patterns.template;

import com.fxb.patterns.template.example.AbstractPerson;
import com.fxb.patterns.template.example.Student;
import com.fxb.patterns.template.example.Teacher;

public class TestTemplate {
    public static void main(String[] args) {

        System.out.println("--------------教师准备 开始------------------");
        AbstractPerson teacher = new Teacher();
        teacher.prepareGoToSchool();
        System.out.println("--------------教师准备 结束------------------");
        System.out.println();
        System.out.println("--------------学生准备 开始------------------");
        AbstractPerson student = new Student();
        student.prepareGoToSchool();
        System.out.println("--------------学生准备 结束------------------");

    }
}
