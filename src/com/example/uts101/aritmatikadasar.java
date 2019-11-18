package com.example.uts101;

import android.os.Bundle;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.app.Fragment;
import android.app.FragmentManager;

public class aritmatikadasar extends Fragment{
	EditText as;
	Button def;
	TextView dat;
	
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
View rootView = inflater.inflate(R.layout.layout_aritmatikadasar, container, false);
as = (EditText)rootView.findViewById(R.id.ettext);
def = (Button)rootView.findViewById(R.id.btnenter);
dat = (TextView)rootView.findViewById(R.id.tvclear);

def.setOnClickListener(new View.OnClickListener(){

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		int ad = Integer.parseInt(as.getText().toString());
		if (ad==2){
			dat.setText("anda benar");
		} else{
			dat.setText("Anda salah");
		}
		}
	});
	return rootView;
	
}
}