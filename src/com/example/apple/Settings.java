package com.example.apple;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;

public class Settings extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ToggleButton mTogBtn = (ToggleButton) findViewById(R.id.mTogBtn); // ��ȡ���ؼ�  
		mTogBtn.setOnCheckedChangeListener(new OnCheckedChangeListener() {  
		  
		    @Override  
		    public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {  
		        // TODO Auto-generated method stub  
		        if(isChecked){  
		            //ѡ��  
		        }else{  
		            //δѡ��  
		        }  
		    }  
		});// ��Ӽ����¼�
	}
}