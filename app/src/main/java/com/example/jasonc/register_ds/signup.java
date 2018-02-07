package com.example.jasonc.register_ds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class signup extends AppCompatActivity {
    String[] jurusan = { "Teknik Informatika", "Sistem Informasi", "Sistem Komputer", "Akuntansi", "Manajemen", "Hubungan Internasional", "Ilmu Komunikasi", "Teknologi Pangan", "Teknik Sipil", "Teknik Industri", "Hotel", "Other",  };
    Button button5, button6;
    EditText editText2, editText4, editText5, editText6, editText7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        editText2 = (EditText) findViewById(R.id.editText2);
        editText2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                editText2.setText("");
            }
        });

        editText4 = (EditText) findViewById(R.id.editText4);
        editText4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                editText4.setText("");
            }
        });

        final Spinner spin = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,jurusan);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        editText5 = (EditText) findViewById(R.id.editText5);
        editText5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                editText5.setText("");
            }
        });
        editText6 = (EditText) findViewById(R.id.editText6);
        editText6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                editText6.setText("");
            }
        });
        editText7 = (EditText) findViewById(R.id.editText7);
        editText7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                editText7.setText("");
            }
        });
        /* button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(signup.this, login.class);
                startActivityForResult(intent,2);
            }
        }); */
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(signup.this, MainActivity.class);
                startActivityForResult(intent,1);
            }
        });
    }
}
