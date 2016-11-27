package com.leo.zeng.sample.web.service;

import java.util.List;
import com.leo.zeng.sample.web.pojo.entity.TestEntity;

public interface TestService {
    public List<TestEntity> list();

    public void insert();
}
