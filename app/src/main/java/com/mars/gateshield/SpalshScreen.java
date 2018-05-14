package com.mars.gateshield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.mars.gateshield.Activity.LoginActivity;

public class SpalshScreen extends AppCompatActivity {
    ImageView imageView;
    RelativeLayout page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_screen);
        imageView=(ImageView)findViewById(R.id.logo);
        page=(RelativeLayout) findViewById(R.id.page);
        page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SpalshScreen.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
