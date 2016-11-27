package com.leo.zeng.sample.web.service.job;

import org.leo.zeng.quartz.service.JobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoJobService extends JobService {
    private static Logger logger = LoggerFactory.getLogger(DemoJobService.class);

    @Override
    public void execute() {
        logger.info("========= DemoJobService ===============");
    }
}
