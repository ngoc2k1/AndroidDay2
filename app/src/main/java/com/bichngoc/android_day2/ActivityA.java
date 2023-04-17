package com.bichngoc.android_day2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bichngoc.android_day2.models.UserParcelable;
import com.bichngoc.android_day2.models.UserSerializable;

public class ActivityA extends AppCompatActivity {
    private static final String TAG = ActivityA.class.getName();
    private UserSerializable userSerializable;
    private UserParcelable userParcelable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_a);
        Log.i(TAG, "onCreate A");
//        tạo intent để lắng nghe, được Main truyền sang, getIntent: đọc dl ra
//        Intent intent = getIntent();
//        String getMessage = intent.getStringExtra("MESSAGE");

        Bundle bundle = getIntent().getExtras();
        //nếu biến mess k tồn tại, thì sẽ luôn trả gtr default
        String getMessage = bundle.getString(Global.MESSAGE, "This is default value");
        Log.i(TAG, "onCreate " + getMessage);

        //dành cho dữ liệu nhận là đối tượng
        userParcelable = bundle.getParcelable(Global.USER_PARE);
        userSerializable = (UserSerializable) bundle.getSerializable(Global.USER_SERIA);
        Log.d(TAG, "onCreate UserSerializable" + userSerializable);
        Log.d(TAG, "onCreate userParcelable" + userParcelable);


        findViewById(R.id.btnB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoB();
            }
        });
    }

    private void gotoB() {
        Intent intent = new Intent(ActivityA.this, ActivityB.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart A");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume A");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause A");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop A");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart A");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy A");
    }
}
