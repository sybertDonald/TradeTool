package com.example.mbisu.tradetool.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.mbisu.tradetool.Authentification.LoginActivity;
import com.example.mbisu.tradetool.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    CircleImageView logout, edit, profilepic;
    TextView usernameprofile;
    android.support.v7.widget.Toolbar toolbar;
    TextView nameup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);

        logout = findViewById(R.id.logout);
        edit = findViewById(R.id.edit);
        profilepic = findViewById(R.id.profilepic);
        toolbar = findViewById(R.id.toolbarprofile);

        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("");
        nameup = toolbar.findViewById(R.id.toolbar_title);
        nameup.setText("PROFILE");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        usernameprofile = findViewById(R.id.usernameprofile);

        logout.setOnClickListener(this);
        edit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.logout) {

            Intent gologin = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(gologin);

        } else if (view.getId() == R.id.edit) {

            Intent goedit = new Intent(getApplicationContext(), EditProfileActivity.class);
            startActivity(goedit);
        }
    }
}
