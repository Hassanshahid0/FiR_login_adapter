package com.example.login_fib;

import static com.example.login_fir.Sign_out.signout;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;


public class Home extends AppCompatActivity {

    FirebaseAuth mauth;
    Button signout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        signout=findViewById(R.id.signout);


        //--------------------------get Instance --------------??
        mauth = FirebaseAuth.getInstance();

        //--------------------------After signout Activity --------------??

        Intent intent=new Intent(this,Login.class);

        //-------------------------- signout Function --------------??

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signout(Home.this,
                        mauth,
                        intent);
            }
        });


        //-------------------------- Email change Function --------------??

    }
}