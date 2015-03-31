package com.mobilecoder.thaisataybb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView menuView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		bindViews();
	}

	private void bindViews() {
		String[] listItems={"Menu", "Reservation", "Offers&Coupons", "My Favourite", "Contact"};
		menuView = (ListView)findViewById(R.id.menulist);
		menuView.setAdapter(new MenuAdapter(this, R.layout.listdetailview, R.id.menuText, R.id.image1, listItems));
		menuView.setOnItemClickListener(new ListClickHandler());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	/**
	 * 
	 * @author praveen
	 *
	 *	class to handle onclicklistner on list view.
	 */
	public class ListClickHandler implements OnItemClickListener {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// TODO Auto-generated method stub
			switch (position) {
			case 0:
				Intent menuIntent = new Intent(getApplicationContext(), com.mobilecoder.thaisataybb.Menu.class);
				startActivity(menuIntent);
				break;
			case 1:
				Intent reservationIntent = new Intent(getApplicationContext(), com.mobilecoder.thaisataybb.Reservation.class);
				startActivity(reservationIntent);
				break;
			case 2:
				Intent couponsIntent = new Intent(getApplicationContext(), com.mobilecoder.thaisataybb.OffersCoupons.class);
				startActivity(couponsIntent);
				break;
			/*case 3:
				Intent myFavIntent = new Intent(getApplicationContext(), com.mobilecoder.thaisataybb.MyFavourite.class);
				startActivity(myFavIntent);
				break;*/
			case 4:
				Intent contactIntent = new Intent(getApplicationContext(), com.mobilecoder.thaisataybb.Contact.class);
				startActivity(contactIntent);
				break;
			

			default:
				break;
			}
			
			//Toast.makeText(getApplicationContext(), "menu clicked"+position, Toast.LENGTH_SHORT).show();
		}

	}
}
