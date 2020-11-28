package com.example.restaurant.Administrateur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.restaurant.R;

public class staffManage extends AppCompatActivity {


    private Button managerManage, serverManage, coookerManage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_manage);

        managerManage = (Button) findViewById(R.id.managerManage);
        serverManage = (Button) findViewById(R.id.serverManage);
        coookerManage = (Button) findViewById(R.id.cookerManage);


    }


}