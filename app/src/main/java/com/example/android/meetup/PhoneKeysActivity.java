package com.example.android.meetup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneKeysActivity extends AppCompatActivity {

    Button numOne, numBackspace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_keys);

        numOne = (Button) findViewById(R.id.button1);
        numBackspace = (Button) findViewById(R.id.button_back);
    }
    public void backspace (View view){
        EditText numberEditText = (EditText) findViewById(R.id.text_numbers);

        // String alpha = numberEditText.getText().toString();
        // String beta = alpha.replace(alpha.substring(alpha.length()-1), "");

        numberEditText.setText("");
    }

    public void button1 (View view){
        EditText numberEditText= (EditText) findViewById(R.id.text_numbers);
        numberEditText.setText("1");
    }
}
