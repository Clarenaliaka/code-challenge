package com.clare.calculator;

import java.util.ArrayList;
import java.util.List;

import android.R.string;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterScreen extends ActionBarActivity implements OnClickListener {
	//Declaration
	EditText etfirstname,etid,etemail,etpassword;
	Button btnsubmit,btncancel;
	Spinner spinner1;
	

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
	
		//adding items into spinner
		List<String> list = new ArrayList<String>();
		list.add("Kakamega");
		list.add("Kisumu");
		list.add("Eldoret");
		list.add("Kericho");
		list.add("Nakuru");
		list.add("Naivasha");
		list.add("Mombasa");
		//defining design
		
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(dataAdapter);
		}
	//getting the value of the selected drop drown list
	public void addListenerOnSpinnerItemSelect() {
		//initializing spinner
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			//This is show the button to be clicked
			public void onItemSelected(AdapterView<?> parent, View view,
					int pos, long id) {
			String	item = parent.getItemAtPosition(pos).toString();
				
				// shows the selected spinner
				Toast.makeText(parent.getContext(),"spinner1 : "+ String.valueOf(spinner1.getSelectedItem()), Toast.LENGTH_SHORT).show();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
			
		});;
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
