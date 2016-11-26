package com.leo.zeng.sample.web.pojo.entity;

import org.leo.zeng.core.pojo.BaseEntity;

@SuppressWarnings("serial")
public class UserEntity extends BaseEntity {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
