package com.example.anton.pmpdomasna3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s = getIntent().getStringExtra("TextValue");
        TextView text = (TextView) findViewById(R.id.textview1);
        text.setText(s);
        //textview1.setText("value1: " + s + ");
    }
    public void OpenA (View view){
        startActivity(new Intent(this, Activity2.class));
    }
}
