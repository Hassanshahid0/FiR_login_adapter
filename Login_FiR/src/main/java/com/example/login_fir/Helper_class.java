package com.example.login_fir;

public class Helper_class{

   public static int login_value=1;
  private static String Altermessage_Email;
  private static String AlterMessage_password;

    public static String getAltermessage_Email() {
        return Altermessage_Email;
    }

    public static void setAltermessage_Email(String altermessage_Email) {
        Altermessage_Email = altermessage_Email;
    }

    public static int getLogin_value() {
        return login_value;
    }

    public static void setLogin_value(int login_value) {
        Helper_class.login_value = login_value;
    }

    public static String getAlterMessage_password() {
        return AlterMessage_password;
    }

    public static void setAlterMessage_password(String alterMessage_password) {
        AlterMessage_password = alterMessage_password;
    }
}
