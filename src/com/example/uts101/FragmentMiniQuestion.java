package com.example.uts101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentMiniQuestion extends Fragment{
 EditText xa;
 EditText xb;
 EditText xc;
 Button bmini;
 TextView xhasil1;
 TextView xhasil2;
 TextView xhasil3;
 @Override
 public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
  View rootView = inflater.inflate(R.layout.fragment_miniquestion, container, false);
  	xa = (EditText)rootView.findViewById(R.id.etmini1);
  	xb = (EditText)rootView.findViewById(R.id.etmini2);
  	xc = (EditText)rootView.findViewById(R.id.etmini3);
  	bmini = (Button)rootView.findViewById(R.id.btnmini1);
  	xhasil1 = (TextView)rootView.findViewById(R.id.tvjawab1);
  	xhasil2 = (TextView)rootView.findViewById(R.id.tvjawab2);
  	xhasil3 = (TextView)rootView.findViewById(R.id.tvjawab3);
  
  bmini.setOnClickListener(new View.OnClickListener() {
   
   @Override
   public void onClick(View arg0) {
    // TODO Auto-generated method stub
    String result1 = xa.getText().toString();
    if(result1.equals("YES") || result1.equals("Yes") || result1.equals("yes")) {
     xhasil1.setText("bisa jadi");
    } else if (result1.equals("NO") || result1.equals("No") || result1.equals("no")){
     xhasil1.setText("mungkin saja");
    }
    
    String result2 = xb.getText().toString();
    if(result2.equals("YES") || result2.equals("Yes") || result2.equals("yes")) {
     xhasil2.setText("ya");
    } else if (result2.equals("NO") || result2.equals("No") || result2.equals("no")){
     xhasil2.setText("tidak ");
    }
    
    String result3 = xc.getText().toString();
    if(result3.equals("YES") || result3.equals("Yes") || result3.equals("yes")) {
     xhasil3.setText("memang betul");
    } else if(result3.equals("NO") || result3.equals("No") || result3.equals("no")){
     xhasil3.setText("apakah anda serius?");
    }
   }
  });
  return rootView;
 }
}