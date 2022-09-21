package com.example.login_fib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //-------------------Firebase Auth---------------------??
        FirebaseAuth mauth = FirebaseAuth.getInstance();
        FirebaseUser user = mauth.getCurrentUser();

        //-------------------Splash Screen-------------------??

        new Handler().postDelayed(() -> {
            // This method will be executed once the timer is over
            if (user != null) {
                startActivity(new Intent(MainActivity.this, Login.class));
                finish();
            } else {
                Intent i = new Intent(MainActivity.this, Registration.class);
                startActivity(i);
                finish();
            }

        }, 1000);

    }

}