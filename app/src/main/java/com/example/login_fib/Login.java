package com.example.login_fib;

import static com.example.login_fir.Sign_out.text_span;
import static com.example.login_fir.login.Email_Alert_Login;
import static com.example.login_fir.login.Pass_Alter_Login;
import static com.example.login_fir.login.signinwithemailandpoassword;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.google.firebase.auth.FirebaseAuth;


public class Login extends AppCompatActivity {
    EditText emailTextInput,passTextInput;
    TextView signup;
    FirebaseAuth Firebaseauth;
    Button sign_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailTextInput=(EditText) findViewById(R.id.mail_login);
        passTextInput=(EditText) findViewById(R.id.password_login);
        sign_button=(Button)findViewById(R.id.sign);
        signup=findViewById(R.id.signuppage);
        Firebaseauth= FirebaseAuth.getInstance();

         //--------------------------Home-Activity--------------??
          Intent intent=new Intent(this,Home.class);

        //--------------------------FireBase-Login-Library --------------??

        signinwithemailandpoassword
                (emailTextInput
                ,passTextInput,
                sign_button,
                this,
                Firebaseauth,
                intent);

        //--------------------------Set-negvigation-Alter-message

        Email_Alert_Login("please Enter Email");
        Pass_Alter_Login("please Enter password");

        //--------------------------Signup-Activity--------------??
        Intent intent_span=new Intent(this,Registration.class);
        text_span(signup,
                "Don't have an account? Sign up",
                23,
                30,
                this,
                intent_span);
    }
}