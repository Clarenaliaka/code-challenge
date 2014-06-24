package com.clare.calculator;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class HomeScreen extends ActionBarActivity implements OnClickListener  {
	
	EditText etNumberone,etNumbertwo,etresults;
	TextView tvresults;
	
	Button btnadd,btnsubtraction,btndivision,btnmultiply;
	String strNumberone, strNumbertwo, strresults;
	operation oper;
	
	int Numberone,Numbertwo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		etNumberone = (EditText) findViewById(R.id.etnumberone);
		
		
		etNumbertwo = (EditText) findViewById(R.id.etnumbertwo);
		
		
		
		tvresults = (TextView) findViewById(R.id.tvresults);
		
		btnadd      = (Button) findViewById(R.id.btnadd);
		btnadd.setOnClickListener(this); 
		
		btnsubtraction = (Button) findViewById(R.id.btnsubtraction);
		btnsubtraction.setOnClickListener(this);
		
		btndivision    = (Button) findViewById(R.id.btndivision);
		btndivision.setOnClickListener(this);
		
		btnmultiply    = (Button) findViewById(R.id.btnmultiply);
		btnmultiply.setOnClickListener(this);
	
		oper = new operation();
			
			
		}
			
			@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btnadd:
				//Integer to string.
				strNumberone=etNumberone.getText().toString();
				strNumbertwo=etNumbertwo.getText().toString();
				
				int Numberone = Integer.parseInt(strNumberone);
				int Numbertwo = Integer.parseInt(strNumbertwo);
				int result = oper.addition(Numberone,Numbertwo);
				
				String Result= String.valueOf(result);
				tvresults.setText(Result);
				
				break;
				
				 case R.id.btnsubtraction:
					 
					//Integer to string.
						strNumberone=etNumberone.getText().toString();
						strNumbertwo=etNumbertwo.getText().toString();
						
						int Numberone1 = Integer.parseInt(strNumberone);
						int Numbertwo1 = Integer.parseInt(strNumbertwo);
						
						//converting string to integer
					 
						int ans = oper.subtraction(Numberone1,Numbertwo1);
						String results= String.valueOf(ans);
						tvresults.setText(results);
						break;
				
				
				
				 case R.id.btnmultiply:
			     	  
					 //Integer to string.
						strNumberone=etNumberone.getText().toString();
						strNumbertwo=etNumbertwo.getText().toString();
						
						int Numberone2 = Integer.parseInt(strNumberone);
						int Numbertwo2 = Integer.parseInt(strNumbertwo);
					 
						//converting string to integer
						int answer= oper.multiplication(Numberone2,Numbertwo2);
						String Results= String.valueOf(answer);
						tvresults.setText(Results);
						break;

				
				 case R.id.btndivision:
					 
					//Integer to string.
						strNumberone=etNumberone.getText().toString();
						strNumbertwo=etNumbertwo.getText().toString();
						
						//converting string to integer
						
					   double Numberone3 =Double.parseDouble(strNumberone);
						double Numbertwo3 = Double.parseDouble(strNumbertwo);
					 
						double ans1= operation.division( Numberone3, Numbertwo3);
						String Resul= String.valueOf(ans1);
						tvresults.setText(Resul);
					 break;
					 
			       default:
				
				
			      
			}
			
			
			}
	}
	
		 
		
		
		
		
	





	