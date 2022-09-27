package com.example.login_fir;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Sign_up {

    public static void FIB_Register(EditText Email, EditText Password, Button signup_, int passwordLength, Context context, FirebaseAuth mauth, Intent intent)
    {

        signup_.setOnClickListener(new View.OnClickListener() {
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
                }
                mauth.createUserWithEmailAndPassword(email,password).addOnCompleteListener((Activity) context, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (!task.isSuccessful()) {
                            Toast.makeText(context, "Authentication failed." + task.getException(),
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            context.startActivity(intent);
                            ((Activity) context).finish();
                        }
                    }
                });
            }

        });
    }

    public static void Email_Alert_Reg(String Message)
    {
        Helper_class.setAltermessage_Email(Message);
    }
    public static void Pass_Alter_Reg(String pass)
    {
        Helper_class.setAlterMessage_password(pass);
    }

    public static void sign_up_Auth(String Message)
    {
        Helper_class.setSign_in_Auth(Message);
    }
}
