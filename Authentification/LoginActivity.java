package com.example.mbisu.tradetool.Authentification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

import com.example.mbisu.tradetool.MainActivity;
import com.example.mbisu.tradetool.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText username,password;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.signbtn);
        login.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.signbtn){

            String name = username.getText().toString().trim();
            String pass = password.getText().toString().trim();

            if (TextUtils.isEmpty(name)){
                username.setError("fill username");
            }
            else if (TextUtils.isEmpty(pass)){
                password.setError("fill password");
            }
            else {

                //firebase

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }

        }

    }
}
