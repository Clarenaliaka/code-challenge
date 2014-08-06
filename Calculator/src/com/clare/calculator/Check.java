package com.clare.calculator;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.os.Bundle;

public class Check extends ActionBarActivity implements OnClickListener {
CheckBox chkmeat,chksukuma,chksaga,chkfish,chkpork;
Button btndisplay;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.check);
		
		//calling and creating a method
		addListenerOnchkmeat();
		addListenerOnchksukuma();
		addListenerOnchksaga();
		addListenerOnchkfish();
		addListenerOnchkpork();
		addListenerOnbutton();
}
	
	private void addListenerOnchkpork() {
		chkmeat = (CheckBox) findViewById(R.id.chkpork);
		chkmeat.setOnClickListener(this); {
			
	}
		
	}

	private void addListenerOnchkfish() {
		chkmeat = (CheckBox) findViewById(R.id.chkfish);
		chkmeat.setOnClickListener(this); {
			
	}
		
	}

	private void addListenerOnchksukuma() {
		chkmeat = (CheckBox) findViewById(R.id.chksukuma);
		chkmeat.setOnClickListener(this); {
			
	}
		
	}

	private void addListenerOnchksaga() {
		chkmeat = (CheckBox) findViewById(R.id.chksaga);
		chkmeat.setOnClickListener(this); {
			
	}
		
	}

	private void addListenerOnchkmeat() {
		// Initialization
		
		chkmeat = (CheckBox) findViewById(R.id.chkmeat);
		chkmeat.setOnClickListener(this); {
			
	}
	}
	@Override
	public void onClick(View v) {
		// when chkmeat is checked
		if (((CheckBox)v).isChecked()) {
			Toast.makeText(Check.this, "Available", Toast.LENGTH_LONG).show();
		}
		StringBuffer result = new StringBuffer();
		result.append("meat check").append(chkmeat.isChecked());
		result.append("sukuma check").append(chksukuma.isChecked());
		result.append("fish check").append(chkfish.isChecked());
		result.append("saga check").append(chksaga.isChecked());
		result.append("pork check").append(chkpork.isChecked());
		
		Toast.makeText(Check.this, result.toString(),
				Toast.LENGTH_LONG).show();
	}
	
	
	private void addListenerOnbutton() {
		// Initialization
		
		chksukuma = (CheckBox) findViewById(R.id.chksukuma);
		chksaga = (CheckBox) findViewById(R.id.chksaga);
		chkfish = (CheckBox) findViewById(R.id.chkfish);
		chkpork = (CheckBox) findViewById(R.id.chkpork);
		btndisplay = (Button) findViewById(R.id.btndisplay);
		btndisplay.setOnClickListener(this);
	
	}
};
