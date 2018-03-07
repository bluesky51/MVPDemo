package com.exam.sky.mvpdemo.model;

import com.exam.sky.mvpdemo.bean.User;

/**
 * Created by bluesky on 16/10/23.
 */

public class UserModel implements IUserModel {
    String mName;
    String mPwd;
    @Override
    public void setUserName(String name) {
        mName =name;

    }

    @Override
    public void setUserPwd(String pwd) {
        mPwd =pwd;

    }

    @Override
    public User load() {
        return new User(mName,mPwd);
    }
}
