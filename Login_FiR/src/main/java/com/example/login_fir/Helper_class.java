package com.example.login_fir;



import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Helper_class{

  private static String Sign_in_Auth;
  private static String Altermessage_Email;
  private static String AlterMessage_password;

    public static String getAltermessage_Email() {
        return Altermessage_Email;
    }

    public static void setAltermessage_Email(String altermessage_Email) {
        Altermessage_Email = altermessage_Email;
    }

    public static String getSign_in_Auth() {
        return Sign_in_Auth;
    }

    public static void setSign_in_Auth(String sign_in_Auth) {
        Sign_in_Auth = sign_in_Auth;
    }

    public static String getAlterMessage_password() {
        return AlterMessage_password;
    }

    public static void setAlterMessage_password(String alterMessage_password) {
        AlterMessage_password = alterMessage_password;
    }


}
