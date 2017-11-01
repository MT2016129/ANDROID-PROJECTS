package com.example.eclectika2015;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

public class majorCatOfevents extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.majoevents);
       	
	}
	public void mega(View view)
    {
    Toast.makeText(this,"patient's record deleted",Toast.LENGTH_SHORT).show(); 
    Intent newActivity1 = new Intent(this, Next.class);
    newActivity1.putExtra("bucketno", 1);
    startActivity(newActivity1);
	//Intent i = new Intent(this, Next.class);
	//startActivity(i);
    }
	public void cult(View view)
    {
    Toast.makeText(this,"patient's record deleted",Toast.LENGTH_SHORT).show(); 
    Intent newActivity1 = new Intent(this, Next.class);
    newActivity1.putExtra("bucketno", 2);
    startActivity(newActivity1);
	//Intent i = new Intent(this, Next.class);
	//startActivity(i);
    }
	public void lit(View view)
    {
    Toast.makeText(this,"patient's record deleted",Toast.LENGTH_SHORT).show(); 
    Intent newActivity1 = new Intent(this, Next.class);
    newActivity1.putExtra("bucketno", 3);
    startActivity(newActivity1);
	//Intent i = new Intent(this, Next.class);
	//startActivity(i);
    }
	public void digi(View view)
    {
    Toast.makeText(this,"patient's record deleted",Toast.LENGTH_SHORT).show(); 
    Intent newActivity1 = new Intent(this, Next.class);
    newActivity1.putExtra("bucketno", 4);
    startActivity(newActivity1);
	//Intent i = new Intent(this, Next.class);
	//startActivity(i);
    }
	public void misc(View view)
    {
    Toast.makeText(this,"patient's record deleted",Toast.LENGTH_SHORT).show(); 
    Intent newActivity1 = new Intent(this, Next.class);
    newActivity1.putExtra("bucketno", 5);
    startActivity(newActivity1);
    //Intent i = new Intent(this, Next.class);
	//startActivity(i);
    }
	
	 public void onBackPressed() {
         // boolean fromNewActivity=true;

  //Intent mainIntent = new Intent(this, Newer.class);
//  Bundle bundleObj = new Bundle();
 // bundleObj.putString("fromNewActivity", Boolean.toString(fromNewActivity));
  //mainIntent.putExtras(bundleObj);
 // startActivityForResult(mainIntent, 0);
	 Log.e("onBackPressed","chal raha h ye ..");
	 super.onBackPressed();
	 this.finish();
	 Intent mainIntent = new Intent(this, MainActivity.class);
	 startActivity(mainIntent);
	 
  
     }
	/** public boolean onKeyDown(int keycode, KeyEvent event) {
		    if (keycode == KeyEvent.KEYCODE_BACK) {
		        moveTaskToBack(true);
		    }
		    return super.onKeyDown(keycode, event);
		}**/
}
