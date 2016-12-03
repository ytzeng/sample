package com.leo.zeng.sample.web.service.impl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leo.zeng.sample.web.dao.TestDao;
import com.leo.zeng.sample.web.pojo.entity.TestEntity;
import com.leo.zeng.sample.web.service.TestService;

@Service
public class TestServiceImpl implements TestService {
    private static Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    private TestDao testDao;

    @Override
    public List<TestEntity> list() {
        return testDao.list();
    }

    @Override
    public void insert() {
        TestEntity entity = new TestEntity();
        entity.setCode("aaa");
        entity.setValue("ddd");
        int count = testDao.insert(entity);
        logger.info(count + "");
    }

}
