package com.mobilecoder.thaisataybb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class GridMenu extends Activity {
	private String TAG = GridMenu.class.getSimpleName();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
/*
		public Map<Integer, id> myMap = new HashMap<Integer, R.id>();
		myMap*/		
		super.onCreate(savedInstanceState);	
		
		LayoutToUse(Constants.listclickedPosition);
		
	}
	
	/**
	 * Method to find which layout to use
	 * 
	 * @param _clickedPosition
	 * @return
	 */
	private void LayoutToUse(int _listclickedPosition){
		switch (_listclickedPosition) {
		case 0:
			setContentView(R.layout.activity_special_combination);
			getActionBar().setTitle(R.string.special_combi);
			Constants.menuclicked = getString(R.string.special_combi);
			break;
		case 1:
			setContentView(R.layout.activity_shrimp_combination);
			getActionBar().setTitle(R.string.shrimp_fried_rice);
			Constants.menuclicked = getString(R.string.shrimp_fried_rice);
			break;
		case 2:
			setContentView(R.layout.activity_appetizer);
			getActionBar().setTitle(R.string.appetizer);
			Constants.menuclicked = getString(R.string.appetizer);
			break;
		case 3:
			setContentView(R.layout.activity_salads);
			getActionBar().setTitle(R.string.salads_soups);
			Constants.menuclicked = getString(R.string.salads_soups);
			break;
		case 4:
			setContentView(R.layout.activity_soups);
			getActionBar().setTitle(R.string.soups);
			Constants.menuclicked = getString(R.string.soups);
			break;
		case 5:
			setContentView(R.layout.activity_pork_beef);
			getActionBar().setTitle(R.string.chk_pork_beef);
			Constants.menuclicked = getString(R.string.chk_pork_beef);
			break;
		case 6:
			setContentView(R.layout.activity_shrimp_seafood);
			getActionBar().setTitle(R.string.shrimp_seafood);
			Constants.menuclicked = getString(R.string.shrimp_seafood);
			break;
		case 7:
			setContentView(R.layout.activity_curry);
			getActionBar().setTitle(R.string.curry);
			Constants.menuclicked = getString(R.string.curry);
			break;
		case 8:
			setContentView(R.layout.activity_rice);
			getActionBar().setTitle(R.string.rice);
			Constants.menuclicked = getString(R.string.rice);
			break;
		case 9:
			setContentView(R.layout.activity_beverages);
			getActionBar().setTitle(R.string.beverages);
			Constants.menuclicked = getString(R.string.beverages);
			break;
			

		default:
			//TODO
			//set a default view here
			break;
		}

	}
	
	/**
	 *find out which view is clicked 
	 * 
	 * @param view
	 */
	public void GridImageClicked(View view){
		Constants.submenuclickedno = Integer.parseInt(view.getTag().toString())-1;	//subtracting one since the array starts fro0	
		Toast.makeText(getApplicationContext(), "yeah!!"+Constants.submenuclickedno, Toast.LENGTH_SHORT).show();
		Intent gridDetailIntent = new Intent(getApplicationContext(), GridDetail.class);		
		startActivity(gridDetailIntent);
	}
	
	
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		LayoutToUse(Constants.listclickedPosition);
		Toast.makeText(getApplicationContext(), "on rsume clicked is"+Constants.listclickedPosition, Toast.LENGTH_SHORT).show();
		super.onResume();
	}
	
}
