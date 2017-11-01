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
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Next extends Activity implements OnClickListener {
	ListView lv;
	 ////
	 static int value;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.newfile);
       value = getIntent().getExtras().getInt("bucketno");
       
       Log.e("recieved from previoes",""+value);
       	
       lv=(ListView)findViewById(R.id.list);
       @SuppressWarnings({ "unchecked", "rawtypes" })
	ArrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,this.populate());
       Log.e("1","yahan tak koi dikkat nai hai.. iske baad adapter chalu hoga  ");
       lv.setAdapter(adapter);
       Log.e("1wee","yahan tak koi dikkat nai hai.. iske baad adapter chalu hoga  ");
       
       
       lv.setOnItemClickListener(new OnItemClickListener()
       {
       	    @Override
       	    public void onItemClick(AdapterView<?> parent, View view, int position, long id) 
          	 {
       	    	Log.w("T","000000000000000000000000000");
          	  	 int itemPosition=position;
          	   	String itemVal=(String)lv.getItemAtPosition(itemPosition);
       	        switch( itemPosition )
       	        {
       	        case 0:  Intent nA0 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
       	        		nA0.putExtra("name", itemVal);
       	        		//nA0.putExtra("playlist_name", pn);
       	        		//nA0.putExtra("username", un);
       	        		//Toast.makeText(this,""+itemVal,Toast.LENGTH_SHORT).show(); 
       	        		 Log.w("T","111111111111"+itemVal);
       	        		 startActivity(nA0);
       	            break;
       	        case 1:  
       	        	 Intent nA1 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
    	        		nA1.putExtra("name", itemVal);
    	        		//nA1.putExtra("playlist_name", pn);
   	        		//nA1.putExtra("username", un);
    	        		 Log.w("T","2222222222222222");
    	        		 startActivity(nA1);
       	            break;
       	        case 2: 
       	        	 Intent nA2 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
    	        			nA2.putExtra("name", itemVal);
    	        			//nA2.putExtra("playlist_name", pn);
       	        		//nA2.putExtra("username", un);
    	        			 Log.w("T","33333333333333333");
    	        			 startActivity(nA2);
       	            break;
       	        case 3:  
       	        	 Intent nA3 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
    	        			nA3.putExtra("name", itemVal);
    	        			//nA3.putExtra("playlist_name", pn);
       	        		//nA3.putExtra("username", un);
    	        			 Log.e("T","44444444444444");
    	        			 startActivity(nA3);
       	            break;
       	            
       	     case 4:  
   	        	 Intent nA4 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
	        			nA4.putExtra("name", itemVal);
	        			//nA3.putExtra("playlist_name", pn);
   	        		//nA3.putExtra("username", un);
	        			 Log.e("T","44444444444444");
	        			 startActivity(nA4);
   	            break;
       	  case 5:  
	        	 Intent nA5 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
	        			nA5.putExtra("name", itemVal);
	        			//nA3.putExtra("playlist_name", pn);
	        		//nA3.putExtra("username", un);
	        			 Log.e("T","44444444444444");
	        			 startActivity(nA5);
	            break;
       	 case 6:  
	        	 Intent nA6 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
        			nA6.putExtra("name", itemVal);
        			//nA3.putExtra("playlist_name", pn);
	        		//nA3.putExtra("username", un);
        			 Log.e("T","44444444444444");
        			 startActivity(nA6);
	            break;
       	 case 7:  
	        	 Intent nA7 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
        			nA7.putExtra("name", itemVal);
        			//nA3.putExtra("playlist_name", pn);
	        		//nA3.putExtra("username", un);
        			 Log.e("T","44444444444444");
        			 startActivity(nA7);
	            break;
       	 case 8:  
	        	 Intent nA8 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
        			nA8.putExtra("name", itemVal);
        			//nA3.putExtra("playlist_name", pn);
	        		//nA3.putExtra("username", un);
        			 Log.e("T","44444444444444");
        			 startActivity(nA8);
	            break;
       	 case 9:  
	        	 Intent nA9 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
        			nA9.putExtra("name", itemVal);
        			//nA3.putExtra("playlist_name", pn);
	        		//nA3.putExtra("username", un);
        			 Log.e("T","44444444444444");
        			 startActivity(nA9);
	            break;
       	 case 10:  
	        	 Intent nA10 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
        			nA10.putExtra("name", itemVal);
        			//nA3.putExtra("playlist_name", pn);
	        		//nA3.putExtra("username", un);
        			 Log.e("T","44444444444444");
        			 startActivity(nA10);
	            break;
       	 case 11:  
	        	 Intent nA11 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
        			nA11.putExtra("name", itemVal);
        			//nA3.putExtra("playlist_name", pn);
	        		//nA3.putExtra("username", un);
        			 Log.e("T","44444444444444");
        			 startActivity(nA11);
	            break;
       	 case 12:  
	        	 Intent nA12 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
        			nA12.putExtra("name", itemVal);
        			//nA3.putExtra("playlist_name", pn);
	        		//nA3.putExtra("username", un);
        			 Log.e("T","44444444444444");
        			 startActivity(nA12);
	            break;
       	 case 13:  
	        	 Intent nA13 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
        			nA13.putExtra("name", itemVal);
        			//nA3.putExtra("playlist_name", pn);
	        		//nA3.putExtra("username", un);
        			 Log.e("T","44444444444444");
        			 startActivity(nA13);
	            break;
       	 case 14:  
	        	 Intent nA14 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
        			nA14.putExtra("name", itemVal);
        			//nA3.putExtra("playlist_name", pn);
	        		//nA3.putExtra("username", un);
        			 Log.e("T","44444444444444");
        			 startActivity(nA14);
	            break;
       	 case 15:  
	        	 Intent nA15 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
        			nA15.putExtra("name", itemVal);
        			//nA3.putExtra("playlist_name", pn);
	        		//nA3.putExtra("username", un);
        			 Log.e("T","44444444444444");
        			 startActivity(nA15);
	            break;
       	 case 16:  
	        	 Intent nA16 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
        			nA16.putExtra("name", itemVal);
        			//nA3.putExtra("playlist_name", pn);
	        		//nA3.putExtra("username", un);
        			 Log.e("T","44444444444444");
        			 startActivity(nA16);
	            break;
	            
       	 case 17:  
        	 Intent nA17 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
    			nA17.putExtra("name", itemVal);
    			//nA3.putExtra("playlist_name", pn);
        		//nA3.putExtra("username", un);
    			 Log.e("T","44444444444444");
    			 startActivity(nA17);
            break;
            
       	 case 18:  
        	 Intent nA18 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
    			nA18.putExtra("name", itemVal);
    			//nA3.putExtra("playlist_name", pn);
        		//nA3.putExtra("username", un);
    			 Log.e("T","44444444444444");
    			 startActivity(nA18);
            break;
            
       	 case 19:  
        	 Intent nA19 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
    			nA19.putExtra("name", itemVal);
    			//nA3.putExtra("playlist_name", pn);
        		//nA3.putExtra("username", un);
    			 Log.e("T","44444444444444");
    			 startActivity(nA19);
            break;
       	 case 20:  
        	 Intent nA20 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
    			nA20.putExtra("name", itemVal);
    			//nA3.putExtra("playlist_name", pn);
        		//nA3.putExtra("username", un);
    			 Log.e("T","44444444444444");
    			 startActivity(nA20);
            break;
            
       	 case 21:  
        	 Intent nA21 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
    			nA21.putExtra("name", itemVal);
    			//nA3.putExtra("playlist_name", pn);
        		//nA3.putExtra("username", un);
    			 Log.e("T","44444444444444");
    			 startActivity(nA21);
            break;
            
       	 case 22:  
        	 Intent nA22 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
    			nA22.putExtra("name", itemVal);
    			//nA3.putExtra("playlist_name", pn);
        		//nA3.putExtra("username", un);
    			 Log.e("T","44444444444444");
    			 startActivity(nA22);
            break;
       	 case 23:  
        	 Intent nA23 = new Intent(getApplicationContext(), descriptionOfEvent.class);     
    			nA23.putExtra("name", itemVal);
    			//nA3.putExtra("playlist_name", pn);
        		//nA3.putExtra("username", un);
    			 Log.e("T","44444444444444");
    			 startActivity(nA23);
            break;
       	      //  case 4:  
       	        //	Intent nA4 = new Intent(getApplicationContext(), MainActivity.class);     
	        			//        		nA0.putExtra("name", itemVal);
       	            //break;
       	}              
       	    }
       	});

	}

    @SuppressLint("NewApi")
	private ArrayList<String> populate() {
    	Log.e("1","populate me aa gye   ");
    	String evename="mega";
    	//check kaun se type k event me click kiya hai bande ne 
    	switch(value)
    	{
    	case 1: evename="mega";
    	break;
    	case 2: evename="cult";
    	break;
    	case 3: evename="lit";
    	break;
    	case 4: evename="digi";
    	break;
    	case 5: evename="misc";
    	break;
    	
    	}
        
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

		StrictMode.setThreadPolicy(policy); 

		ArrayList<String> item = new ArrayList<String>();
		ArrayList<String> eveid = new ArrayList<String>();
     
        try {
        	Log.e("1","before caling the url ");
            
            URL url = new URL("http://10.0.2.2:8080/a1.php?action="+evename);
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
                for (int i = 0; i < ja.length(); i++) {
                    JSONObject jo = (JSONObject) ja.get(i);
                    
                    eveid.add(jo.getString("eid"));
                    item.add(jo.getString("ename"));
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
         return item;
        
    }
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean onKeyDown(int keycode, KeyEvent event) {
	    if (keycode == KeyEvent.KEYCODE_BACK) {
	      this.finish();
	      
	    }
	    return super.onKeyDown(keycode, event);
	}
	
}