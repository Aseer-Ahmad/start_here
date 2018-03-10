package com.example.newu.exa_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class RegistrationPage extends AppCompatActivity {

    EditText firstname,lastname,passwordtext,email,rePassword,phone;
    ImageButton submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_page);

    firstname = findViewById(R.id.firstName);
    lastname = findViewById(R.id.lastName);
    passwordtext = findViewById(R.id.password);
    rePassword = findViewById(R.id.re_enter_password);
    email = findViewById(R.id.email);
    phone = findViewById(R.id.phone);
    submitButton = findViewById(R.id.submitButton);
    }

    public void onSubmitButtonClick(View view){
        // code here.....
        String fname = firstname.getText().toString();
        Toast.makeText(this, "Thank You For registering "+fname, Toast.LENGTH_SHORT).show();
    }
}
