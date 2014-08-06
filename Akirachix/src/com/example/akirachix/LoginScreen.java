package com.example.akirachix;

import android.support.v7.app.ActionBarActivity;
import android.text.InputType;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethod;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class LoginScreen extends ActionBarActivity implements OnClickListener {

		EditText etlogemail;
		EditText etlogpassword;
		Button    btnCancel,btnchkcmnd,btnlogin;
		ToggleButton passtogg;
		protected int  TYPE_NUMBER_VARIATION_PASSWORD; 
		
		
		protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.login);
	        etlogemail =(EditText) findViewById(R.id.etlogemail);
	        etlogpassword =(EditText) findViewById(R.id.etlogpassword);
	        btnCancel = (Button) findViewById(R.id.btnCancel);
	        btnCancel.setOnClickListener(this);
	        
	        btnlogin = (Button) findViewById(R.id.btnlogin);
	        btnlogin.setOnClickListener(this);
	        
	        btnchkcmnd = (Button) findViewById(R.id.btnresult);
		       btnchkcmnd.setOnClickListener(new OnClickListener() {
				
				
				@Override
				public void onClick(View v) {
				if (passtogg.isChecked()){
				etlogpassword.setInputType( TYPE_NUMBER_VARIATION_PASSWORD);
					
					
				} else {
					etlogpassword.setInputType(InputType.TYPE_CLASS_TEXT);

				}
				}
			});
		       passtogg = (ToggleButton) findViewById(R.id.tbpassword);
		       
		       

	}

		@Override
		public void onClick(View v) {
		switch (v.getId()) {
		
		case R.id.btnCancel:
			startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
		   break;
		   
		case R.id.btnlogin:
			startActivity(new Intent(getApplicationContext(),RegisterScreen.class));
		  break;

		default:
			break;
		}

		
	}

}
