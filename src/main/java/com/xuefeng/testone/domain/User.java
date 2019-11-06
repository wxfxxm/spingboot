package com.xuefeng.testone.domain;

/**
 * @author xuefeng.wang
 * @version V1.0
 * @Package com.xuefeng.testone.domain
 * @date 2019/11/5 11:01
 * @Copyright © 2019-2020 Bespin
 */

public class User {

    private int age;

    private String pwd;

    private String phone;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User() {
        super();
    }

    public User(int age, String pwd, String phone) {
        super();
        this.age = age;
        this.pwd = pwd;
        this.phone = phone;
    }


}
