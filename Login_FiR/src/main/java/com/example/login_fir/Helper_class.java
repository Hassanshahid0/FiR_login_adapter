package com.example.login_fir;

public class Helper_class{

   private static boolean  hold;
  private static String Altermessage_Email;
  private static String AlterMessage_password;

    public static String getAltermessage_Email() {
        return Altermessage_Email;
    }

    public static void setAltermessage_Email(String altermessage_Email) {
        Altermessage_Email = altermessage_Email;
    }

    public static void setHold(boolean hold) {
        Helper_class.hold = hold;
    }

    public static void setlogin(boolean b) {
        hold=b;
    }

    public static boolean isHold() {
        return hold;
    }

    public static String getAlterMessage_password() {
        return AlterMessage_password;
    }

    public static void setAlterMessage_password(String alterMessage_password) {
        AlterMessage_password = alterMessage_password;
    }
}
