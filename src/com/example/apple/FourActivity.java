package com.example.apple;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class FourActivity extends Activity{
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Log.d("BaseActivity", getClass().getSimpleName());
	}
}
