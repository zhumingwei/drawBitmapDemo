package com.example.drowbitmapdemo;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;

import com.example.widge.DrawBitmapView;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		RelativeLayout layout=(RelativeLayout) findViewById(R.id.rl);
		final DrawBitmapView view=new DrawBitmapView(MainActivity.this);
		layout.addView(view,new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
//		view.startTranslate(); 
//		view.setOnTouchListener(new OnTouchListener() {  
//            @Override  
//            public boolean onTouch(View v, MotionEvent event) {  
//                Random random = new Random();  
//                int startLeft = random.nextInt(200);  
//                int startTop = random.nextInt(250);  
//                int toLeft = random.nextInt(550) + 200;  
//                int toBottom = random.nextInt(1000) + 250;  
//                view.startTranslate(startLeft, startTop, toLeft, toBottom, 1000);  
//                return true;  
//            }  
//        });  
		view.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				view.startScale(2000);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
