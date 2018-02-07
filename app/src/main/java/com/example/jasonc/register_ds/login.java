package com.example.jasonc.register_ds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    EditText editText1, editText3;
    Button button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        editText1 = (EditText) findViewById(R.id.editText);
        editText1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                editText1.setText("");
            }
        });
        editText3 = (EditText) findViewById(R.id.editText3);
        editText3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                editText3.setText("");
            }
        });
        /* button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(login.this, login.class);
                startActivityForResult(intent,2);
            }
        }); */
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(login.this, MainActivity.class);
                startActivityForResult(intent,1);
            }
        });
    }
}
