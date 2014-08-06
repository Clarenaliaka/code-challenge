package com.example.akirachix;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.os.Build;

public class WelcomeScreen extends ActionBarActivity implements OnClickListener {

	
		Button btnLogin,btnRegister;
		

	@Override
		    protected void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		        setContentView(R.layout.welcome);
		        
		        btnLogin = (Button) findViewById(R.id.btnlogin);
		        btnLogin.setOnClickListener(this);
		        
		        btnRegister = (Button) findViewById(R.id.btnregister);
		       btnRegister.setOnClickListener(this);
		      

		}
			@Override
			public void onClick(View v) {
				switch (v.getId()) {
				case R.id.btnlogin:
					Toast.makeText(WelcomeScreen.this, "karibu",Toast.LENGTH_SHORT).show();;
					startActivity(new Intent(getApplicationContext(),LoginScreen.class));
					
					
					break;
					
	              case R.id.btnregister:
	            	  startActivity(new Intent(getApplicationContext(),RegisterScreen.class));
					
					break;

				default:
					break;
				}
				
		
	}

}
