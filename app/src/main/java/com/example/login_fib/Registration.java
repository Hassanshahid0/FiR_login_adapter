package com.example.login_fib;

import static com.example.login_fir.login.Email_Alert_mESS;
import static com.example.login_fir.login.FIB_Register;
import static com.example.login_fir.login.Pass_Alter_mEss;
import static com.example.login_fir.login.login_state;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.login_fir.login;
import com.google.firebase.auth.FirebaseAuth;

public class Registration extends AppCompatActivity {
    EditText Remail,Rpassword;
    Button buttonsubmit;
    FirebaseAuth mauth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Remail=(EditText )findViewById(R.id.mail);
        Rpassword=(EditText )findViewById(R.id.password);
        buttonsubmit=(Button)findViewById(R.id.signup_btn);
        mauth= FirebaseAuth.getInstance();

        FIB_Register(Remail,
                Rpassword,
                buttonsubmit,
                6,
                this,
        mauth);

        //--------------------------Set-negvigation-Alter-message
        Email_Alert_mESS("Please Enter Email");
        Pass_Alter_mEss("Please Enter correct password");


        //--------------------------Home-Activity--------------??
        if(login_state())
        {
            startActivity(new Intent(Registration.this, Home.class));
        }


    }
}