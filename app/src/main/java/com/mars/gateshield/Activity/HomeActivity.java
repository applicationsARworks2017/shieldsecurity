package com.mars.gateshield.Activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mars.gateshield.Fragment.EntryFragment;
import com.mars.gateshield.Fragment.ExitFragment;
import com.mars.gateshield.R;

public class HomeActivity extends AppCompatActivity {
    Fragment frag = null;
    ImageView entryim,iv_exit;
    TextView tv_entry,tv_exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        iv_exit=(ImageView)findViewById(R.id.iv_exit);
        entryim=(ImageView)findViewById(R.id.entryim);
        tv_entry=(TextView)findViewById(R.id.tv_entry);
        tv_exit=(TextView)findViewById(R.id.tv_exit);
        entryim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Resources resources = HomeActivity.this.getResources();
                Drawable drawable = resources.getDrawable(R.drawable.check_in);
                DrawableCompat.setTint(drawable, HomeActivity.this.getResources().getColor(R.color.colorPrimaryDark));
                entryim.setImageDrawable(drawable);
                tv_entry.setTextColor(Color.parseColor("#ff5d00"));

                Resources resources1 = HomeActivity.this.getResources();
                Drawable drawable1 = resources1.getDrawable(R.drawable.check_out);
                DrawableCompat.setTint(drawable1, HomeActivity.this.getResources().getColor(R.color.black));
                iv_exit.setImageDrawable(drawable1);
                tv_exit.setTextColor(Color.parseColor("#000000"));


                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                EntryFragment llf = new EntryFragment();
                ft.replace(R.id.container, llf);
                ft.commit();
            }
        });
        iv_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resources resources = HomeActivity.this.getResources();
                Drawable drawable = resources.getDrawable(R.drawable.check_out);
                DrawableCompat.setTint(drawable, HomeActivity.this.getResources().getColor(R.color.colorPrimaryDark));
                iv_exit.setImageDrawable(drawable);
                tv_entry.setTextColor(Color.parseColor("#000000"));

                Resources resources1 = HomeActivity.this.getResources();
                Drawable drawable1 = resources1.getDrawable(R.drawable.check_in);
                DrawableCompat.setTint(drawable1, HomeActivity.this.getResources().getColor(R.color.black));
                entryim.setImageDrawable(drawable1);
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ExitFragment llf = new ExitFragment();
                ft.replace(R.id.container, llf);
                ft.commit();
                tv_exit.setTextColor(Color.parseColor("#ff5d00"));

            }
        });
        Resources resources = HomeActivity.this.getResources();
        Drawable drawable = resources.getDrawable(R.drawable.check_in);
        DrawableCompat.setTint(drawable, HomeActivity.this.getResources().getColor(R.color.colorPrimaryDark));
        entryim.setImageDrawable(drawable);
        tv_entry.setTextColor(Color.parseColor("#ff5d00"));
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        EntryFragment llf = new EntryFragment();
        ft.replace(R.id.container, llf);
        ft.commit();
    }
}
