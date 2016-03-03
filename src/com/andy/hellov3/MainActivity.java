package com.andy.hellov3;

import com.andy.v304.*;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

@SuppressWarnings("deprecation")
public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button v302 = (Button)findViewById(R.id.v302);
		v302.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
		        intent.putExtra("name","Sally");    
		        intent.setClass(MainActivity.this, StartActivity.class);
		        MainActivity.this.startActivity(intent);
			}
		});
		
		Button v303 = (Button)findViewById(R.id.v303);
		v303.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
		        intent.putExtra("name","Andy");    
		        intent.setClass(MainActivity.this, V303StartActivity.class);
		        MainActivity.this.startActivity(intent);
			}
		});
		
		Button v304 = (Button)findViewById(R.id.v304);
		v304.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
		        intent.putExtra("name","Andy");    
		        intent.setClass(MainActivity.this, com.andy.v304.StartActivity.class);
		        MainActivity.this.startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
