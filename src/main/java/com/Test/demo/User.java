package com.Test.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // this tells sql to make table
@Table(name="user_info") //changing table name user to user_info
public class User {
    @Id  //this tells sql primerykey
    @Column(name="id")  //changing name of rollno to id in sql table
    int rollNo ;

    String name;

    int age;

    String mobNo; // in sql table mobNo changed to mob_no coz of camel case

    public User() { //diff const very important coze spring creat beans using diff const
    }

    public User(int rollNo, String name, int age, String mobNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}
