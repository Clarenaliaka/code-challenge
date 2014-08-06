package com.clare.calculator;



import android.support.v7.app.ActionBarActivity;
import android.text.InputType;
import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;


public class LoginScreen extends ActionBarActivity implements OnClickListener {
	//Declaration
	EditText etemail,etpassword;
	
	Button   btncancel,btnLogin,btnchkcmnd;
	
	ToggleButton passtogg;
	protected int  TYPE_NUMBER_VARIATION_PASSWORD; 
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		//Initialization
		//Object MediaPlayer = MediaPlayer.create(LoginScreen.this, resid);
		etemail = (EditText) findViewById(R.id.etemail);
		etpassword = (EditText) findViewById(R.id.etpassword);
		
		btncancel = (Button) findViewById(R.id.btnsubmit);
		btncancel.setOnClickListener(this);
		
		btnLogin = (Button) findViewById(R.id.btncancel);
		btnLogin.setOnClickListener(this);
		
		 btnchkcmnd = (Button) findViewById(R.id.btnresult);
		
		 passtogg = (ToggleButton)  findViewById(R.id.tbpassword);
	       passtogg.setOnClickListener(new OnClickListener() {
			
	    
			@Override
			public void onClick(View v) {
			if (passtogg.isChecked()){
			etpassword.setInputType( TYPE_NUMBER_VARIATION_PASSWORD);
				
				
			} else {
				etpassword.setInputType(InputType.TYPE_CLASS_TEXT);

			}
			}
		});
	       
	       btnchkcmnd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			String check = etpassword.getText().toString();
			if (check.contentEquals("left")) {
				
				//Display.setGravity(Gravity.LEFT);
				
			}else if (check.contentEquals("center")) {
				
			}else if (check.contentEquals("right")) {
				
			}
		
			}
		});   
	    			 
	       
	       
	       

		
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
