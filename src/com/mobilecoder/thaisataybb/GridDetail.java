package com.mobilecoder.thaisataybb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GridDetail extends Activity implements OnClickListener {
	private Button add_to_fav, share_fb;
	private TextView menuHeader;
	private String[] subMenuList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_detail);
		setSubMenuArray(Constants.listclickedPosition);	    			
		BindViews();
	}

	private void BindViews() {
		// TODO Auto-generated method stub
		add_to_fav = (Button) findViewById(R.id.add_to_fav);
		add_to_fav.setOnClickListener(this);
		share_fb = (Button) findViewById(R.id.share_fb);
		share_fb.setOnClickListener(this);
		menuHeader = (TextView)findViewById(R.id.menuheader);
		menuHeader.setText(subMenuList[Constants.submenuclickedno]);

	}
	/**
	 * set the submenu array
	 * 
	 * @param _arrayNumber
	 */
	private void setSubMenuArray(int _arrayNumber){
		
		switch (_arrayNumber) {
		case 0:
			subMenuList = getResources().getStringArray(R.array.menu_1);	
			break;
		case 1:
			subMenuList = getResources().getStringArray(R.array.menu_2);
			break;
		case 2:
			subMenuList = getResources().getStringArray(R.array.menu_3);
			break;
		case 3:
			subMenuList = getResources().getStringArray(R.array.menu_4);
			break;
		case 4:
			subMenuList = getResources().getStringArray(R.array.menu_5);
			break;
		case 5:
			subMenuList = getResources().getStringArray(R.array.menu_6);
			break;
		case 6:
			subMenuList = getResources().getStringArray(R.array.menu_7);
			break;
		case 7:
			subMenuList = getResources().getStringArray(R.array.menu_8);
			break;
		case 8:
			subMenuList = getResources().getStringArray(R.array.menu_9);
			break;
		case 9:
			subMenuList = getResources().getStringArray(R.array.menu_10);
			break;
			

		default:
			//TODO
			//set a default view here
			break;
		}
		
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.add_to_fav:
			Toast.makeText(getApplicationContext(), "Added to favourites",
					Toast.LENGTH_SHORT).show();
			// TODO
			// add to fav list
			break;
		case R.id.share_fb:
			Toast.makeText(getApplicationContext(), "share on facebook",
					Toast.LENGTH_SHORT).show();
			// TODO
			// share on facebook
			break;
		default:
			break;
		}
	}
}
