package com.atzdy.spring.pojo;



/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/2 20:39
 * @Abstract：
 */

public class Student01 {
    private Integer Id;
    private String userName;
    private String password;
    private String age;

    public Student01() {
        System.out.println("生命周期1：实例化");
    }

    public Student01(Integer id, String userName, String password, String age) {
        this.Id = id;
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        System.out.println("生命周期2：依赖注入");
        this.Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student01{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void initMethod() {
        System.out.println("生命周期3：初始化");
    }

    public void destroyMethod() {
        System.out.println("生命周期4：销毁");
    }
}
