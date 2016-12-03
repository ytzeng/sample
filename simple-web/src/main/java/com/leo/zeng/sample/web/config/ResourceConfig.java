package com.leo.zeng.sample.web.config;

import org.leo.zeng.api.config.AbstractServiceConfig;

public class ResourceConfig extends AbstractServiceConfig {

    @Override
    public String[] packages() {
        return new String[] { "com.leo.zeng.sample.web.resource" };
    }

}
