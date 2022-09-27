package com.example.login_fir;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Sign_out {

    public static void signout(Context context, FirebaseAuth mauth, Intent intent)
    {
        if (mauth.getCurrentUser() != null) {
            mauth.signOut();
            context.startActivity(intent);
            ((Activity) context).finish();
        }
    }

    public static void Email_change(EditText newEmail,Context context,String update,String Failed)
    {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        user.updateEmail(newEmail.getText().toString().trim())
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(context, "Email address is updated.", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(context, "Failed to update email!", Toast.LENGTH_LONG).show();
                        }
                    }

                });
    }

    public static void Forget_Password(EditText Email,String message,Context context,FirebaseAuth mauth)
    {
        String email = Email.getText().toString().trim();
      /*mauth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
          @Override
          public void onComplete(@NonNull Task<Void> task) {
              if(task.isSuccessful())
              {
                  AlertDialog.Builder builder = new AlertDialog.Builder(context);
                  builder.setMessage(message);
                  builder.setCancelable(false);
                  builder.show();
                  return;
              }
          }
      });*/
        mauth.sendPasswordResetEmail(email)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(context, "send!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    public static void text_span(TextView textView, String Message,int start_span,int end_span, Context context, Intent intent)
    {

        String text = Message;
        SpannableString spannableString = new SpannableString(text);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                context.startActivity(intent);
                ((Activity) context).finish();
            }
        };
        spannableString.setSpan(clickableSpan1, start_span,end_span, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
