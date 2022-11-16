package com.atzdy.spring.pojo;

import java.util.Arrays;
import java.util.Map;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/29 19:50
 * @Abstract：
 */
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private Clazz clazz;
    private String[] hobbies;
    private Map<String, Teacher> teacherMap;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, String sex, Clazz clazz, String[] hobbies, Map<String, Teacher> teacherMap) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.clazz = clazz;
        this.hobbies = hobbies;
        this.teacherMap = teacherMap;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", clazz=" + clazz +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
