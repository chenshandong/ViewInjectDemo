package com.example.administrator.viewinjectdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.BindView;
import com.example.ioc_api.Ioc;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ioc.inject(this);
    }

    public void inject(View v){
        mTv.setText("inject success");
    }
}
