package com.finki.ukim.labo1;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

	ArrayList<Sport> items;
	Context context;
	LayoutInflater inflater = null;

	public CustomAdapter(ArrayList<Sport> lista, Activity con) {
		items = lista;
		context = con.getBaseContext();
		inflater = con.getLayoutInflater();
	}

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Object getItem(int arg0) {
		return items.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		View v = arg1;
		
		if(arg1 == null)
			v = inflater.inflate(R.layout.list_item, null);
		
		TextView imeSport = (TextView)v.findViewById(R.id.txtImeSport);
		ImageView img = (ImageView)v.findViewById(R.id.imgSport);
		
		imeSport.setText(items.get(arg0).getIme());
		img.setImageResource(items.get(arg0).getSlika());
		
		
		
		
		return v;
	}
}
