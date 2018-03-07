package com.exam.sky.mvpdemo.model;

import com.exam.sky.mvpdemo.bean.User;

/**
 * Created by bluesky on 16/10/23.
 */

public interface IUserModel {
    void setUserName(String name);

    void setUserPwd(String pwd);

    User load();//读取user信息,返回一个User
}
