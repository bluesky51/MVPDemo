package com.exam.sky.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.exam.sky.mvpdemo.adapter.MyAdapter;
import com.exam.sky.mvpdemo.bean.HotData;
import com.exam.sky.mvpdemo.presenter.FirstActivityPresenter;
import com.exam.sky.mvpdemo.view.IFirstActivityView;

public class NetWorkDataMVPActivity extends AppCompatActivity implements IFirstActivityView{
    FirstActivityPresenter presenter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        listView = (ListView) findViewById(R.id.listview);
        presenter =new FirstActivityPresenter(this);
        presenter.getListData();
    }

    @Override
    public void setData(HotData hotData) {

        listView.setAdapter(new MyAdapter(hotData.getData(),this));
    }

    @Override
    public void setFailMessage(String error) {
        Log.e("======","=FirstActivity请求失败的原因是====="+error);
    }

}
