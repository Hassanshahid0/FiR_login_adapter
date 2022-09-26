package com.example.login_fib;


import static com.example.login_fir.login.Email_Alert_mESS;
import static com.example.login_fir.login.FIB_login;
import static com.example.login_fir.login.Pass_Alter_mEss;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


import com.google.firebase.auth.FirebaseAuth;


public class Login extends AppCompatActivity {
    EditText emailTextInput,passTextInput;
    FirebaseAuth Firebaseauth;
    Button sign_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailTextInput=(EditText) findViewById(R.id.mail_login);
        passTextInput=(EditText) findViewById(R.id.password_login);
        sign_button=(Button)findViewById(R.id.sign);
        Firebaseauth= FirebaseAuth.getInstance();


          Intent intent=new Intent(this,Home.class);
        //--------------------------FireBase-Login-Library --------------??

        FIB_login(emailTextInput
                ,passTextInput,
                sign_button,
                this,
                Firebaseauth,
                intent);

        //--------------------------Set-negvigation-Alter-message

        Email_Alert_mESS("Please Enter Email");
        Pass_Alter_mEss("Please Enter correct password");

        //--------------------------Home-Activity--------------??
    }


}