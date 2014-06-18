package com.clare.calculator;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginScreen extends ActionBarActivity implements OnClickListener {
	//Declaration
	EditText etemail,etpassword;
	
	Button   btncancel,btnLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		//Initialization
		etemail = (EditText) findViewById(R.id.etemail);
		etpassword = (EditText) findViewById(R.id.etpassword);
		btncancel = (Button) findViewById(R.id.btnsubmit);
		btncancel.setOnClickListener(this);
		
		btnLogin = (Button) findViewById(R.id.btncancel);
		btnLogin.setOnClickListener(this);

		
	}

	@Override
	public void onClick(View v ) {
		switch (v.getId()) {
		case R.id.btnsubmit:
			Toast.makeText(LoginScreen.this, "Feel free and login" , Toast.LENGTH_SHORT).show();
			startActivity(new Intent(getApplicationContext(),HomeScreen.class));
			
			break;
			
       case R.id.btncancel:
    	   Toast.makeText(LoginScreen.this, "Dont worry it will still work" , Toast.LENGTH_SHORT).show();
    	   startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
			
			break;


		default:
			break;
		}
		
		
	}

}
