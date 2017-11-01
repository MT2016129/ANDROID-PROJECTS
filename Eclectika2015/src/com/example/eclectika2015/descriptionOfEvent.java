package com.example.eclectika2015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class descriptionOfEvent extends Activity{
	
	String value;
	@SuppressLint("NewApi")
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.eventsdesc);
       value = getIntent().getExtras().getString("name");
       
       Log.e("recieved from previoes",""+value);
       
       TextView tv= (TextView)findViewById(R.id.textView1);
       tv.setText(value);
       
	
	
	/**
	  @SuppressLint("NewApi")
		private ArrayList<String> populate() {
	    	Log.e("1","populate me aa gye   ");
	    	String evename="mega";
	    	//check kaun se type k event me click kiya hai bande ne 
	    	
	        **/
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

			StrictMode.setThreadPolicy(policy); 

		//	ArrayList<String> item = new ArrayList<String>();
			//ArrayList<String> eveid = new ArrayList<String>();
			TextView tv1= (TextView)findViewById(R.id.textView2);
			TextView tv2= (TextView)findViewById(R.id.textView3);
	        
			TextView tv3= (TextView)findViewById(R.id.textView4);
	        
	        try {
	        	Log.e("1","before caling the url ");
	            
	            URL url = new URL("http://10.0.2.2:8080/a2.php?action="+value);
	            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
	            urlConnection.setRequestMethod("GET");
	            urlConnection.connect();
	            Log.e("121","connection established ");
	                        // gets the server json data
	            BufferedReader bufferedReader = 
	                new BufferedReader(new InputStreamReader(
	                        urlConnection.getInputStream()));
	            
	            Log.e("T","1faltu");
	            
	            String next;
	            //Log.e("ee",bufferedReader.readLine());
	            while ((next = bufferedReader.readLine()) != null){
	                JSONArray ja = new JSONArray(next);
	                Log.e("T","1faltu while k andar ");
	                for (int i = 0; i < ja.length(); i++)
	                {
	                	
	                	 Log.e("T","for loop k andar .." +"");
		                    Log.e("T","11faltu");
	                    JSONObject jo = (JSONObject) ja.get(i);
	                    
	                   /** eveid.add(jo.getString("eid"));
	                    item.add(jo.getString("ename"));
	                    
	                    **/
	                  
	                    String se= Html.fromHtml((String) jo.getString("description")).toString();
	                   tv1.setText(se);
	                   // tv1.setText(jo.getString("description"));
	                    tv2.setText(jo.getString("contact"));
	                    tv3.setText(jo.getString("prize"));
	                    
	                    Log.e("T",jo.getString("ename"));
	                    Log.e("T","11faltu");
	                }
	            }
	        } catch (MalformedURLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (JSONException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        
	        
	    }
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
			// TODO Auto-generated method stub
			
		}

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
		}
}
