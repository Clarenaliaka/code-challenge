package com.example.akirachix;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class RegisterScreen extends ActionBarActivity implements OnClickListener {


		EditText etfirstname,etsecondname,etemail,etpassword;


		String strfirstname,stretsecondname,stretemail,stretpassword;
		
		Button   btnSubmit,  btnCancel;
		

	@Override
		    protected void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		        setContentView(R.layout.register);
		        etfirstname = (EditText) findViewById(R.id.etfirstname);
		        etfirstname.setOnClickListener(this);
		        
		        etsecondname = (EditText) findViewById(R.id.etsecondname);
		        etsecondname.setOnClickListener(this);
		        
		        etemail     = (EditText) findViewById(R.id.etemail);
		        etemail.setOnClickListener(this);
		        
		        etpassword = (EditText) findViewById(R.id.etpassword);
		        etpassword.setOnClickListener(this);
		        
		        //Get Data from the EditText
		        strfirstname = etfirstname.getText().toString();
		        
		        btnSubmit = (Button) findViewById(R.id.btnSubmit);
		        btnSubmit.setOnClickListener(this);
		        
		        btnCancel = (Button) findViewById(R.id.btnCancel);
		        btnCancel.setOnClickListener(this);
		        

		}


	@SuppressLint("ShowToast") @Override
	public void onClick(View v) {
		switch (v.getId()) {
		
				
		case R.id.btnSubmit:
			Toast.makeText(RegisterScreen.this, strfirstname , Toast.LENGTH_SHORT);
		
		break;

		case R.id.btnCancel:
		 
		break;


		default:
			break;
		}
		
	}

}
