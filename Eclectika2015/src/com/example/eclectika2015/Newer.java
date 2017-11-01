package com.example.eclectika2015;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

@SuppressLint("NewApi")
public class Newer extends Activity implements OnTouchListener{
	
	
	private int _xDelta;
    private int _yDelta;
    
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newk);
		ImageView j1 = (ImageView)findViewById(R.id.imageView12);
		j1.setImageResource(R.drawable.crytwo);
		j1.setLeft(20);
		j1.setRight(20);
		final Animation animation = new AlphaAnimation(1, 0); // Change alpha from fully visible to invisible
	    animation.setDuration(500); // duration - half a second
	    animation.setInterpolator(new LinearInterpolator()); // do not alter animation rate
	    animation.setRepeatCount(Animation.INFINITE); // Repeat animation infinitely
	    animation.setRepeatMode(Animation.REVERSE); // Reverse animation at the end so the button will fade back in
	    final ImageView btn = (ImageView) findViewById(R.id.imageView122);
	    btn.startAnimation(animation);
	    btn.setOnClickListener(new OnClickListener() {
	        @Override
	        public void onClick(final View view) {
	            view.clearAnimation();
	        }
	    });
		// from the link http://stackoverflow.com/questions/20706423/android-move-imageview
		ImageView j = (ImageView)findViewById(R.id.imageView12);

	        j.setOnTouchListener(this);
	    }

	    public boolean onTouch(View view, MotionEvent event) {
	        final int X = (int) event.getRawX();
	        final int Y = (int) event.getRawY();
	        ImageView j = (ImageView)findViewById(R.id.imageView12);
	        Intent i = new Intent(this, majorCatOfevents.class);
	        switch (event.getAction() & MotionEvent.ACTION_MASK) {
	            case MotionEvent.ACTION_DOWN:
	                RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
	                _xDelta = (int) (X - j.getTranslationX());
	                _yDelta = (int) (Y - j.getTranslationY());
	                break;
	            case MotionEvent.ACTION_UP:
	                break;
	            case MotionEvent.ACTION_POINTER_DOWN:
	                break;
	            case MotionEvent.ACTION_POINTER_UP:
	                break;
	            case MotionEvent.ACTION_MOVE:
	                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();

	                j.setTranslationX(X - _xDelta);
	                j.setTranslationY(Y - _yDelta);
	                j.setImageResource(R.drawable.smile);
                	
	                if(_xDelta>10 )
	                {
	                	
	                	 try {
	             		    
	                		 Thread.sleep(1000);
	             		    startActivity(i);
	             		} catch (InterruptedException e) {
	             		    // TODO Auto-generated catch block
	             		    e.printStackTrace();
	             		}
	            

	                }
	                	break;
	        }

	        return true;
	    }
	    public void kholo(View view)
	    {
	    Toast.makeText(this,"patient's record deleted",Toast.LENGTH_SHORT).show(); 

		Intent i = new Intent(this, Next.class);
		startActivity(i);
		
	    }
	    public boolean onKeyDown(int keycode, KeyEvent event) {
	        if (keycode == KeyEvent.KEYCODE_BACK) {
	            moveTaskToBack(true);
	        }
	        return super.onKeyDown(keycode, event);
	    }
	    
}