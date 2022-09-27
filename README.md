![sign in](https://user-images.githubusercontent.com/106225281/192548389-72114f52-2700-47e3-8876-9eab38ffd22d.jpeg)

# Firebase Authentication

[![](https://jitpack.io/v/L1F20BSCS0169/FiR_login_adapter.svg)](https://jitpack.io/#L1F20BSCS0169/FiR_login_adapter)

## Installation

Install my-project with Gradel

```bash
  repositories {
	              maven{ url 'https://jitpack.io' }
	            }
```
```bash
  dependencies 
         {
	        implementation 'com.github.L1F20BSCS0169:FiR_login_adapter:Tag'
	     }
```
    
## Usage

Library provides set of static methods:

* Sign In
* Sign Up
* Sign Out
* Password Forget
* Password Change
* Verification Email
* Protected Routes with Authorization
* Roles-based Authorization
* Social Logins with Google, Facebook and Twitter

## Documentation

Sign In with Email and Password

```bash
  signinwithemailandpoassword
                (emailTextInput       // Edittext Email
                ,passTextInput,       // Edittext password
                sign_button,          // Button
                this,                 // Context
                Firebaseauth,         // Authentication referance
                intent);              // Activity referance
```

## How to use

### java file
```bash
        //--------------------------FireBase Auth--------------??
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
```

### XML File
```bash
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"

    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/color">

    <LinearLayout
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <ImageView
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="2"
            android:maxHeight="13dp"
            android:scaleType="centerCrop"
            android:src="@drawable/background" />
    </LinearLayout>


    <LinearLayout
        android:gravity="center"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <TextView
            android:layout_margin="?actionBarSize"
            android:textStyle="bold"
            android:textSize="40sp"
            android:textColor="#63C9BB"
            android:text="Sign in"

            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />

        <EditText

            android:id="@+id/mail_login"
            android:layout_width="match_parent"
            android:layout_height="?actionBarSize"
            android:layout_margin="20dp"
            android:background="@drawable/roundcorner"
            android:hint="@string/email"
            android:inputType="textEmailAddress"
            android:paddingStart="15dp"
            android:textColor="#1C1B1B"
            android:textColorHint="#191818"
            android:textSize="20sp" />

        <EditText
            android:id="@+id/password_login"
            android:layout_width="match_parent"
            android:layout_height="?actionBarSize"
           android:layout_marginStart="20dp"
            android:layout_marginEnd="20dp"
            android:background="@drawable/roundcorner"
            android:hint="@string/password"
            android:inputType="textPassword"
            android:paddingLeft="15dp"
            android:textColor="#1C1B1B"
            android:textColorHint="#1C1B1B"
            android:textSize="17sp" />

        <Button
            android:id="@+id/sign"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:backgroundTint="#92D888"
            android:paddingLeft="30dp"
            android:paddingRight="30dp"
            android:text="@string/sign_in"
            android:textColor="#121111"
            android:textSize="15sp" />

        <TextView
            android:id="@+id/signuppage"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/don_t_have_an_account_sign_up"
            android:textSize="15sp" />

    </LinearLayout>
</RelativeLayout>
```





