package com.finki.ukim.labo1;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class MainActivity extends Activity {

	ArrayList<Sport> list = new ArrayList<Sport>();
	CustomAdapter adapter;
	public static final String TAGLOG = "safdf";
	ListView listView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);
        Log.e(TAGLOG,"onCreate");
        FillArrayLIst();
        adapter = new CustomAdapter(list, this);
        listView.setAdapter(adapter);
        
        
        
    }
    private void FillArrayLIst() {
    	Sport a1 = new Sport("Basketball", R.drawable.kos);
    	Sport a2 = new Sport("Handball",R.drawable.kopce2);
    	Sport a3=new Sport("Naumce-Handball Player", R.drawable.naumce);
    	Sport a4=new Sport("Pero Antic-Basketball Player", R.drawable.pero);
    	list.add(a1);
    	list.add(a2);
    	list.add(a3);
    	list.add(a4);
	}
	@Override
    protected void onResume() {
    	super.onResume();
    	Log.e(TAGLOG,"onResume");
    }

    @Override
    protected void onPause() {
    	super.onPause();
    	Log.e(TAGLOG,"onPause");
    }
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	Log.e(TAGLOG,"onDestroy");
    }

    
}
