
# Firebase login Adapter

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
### signinwithemailandpoassword
                (emailTextInput       // Edittext Email
                ,passTextInput,       // Edittext password
                sign_button,          // Button
                this,                 // Context
                Firebaseauth,         // Authentication referance
                intent);              // Activity referance
```

## How to use

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

Example Color | ![#0a192f](https://via.placeholder.com/10/0a192f?text=+) #0a192f





