package com.clare.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterScreen extends ActionBarActivity implements OnClickListener {
	//Declaration
	EditText etfirstname,etid,etemail,etpassword;
	Button btnsubmit,btncancel; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
	
		//Initialization
		etfirstname = (EditText) findViewById(R.id.etfirstname);
     	etid = (EditText) findViewById(R.id.etid);
		
		etemail = (EditText) findViewById(R.id.etregemail);
		etpassword = (EditText) findViewById(R.id.etregpassword);
	
		
		btnsubmit = (Button) findViewById(R.id.btnregsubmit);
		btnsubmit.setOnClickListener(this);
		
		btncancel = (Button) findViewById(R.id.btnregcancel);
		btncancel.setOnClickListener(this);
		
		

	
	}

	@Override
	public void onClick(View v) {
	switch (v.getId()) {
	case R.id.btnregsubmit:
		Toast.makeText(RegisterScreen.this, "What a wonderful job" , Toast.LENGTH_SHORT).show();
		startActivity(new Intent(getApplicationContext(),LoginScreen.class));
		
		break;
		
case R.id.btnregcancel:
	    Toast.makeText(RegisterScreen.this, "Dont giveup" , Toast.LENGTH_SHORT).show();
		startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
		break;


	default:
		break;
	}
		
	}

}
