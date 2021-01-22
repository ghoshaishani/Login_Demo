package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction (View view) {

        EditText userNameText = (EditText) findViewById(R.id.userNameText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);

        Log.i("UserName",userNameText.getText().toString());
        Log.i("Password",passwordText.getText().toString());

        if(userNameText.getText().toString().equals("kush") && passwordText.getText().toString().equals("kush")){
            Log.i("Info","Login Successful");

            Toast.makeText(this, "Hi There!", Toast.LENGTH_SHORT).show();
        }
        else{
            Log.i("Info","Login Failed");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}