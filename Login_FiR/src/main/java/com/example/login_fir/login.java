package com.example.login_fir;

import android.app.AlertDialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class login {


    public static void FIB_login(EditText Email, EditText Password, Button sign_in, Context loginn, FirebaseAuth mauth) {



        sign_in.setOnClickListener(view -> {
            String email = Email.getText().toString().trim();
            String password = Password.getText().toString().trim();
             boolean hold;

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
            mauth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {


                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Helper_class.setlogin(true);
                    }
                }
            });

        });
    }

    public static boolean login_state()
    {
      return Helper_class.isHold();
    }

    public static void Email_Alert_mESS(String Message)
    {
     Helper_class.setAltermessage_Email(Message);
    }
    public static void Pass_Alter_mEss(String pass)
    {
        Helper_class.setAlterMessage_password(pass);
    }



    public static void FIB_Register(EditText Email, EditText Password, Button sign_up,int passwordLength, Context context, FirebaseAuth mauth)
        {
            sign_up.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String email = Email.getText().toString().trim();
                    String password = Password.getText().toString().trim();

                    //----CHECKING THE EMPTINESS OF THE EDITTEXT-----
                    if (email.equals("")) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        builder.setMessage(Helper_class.getAltermessage_Email());
                        builder.setTitle("Signup Error");
                        builder.setCancelable(false);
                        builder.setNegativeButton("Try Again", null);
                        builder.show();
                        return;
                    }

                    if (password.length() < passwordLength) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        builder.setMessage(Helper_class.getAlterMessage_password());
                        builder.setTitle("Signup Error");
                        builder.setCancelable(false);
                        builder.setNegativeButton("Try Again", null);
                        builder.show();
                        return;
                    }
                }
            });
        }

        public static void signout()
        {
            FirebaseAuth.getInstance().signOut();
        }


    }