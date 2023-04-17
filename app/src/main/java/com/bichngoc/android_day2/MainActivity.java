package com.bichngoc.android_day2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bichngoc.android_day2.models.UserParcelable;
import com.bichngoc.android_day2.models.UserSerializable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = MainActivity.class.getName();
    private Button btnA;
    private TextView tvMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  //đọc dl khi bị mất
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate ");

        btnA = findViewById(R.id.btnA);
        tvMainActivity = findViewById(R.id.tvMainActivity);
        btnA.setOnClickListener(this);
    }

    private void gotoA() {//tường minh: biết rõ 2 tp tham gia, qtr chuyển từ Main -> A activity
        Intent intent = new Intent(MainActivity.this, ActivityA.class);
        //tạo ms 1 ac A, acMain k truyền dl gì đi
//        startActivity(intent);

        //push dl vào intent (được nhiều kiểu dữ liệu, nhiều put, nhưng tin nhắn đơn giản)
//        intent.putExtra("MESSAGE", "I come from MainActivity");
//        startActivity(intent);

        Bundle bundle = new Bundle();
        bundle.putString(Global.MESSAGE, "This data in Bundle");
//        intent.putExtras(bundle); //intent đóng gói lại Bundle
//        startActivity(intent);

        UserSerializable user = new UserSerializable();
        user.setName("Ngoc in Serial");
        user.setAge(21);

        UserParcelable userParcelable = new UserParcelable();
        userParcelable.setAge(18);
        userParcelable.setName("Son in Parce");

        bundle.putParcelable(Global.USER_PARE,userParcelable);
        bundle.putSerializable(Global.USER_SERIA, user);

        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart ");
    }

    @Override
    protected void onResume() {//tiếp tục
        super.onResume();
        Log.i(TAG, "onResume ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy ");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnA:
                gotoA();
                break;
        }
    }
}
