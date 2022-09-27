

# Firebase Authentication



## Installation

 Gradel

```bash
  repositories {
	              maven{ url 'https://jitpack.io' }
	            }
```
```bash
  dependencies 
         {
	        implementation 'com.github.L1F20BSCS0169:FiR_login_adapter:0.1.6.92'
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

### Sign In with Email and Password

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

## Screenshots

<img src="https://user-images.githubusercontent.com/106225281/192549196-255cc076-8182-4634-9853-f52e1b8f8a6c.jpeg" width="200" height="400"> <img src="https://user-images.githubusercontent.com/106225281/192557821-3cce30d7-9a8e-4121-a558-6c3ca639f132.jpeg" width="200" height="400"> <img src="https://user-images.githubusercontent.com/106225281/192555273-ae7d69e0-f45b-4aaa-9ebe-35b7c66b1f60.jpeg" width="200" height="400"> 


## Sign Up with Email and Password

```bash

  createUserWithEmailAndPassword
                (Remail,        // Edittext Email
                 Rpassword,     // Edittext password
                 buttonsubmit,  // Button
                 this,          // Context
                 Firebaseauth,   // Authentication referance
                 intent);        // Activity referance
		 
```
## How to use

### java file
```bash
       //--------------------------Firebase Auth--------------??
        Firebaseauth= FirebaseAuth.getInstance();

        //--------------------------Home-Activity--------------??
        Intent intent=new Intent(this,Home.class);

        //--------------------------Set-negvigation-Alter-message
        Email_Alert_Reg("Enter Email");
        Pass_Alter_Reg("Enter password");

        //--------------------------FIB_Register--------------??
        createUserWithEmailAndPassword
                (Remail,
                Rpassword,
                buttonsubmit,
                this,
                 Firebaseauth,
                 intent);
```

### XML File
```bash
<?xml version="1.0" encoding="utf-8"?>
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
            android:text="@string/sign_up"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />




        <EditText
            android:id="@+id/mail"
            android:layout_width="match_parent"
            android:layout_height="?actionBarSize"
            android:layout_margin="20dp"
            android:background="@drawable/roundcorner"
            android:hint="@string/email"
            android:inputType="textEmailAddress"
            android:paddingLeft="15dp"
            android:textColor="#1C1B1B"
            android:textColorHint="#1C1B1B"
            android:textSize="17sp" />

        <EditText
            android:id="@+id/password"
            android:layout_width="match_parent"
            android:layout_height="?actionBarSize"
            android:layout_margin="20dp"
            android:background="@drawable/roundcorner"
            android:hint="Password"
            android:inputType="textPassword"
            android:paddingLeft="15dp"
            android:textColor="#1C1B1B"
            android:textColorHint="#1C1B1B"
            android:textSize="17sp" />

        <Button
            android:id="@+id/signup_btn"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:backgroundTint="#92D888"
            android:paddingLeft="30dp"
            android:paddingRight="30dp"
            android:text="@string/sign_up"
            android:textColor="#121111"
            android:textSize="15sp" />
    </LinearLayout>


</RelativeLayout>
```

## Screenshots

<img src="https://user-images.githubusercontent.com/106225281/192549196-255cc076-8182-4634-9853-f52e1b8f8a6c.jpeg" width="200" height="400"> <img src="https://user-images.githubusercontent.com/106225281/192557821-3cce30d7-9a8e-4121-a558-6c3ca639f132.jpeg" width="200" height="400"> <img src="https://user-images.githubusercontent.com/106225281/192555273-ae7d69e0-f45b-4aaa-9ebe-35b7c66b1f60.jpeg" width="200" height="400">

 
