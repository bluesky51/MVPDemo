package com.exam.sky.mvpdemo.presenter;

import com.exam.sky.mvpdemo.bean.User;
import com.exam.sky.mvpdemo.model.IUserModel;
import com.exam.sky.mvpdemo.model.UserModel;
import com.exam.sky.mvpdemo.view.IUserView;

/**
 * Created by bluesky on 16/10/23.
 */

public class UserPresenter {
    private IUserModel iUserModel;
    private IUserView iUserView;

    public UserPresenter(IUserView iUserView) {
        this.iUserView = iUserView;
        iUserModel = new UserModel();
    }

    public void saveUser(String name, String pwd) {
        iUserModel.setUserName(name);
        iUserModel.setUserPwd(pwd);
    }

    public void loadUser() {
        User user = iUserModel.load();
        iUserView.setUserName(user.getName());
        iUserView.setUserPwd(user.getPwd());
    }
}
