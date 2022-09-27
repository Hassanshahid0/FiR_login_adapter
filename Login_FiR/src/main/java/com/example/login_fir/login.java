package com.example.login_fir;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;



public class login {

    public static void FIB_login(EditText Email, EditText Password, Button sign_in, Context loginn, FirebaseAuth mauth,Intent intent) {


        sign_in.setOnClickListener(view -> {
            String email = Email.getText().toString().trim();
            final String password = Password.getText().toString().trim();


            //---CHECKING IF EMAIL AND PASSWORD IS NOT EMPTY----
            if (TextUtils.isEmpty(email)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(loginn);
                builder.setMessage(Helper_class.getAltermessage_Email());
                builder.setCancelable(false);
                builder.setNegativeButton("Try Again", null);
                builder.show();
                return;
            }

            if (TextUtils.isEmpty(password)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(loginn);
                builder.setMessage(Helper_class.getAlterMessage_password());
                builder.setCancelable(false);
                builder.setNegativeButton("Try Again", null);
                builder.show();
                return;
            }

            mauth.signInWithEmailAndPassword(email, password).addOnCompleteListener((Activity) loginn,new OnCompleteListener<AuthResult>() {


                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (!task.isSuccessful()) {
                        if (Password.length() < 6) {
                            Password.setError("Error");
                        } else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(loginn);
                            builder.setTitle("Error");
                            builder.setMessage("Authentication Failed");
                            builder.setCancelable(false);
                            builder.show();
                            return;
                        }
                    } else {
                        // Intent intent = null;
                        //intent = new Intent(con,Home.class);
                        loginn.startActivity(intent);
                        ((Activity) loginn).finish();
                    }
                }
            });

        });
    }

    public static void Email_Alert_Login(String Message)
    {
        Helper_class.setAltermessage_Email(Message);
    }
    public static void Pass_Alter_Login(String pass)
    {
        Helper_class.setAlterMessage_password(pass);
    }

    public static void sign_in_Auth(String Message)
    {
        Helper_class.setSign_in_Auth(Message);
    }

}