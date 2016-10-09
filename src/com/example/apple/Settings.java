package com.example.apple;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;

public class Settings extends Activity {

	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		ToggleButton mTogBtn = (ToggleButton) findViewById(R.id.mTogBtn); // 获取到控件  
		mTogBtn.setOnCheckedChangeListener(new OnCheckedChangeListener() {  
		  
		    @Override  
		    public void onCheckedChanged(CompoundButton mTogBtn,boolean isChecked) {  
		        // TODO Auto-generated method stub  
		        if(isChecked){
		            //选中  
		        }else{
		            //未选中  
		        }  
		    }  
		});// 添加监听事件
	}
}