package com.leo.zeng.sample.web.pojo.entity;

import org.leo.zeng.core.pojo.BaseEntity;

@SuppressWarnings("serial")
public class TestEntity extends BaseEntity {
    private Long id;
    private String code;
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
