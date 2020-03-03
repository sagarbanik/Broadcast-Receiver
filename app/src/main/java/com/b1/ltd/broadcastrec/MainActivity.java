package com.b1.ltd.broadcastrec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSendBC;
    private String TEST_BC_ACTION="a_test_bc";

    public static final String TAG="MYTag12";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendBC = findViewById(R.id.btnSendBC);
        btnSendBC.setOnClickListener(this);

        MyReciver myReciver=new MyReciver();
        IntentFilter intentFilter=new IntentFilter(TEST_BC_ACTION);
        registerReceiver(myReciver,intentFilter);



    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnSendBC){
            Intent bIntent=new Intent(TEST_BC_ACTION);
            sendBroadcast(bIntent);
        }
    }
}
