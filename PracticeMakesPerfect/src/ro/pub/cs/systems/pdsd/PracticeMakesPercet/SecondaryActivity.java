package ro.pub.cs.systems.pdsd.PracticeMakesPercet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SecondaryActivity extends Activity {

	private Button ok;
	private Button cancel;
	TextView text1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secondary);
		text1 = (TextView)findViewById(R.id.displaycuboi);
		Intent i = getIntent();
		if(i!=null)
		{
			String c_user = i.getExtras().getString("c_user");
			String c_colo = i.getExtras().getString("c_colo");
			String c_race = i.getExtras().getString("c_race");
			if(c_user!=null && c_colo != null && c_race != null)
			{
				text1.setText(c_race+" "+c_colo+" "+c_user);
			}
		}
		ok=(Button)findViewById(R.id.ok_button);
		cancel=(Button)findViewById(R.id.cancel_button);
		
		ok.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				setResult(RESULT_OK, new Intent());
		          finish();
		          
			}
		});

		cancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				setResult(RESULT_CANCELED, new Intent());
		          finish();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.secondary, menu);
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

	

}
