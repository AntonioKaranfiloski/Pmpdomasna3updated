package com.example.anton.pmpdomasna3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Scanner;


public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


    }

    public void lookup(View view){
        EditText the_word = (EditText) findViewById(R.id.editText_Search);
        String word = the_word.getText().toString();

        String defn = readDefinition(word);

        TextView definition = (TextView) findViewById(R.id.textView_definition);
        definition.setText(defn);

        Intent intent = new Intent();
        intent.putExtra("TextValue", definition.getText().toString());
        intent.setClass(Activity2.this, MainActivity.class);
        startActivity(intent);

    }

    private String readDefinition(String word) {

    Scanner scan = new Scanner(
            getResources().openRawResource(R.raw.grewords));
    while (scan.hasNextLine()){
        String line = scan.nextLine();
        String[] pieces = line.split("\t");

        if (pieces[0].equalsIgnoreCase(word.trim()))
            return pieces[1];
    }
        return null;
    }

        }

   /* Intent intent = new Intent(Activity2.this, MainActivity.class);
intent.putExtra("keyName", );  // pass your values and retrieve them in the other Activity using keyName
    startActivity(intent); */
