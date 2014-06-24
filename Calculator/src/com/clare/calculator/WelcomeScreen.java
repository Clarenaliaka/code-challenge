package com.clare.calculator;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;



public class WelcomeScreen extends ActionBarActivity implements OnClickListener{
	Button btnwelLogin, btnRegister;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		btnwelLogin = (Button) findViewById(R.id.btnLogin);
		btnwelLogin.setOnClickListener(this);
		
		btnRegister = (Button) findViewById(R.id.btnRegister);
		btnRegister.setOnClickListener(this);

		
	}

	@Override
	public void onClick(View v) {
	switch (v.getId()) {
	case R.id.btnLogin:
		Toast.makeText(WelcomeScreen.this, "welcome to the world of application" , Toast.LENGTH_SHORT).show();
		
		startActivity(new Intent(getApplicationContext(),LoginScreen.class));
		break;
		
    case R.id.btnRegister:
	    Toast.makeText(WelcomeScreen.this, "Work is done" , Toast.LENGTH_SHORT).show();
		
	   startActivity(new Intent(getApplicationContext(),RegisterScreen.class));
		
		break;

	default:
		break;
	}
		
	}

}