package com.leo.zeng.sample.web.service.tran;

import org.leo.zeng.core.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.leo.zeng.sample.web.dao.TestDao;
import com.leo.zeng.sample.web.pojo.entity.TestEntity;

@Component
public class TestServiceTran {
    @Autowired
    private TestDao testDao;

    public void insert() {
        TestEntity entity = new TestEntity();
        entity.setCode("wwwwwwwww");
        entity.setValue("sssssssssss");
        testDao.insert(entity);
        if (true) {
            throw new ServiceException();
        }
        entity = new TestEntity();
        entity.setCode("fffffffffff");
        entity.setValue("ggggggggg");
        testDao.insert(entity);
    }
}
