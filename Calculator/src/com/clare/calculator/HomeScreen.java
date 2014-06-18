package com.clare.calculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;



public class HomeScreen extends ActionBarActivity implements OnClickListener {
	EditText etnumberone,etnumbertwo;
	Button btnadd,btnsubtraction,btndivision,btnmultiply,btnresults;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		etnumberone = (EditText) findViewById(R.id.etnumberone);
		etnumberone.setOnClickListener(this);
		
		etnumberone = (EditText) findViewById(R.id.etnumbertwo);
		etnumbertwo.setOnClickListener(this);
		
		btnadd      = (Button) findViewById(R.id.btnadd);
		btnadd.setOnClickListener(this);
		
		btnsubtraction = (Button) findViewById(R.id.btnsubtraction);
		btnsubtraction.setOnClickListener(this);
		
		btndivision    = (Button) findViewById(R.id.btndivision);
		btndivision.setOnClickListener(this);
		
		btnmultiply    = (Button) findViewById(R.id.btnmultiply);
		btnmultiply.setOnClickListener(this);
		
		btnresults    = (Button) findViewById(R.id.btnresults);
		btnresults.setOnClickListener(this);
	







		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnadd:
			
			break;
			
		case R.id.btnsubtraction:
			
			break;
		case R.id.btndivision:
	
			break;
		case R.id.btnmultiply:
	
			break;

		default:
			break;
		}
	
		
	}

}
