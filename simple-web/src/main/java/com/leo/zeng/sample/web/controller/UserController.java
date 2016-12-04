package com.leo.zeng.sample.web.controller;

import com.leo.zeng.sample.web.pojo.view.UserView;
import com.leo.zeng.sample.web.service.TestService;
import com.leo.zeng.sample.web.service.tran.TestServiceTran;
import org.leo.zeng.core.pojo.RespDate;
import org.leo.zeng.core.util.SpringUtil;
import org.leo.zeng.web.support.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController extends BaseController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private TestService service;
    @Autowired
    private TestServiceTran serviceTran;

    @RequestMapping("user")
    @ResponseBody
    public RespDate user() {
        logger.info("UserController.user");
        try {
            logger.info(SpringUtil.getValue("test.code"));
            UserView view = new UserView();
            view.setName("aaa");
            view.setNickname("bbb");
            return success(view);
        } catch (Exception e) {
            return failure("I0001", e, logger);
        }
    }

    @RequestMapping("list")
    @ResponseBody
    public RespDate list() {
        logger.info("UserController.list");
        try {
            return success(service.list());
        } catch (Exception e) {
            return failure("I0001", e, logger);
        }
    }

    @RequestMapping("insert")
    @ResponseBody
    public RespDate insert() {
        logger.info("UserController.insert");
        try {
            service.insert();
            return success();
        } catch (Exception e) {
            return failure("I0001", e, logger);
        }
    }

    @RequestMapping("tran")
    @ResponseBody
    public RespDate tran() {
        logger.info("UserController.insert");
        try {
            serviceTran.insert();
            return success();
        } catch (Exception e) {
            return failure("I0001", e, logger);
        }
    }

    @RequestMapping("velocity")
    public ModelAndView velocity() {
        logger.info("UserController.velocity");
        return success("demo", success());
    }

}
