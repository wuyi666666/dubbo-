package com.test.testList;

public class MyUser {
    private Integer id;
    private String name;
    private Integer phone;

    public MyUser(Integer id, String name, Integer phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
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

    @Override
    public String toString() {
        return "MyUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
