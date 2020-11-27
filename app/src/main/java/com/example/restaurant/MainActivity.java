package com.example.restaurant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;


public class MainActivity extends AppCompatActivity {


    private EditText iD, password;
    private Button connect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iD = (EditText) findViewById(R.id.identification_main);
        password = (EditText) findViewById(R.id.Password_main);
        connect = (Button) findViewById (R.id.connexion_main);

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verify(iD.getText().toString(), password.getText().toString());
            }
        });
    }

    public void verify (String id, String password){
        if ( id == "Admin" && password == "1234"){
            Intent intent = new Intent(MainActivity.this, portailAdministrateur.class);
            startActivity(intent);
        }


    }

}