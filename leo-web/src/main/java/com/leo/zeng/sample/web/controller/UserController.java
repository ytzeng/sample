package com.leo.zeng.sample.web.controller;

import org.leo.zeng.core.pojo.RespDate;
import org.leo.zeng.web.support.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.leo.zeng.sample.web.pojo.view.UserView;

@Controller
public class UserController extends BaseController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("user")
    @ResponseBody
    public RespDate user() {
        logger.info("UserController.user");
        try {
            UserView view = new UserView();
            view.setName("aaa");
            view.setNickname("bbb");
            return success(view);
        } catch (Exception e) {
            return failure("I0001", e, logger);
        }
    }
}
