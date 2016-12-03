package com.leo.zeng.sample.web.pojo.view;

import org.leo.zeng.core.pojo.BaseView;

@SuppressWarnings("serial")
public class UserView extends BaseView {
    private String name;
    private String nickname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
