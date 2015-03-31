package ro.pub.cs.systems.pdsd.PracticeMakesPercet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private final static int SECONDARY_ACTIVITY_REQUEST_CODE = 1;
	private String race = null;
	private String color = null;
	TextView nick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nick = (TextView) findViewById(R.id.nick);
        Button bt = (Button) findViewById(R.id.leButon);
        RadioButton rb11 = (RadioButton) findViewById(R.id.elves);
        RadioButton rb12 = (RadioButton) findViewById(R.id.orcs);
        RadioButton rb13 = (RadioButton) findViewById(R.id.humans);
        RadioButton rb14 = (RadioButton) findViewById(R.id.undead);
        
        RadioButton rb01 = (RadioButton) findViewById(R.id.red);
        RadioButton rb02 = (RadioButton) findViewById(R.id.green);
        RadioButton rb03 = (RadioButton) findViewById(R.id.blue);
        RadioButton rb04 = (RadioButton) findViewById(R.id.black);
        if (savedInstanceState != null) 
        {
        	if (savedInstanceState.getBoolean("rb01")) rb01.setChecked(true);
        	if (savedInstanceState.getBoolean("rb02")) rb02.setChecked(true);
        	if (savedInstanceState.getBoolean("rb03")) rb03.setChecked(true);
        	if (savedInstanceState.getBoolean("rb04")) rb04.setChecked(true);
        	if (savedInstanceState.getBoolean("rb11")) rb11.setChecked(true);
        	if (savedInstanceState.getBoolean("rb12")) rb12.setChecked(true);
        	if (savedInstanceState.getBoolean("rb13")) rb13.setChecked(true);
        	if (savedInstanceState.getBoolean("rb14")) rb14.setChecked(true);
			
			nick.setText(savedInstanceState.getString("nick"));
        }
        TextWatcher wnick = new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				//Toast.makeText(MainActivity.this,"your nick is" + s.toString(), Toast.LENGTH_SHORT).show();
				if(s.toString().length()<5)
				{
					nick.setBackgroundColor(getResources().getColor(R.color.red));
				}
				else if (s.toString().length()<10)
				{
					nick.setBackgroundColor(getResources().getColor(R.color.yellow));
				}
				else
					nick.setBackgroundColor(getResources().getColor(R.color.green));
					
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}
		};
        
       
        
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Toast.makeText(MainActivity.this, "return stuff", Toast.LENGTH_LONG).show();
				Intent i = new Intent (ro.pub.cs.systems.pdsd.PracticeMakesPercet.MainActivity.this, ro.pub.cs.systems.pdsd.PracticeMakesPercet.SecondaryActivity.class);
				i.putExtra("c_race",race);
				i.putExtra("c_colo",color);
				i.putExtra("c_user", nick.getText().toString());
				startActivityForResult(i, SECONDARY_ACTIVITY_REQUEST_CODE);
				
			}
		});
        
        rb11.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				boolean checked = ((RadioButton) buttonView).isChecked();
				if(checked)
				{
					race = "elves";
				}
					//Toast.makeText(MainActivity.this, "rb11 elves", Toast.LENGTH_SHORT).show();

			}
        });
        rb12.setOnCheckedChangeListener(new OnCheckedChangeListener() {

        	@Override
        	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        		// TODO Auto-generated method stub
        		boolean checked = ((RadioButton) buttonView).isChecked();
        		if(checked)
        		{
        			race = "orcs";
        		}
        			//Toast.makeText(MainActivity.this, "rb12 orcs", Toast.LENGTH_SHORT).show();

        	}
        });
        rb13.setOnCheckedChangeListener(new OnCheckedChangeListener() {

        	@Override
        	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        		// TODO Auto-generated method stub
        		boolean checked = ((RadioButton) buttonView).isChecked();
        		if(checked)
        		{
        			race = "humans";
        		}
        			//Toast.makeText(MainActivity.this, "rb13 humans", Toast.LENGTH_SHORT).show();

        	}
        });
        rb14.setOnCheckedChangeListener(new OnCheckedChangeListener() {

        	@Override
        	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        		// TODO Auto-generated method stub
        		boolean checked = ((RadioButton) buttonView).isChecked();
        		if(checked)
        		{
        			race = "undead";
        		}
        			//Toast.makeText(MainActivity.this, "rb14 undead", Toast.LENGTH_SHORT).show();

        	}
        });
       
        rb01.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				boolean checked = ((RadioButton) buttonView).isChecked();
				if(checked)
				{
					color = "red";
				}
					//Toast.makeText(MainActivity.this, "rb01 red", Toast.LENGTH_SHORT).show();

			}
        });
        rb02.setOnCheckedChangeListener(new OnCheckedChangeListener() {

        	@Override
        	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        		// TODO Auto-generated method stub
        		boolean checked = ((RadioButton) buttonView).isChecked();
        		if(checked)
        		{
        			color = "blue";
        		}
        			//Toast.makeText(MainActivity.this, "rb02 blue", Toast.LENGTH_SHORT).show();

        	}
        });
        rb03.setOnCheckedChangeListener(new OnCheckedChangeListener() {

        	@Override
        	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        		// TODO Auto-generated method stub
        		boolean checked = ((RadioButton) buttonView).isChecked();
        		if(checked)
        		{
        			color = "green";
        		}
        			//Toast.makeText(MainActivity.this, "rb03 green", Toast.LENGTH_SHORT).show();

        	}
        });
        rb04.setOnCheckedChangeListener(new OnCheckedChangeListener() {

        	@Override
        	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        		// TODO Auto-generated method stub
        		boolean checked = ((RadioButton) buttonView).isChecked();
        		if(checked)
        		{
        			color = "black";
        		}
        			//Toast.makeText(MainActivity.this, "rb04 black", Toast.LENGTH_SHORT).show();

        	}
        });
        nick.addTextChangedListener(wnick);
    }

    @Override
	  protected void onSaveInstanceState(Bundle savedInstanceState) {
    	TextView nick1 = (TextView) findViewById(R.id.nick);
        Button bt = (Button) findViewById(R.id.leButon);
        RadioButton rb11 = (RadioButton) findViewById(R.id.elves);
        RadioButton rb12 = (RadioButton) findViewById(R.id.orcs);
        RadioButton rb13 = (RadioButton) findViewById(R.id.humans);
        RadioButton rb14 = (RadioButton) findViewById(R.id.undead);
        
        RadioButton rb01 = (RadioButton) findViewById(R.id.red);
        RadioButton rb02 = (RadioButton) findViewById(R.id.green);
        RadioButton rb03 = (RadioButton) findViewById(R.id.blue);
        RadioButton rb04 = (RadioButton) findViewById(R.id.black);
		
		savedInstanceState.putString("nick", nick1.getText().toString());

		if (rb01.isChecked())
			savedInstanceState.putBoolean("rb01", true);
		else savedInstanceState.putBoolean("rb01", false);
		if (rb03.isChecked())
			savedInstanceState.putBoolean("rb02", true);
		else savedInstanceState.putBoolean("rb02", false);
		if (rb03.isChecked())
			savedInstanceState.putBoolean("rb03", true);
		else savedInstanceState.putBoolean("rb03", false);
		if (rb04.isChecked())
			savedInstanceState.putBoolean("rb04", true);
		else savedInstanceState.putBoolean("rb04", false);
		if (rb11.isChecked())
			savedInstanceState.putBoolean("rb11", true);
		else savedInstanceState.putBoolean("rb11", false);
		if (rb12.isChecked())
			savedInstanceState.putBoolean("rb12", true);
		else savedInstanceState.putBoolean("rb12", false);
		if (rb13.isChecked())
			savedInstanceState.putBoolean("rb13", true);
		else savedInstanceState.putBoolean("rb13", false);
		if (rb14.isChecked())
			savedInstanceState.putBoolean("rb14", true);
		else savedInstanceState.putBoolean("rb14", false);
		
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

    @Override
	  public void onActivityResult(int requestCode, int resultCode, Intent intent) {
	    Toast.makeText(this, "The activity returned with result "+resultCode, Toast.LENGTH_SHORT).show();
	  }
    

}
