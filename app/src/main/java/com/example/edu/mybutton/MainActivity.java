package com.example.edu.mybutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclickwidget(View view){
        String text = ((Button)view).getText().toString();
        Toast.makeText(view.getContext(), text, Toast.LENGTH_SHORT).show();
    }
}
