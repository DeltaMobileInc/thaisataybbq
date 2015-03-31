package com.mobilecoder.thaisataybb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Menu extends Activity {
	private String TAG = Menu.class.getSimpleName();
	private ListView menuListview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		String[] menuListItems = { "Special Combination",
				"Shrimp Fried Rice Combination", "Appetizers",
				"Salad and Spicy Salads", "Soups", "Chicken Pork or Beef Dish",
				"Shrimp And Seafood", "Curry", "Rice", "Beverages" };
		menuListview = (ListView) findViewById(R.id.menulistview);
		menuListview.setAdapter(new MenuAdapter(this, R.layout.listdetailview,
				R.id.menuText, R.id.image1, menuListItems));
		menuListview.setOnItemClickListener(new MenuClickHandler());
	}

	private class MenuClickHandler implements OnItemClickListener {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// selects which grid detail it will open up
			Log.d(TAG, "positionh is"+position);
			Intent menuGridIntent = new Intent(getApplicationContext(),
					GridMenu.class);
			Constants.listclickedPosition = position;
			startActivity(menuGridIntent);
		}
	}

}
