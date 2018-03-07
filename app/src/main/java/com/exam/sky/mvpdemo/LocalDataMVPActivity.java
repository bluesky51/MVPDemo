package com.exam.sky.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.exam.sky.mvpdemo.presenter.UserPresenter;
import com.exam.sky.mvpdemo.view.IUserView;

public class LocalDataMVPActivity extends AppCompatActivity implements IUserView {

    EditText et_name;
    EditText et_pwd;

    TextView tv1;
    TextView tv2;

    UserPresenter userPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_data_mvp);
        tv1 = (TextView) findViewById(R.id.textView2);
        tv2 = (TextView) findViewById(R.id.textView4);
        et_name= (EditText) findViewById(R.id.editText);
        et_pwd= (EditText) findViewById(R.id.editText2);
        userPresenter=new UserPresenter(this);
    }
    public void write(View view){
        userPresenter.saveUser(et_name.getText().toString(),et_pwd.getText().toString());
    }

    public void read(View view){
        userPresenter.loadUser();
    }

    @Override
    public String getUserName() {
        return et_name.getText().toString();
    }

    @Override
    public String getUserPwd() {
        return et_pwd.getText().toString();
    }

    @Override
    public void setUserName(String name) {
        tv1.setText("用户名是："+name);
    }

    @Override
    public void setUserPwd(String pwd) {
        tv2.setText("密码是："+pwd);
    }
}
