package com.pablomonteserin.layouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pablomonteserin.ejercicios.R;
import com.pablomonteserin.layouts.AllLayoutsPackage.Frame;
import com.pablomonteserin.layouts.AllLayoutsPackage.GridL;
import com.pablomonteserin.layouts.AllLayoutsPackage.Linear;
import com.pablomonteserin.layouts.AllLayoutsPackage.Relative;
import com.pablomonteserin.layouts.AllLayoutsPackage.TableL;

public class C_AllLayoutsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alllayouts);
    }


    public void irAFrame(View v){
        startActivity(new Intent(C_AllLayoutsActivity.this, Frame.class));
    }
    public void irAGrid(View v){
        startActivity(new Intent(C_AllLayoutsActivity.this, GridL.class));
    }
    public void irALinear(View v){
        startActivity(new Intent(C_AllLayoutsActivity.this, Linear.class));
    }
    public void irARelative(View v){
        startActivity(new Intent(C_AllLayoutsActivity.this, Relative.class));
    }
    public void irATableLayout(View v){
        startActivity(new Intent(C_AllLayoutsActivity.this, TableL.class));
    }
}
