package com.leo.zeng.sample.web.dao;

import java.util.List;
import org.leo.zeng.core.support.BaseDao;
import com.leo.zeng.sample.web.pojo.entity.TestEntity;

public interface TestDao extends BaseDao<TestEntity> {
    public List<TestEntity> list();
}
