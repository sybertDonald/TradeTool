package com.example.mbisu.tradetool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.example.mbisu.tradetool.Profile.ProfileActivity;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    Button startday,upload,startvisit,reviewstock,endday;
    TextView toolbartitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbarhome);

        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {

            getSupportActionBar().setTitle("");
        
        }

        startday = findViewById(R.id.startday);
        upload = findViewById(R.id.upload);
        startvisit = findViewById(R.id.startvist);
        reviewstock = findViewById(R.id.reviewstock);
        endday = findViewById(R.id.endday);


        toolbartitle = toolbar.findViewById(R.id.toolbar_title);
        toolbartitle.setAllCaps(true);
        toolbartitle.setText(R.string.titletoolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_profile) {

            Intent pro = new Intent(getApplicationContext(),ProfileActivity.class);
            startActivity(pro);
            return true;
        }


        return super.onOptionsItemSelected(item);

    }


}
