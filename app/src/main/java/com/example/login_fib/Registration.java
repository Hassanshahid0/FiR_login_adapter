package com.example.login_fib;

import static com.example.login_fir.Sign_up.Email_Alert_Reg;
import static com.example.login_fir.Sign_up.FIB_Register;
import static com.example.login_fir.Sign_up.Pass_Alter_Reg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class Registration extends AppCompatActivity {
    EditText Remail,Rpassword;
    Button buttonsubmit;
    FirebaseAuth Firebaseauth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Remail=(EditText)findViewById(R.id.mail);
        Rpassword=(EditText )findViewById(R.id.password);
        buttonsubmit=(Button)findViewById(R.id.signup_btn);
        Firebaseauth= FirebaseAuth.getInstance();

        //--------------------------Home-Activity--------------??
        Intent intent=new Intent(this,Home.class);

        //--------------------------Set-negvigation-Alter-message
        Email_Alert_Reg("Enter Email");
        Pass_Alter_Reg("Enter password");

        //--------------------------FIB_Register--------------??
        FIB_Register(Remail,
                Rpassword,
                buttonsubmit,
                6,
                this,
                Firebaseauth,
                intent);
    }
}