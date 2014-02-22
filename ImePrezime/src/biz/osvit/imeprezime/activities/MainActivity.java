package biz.osvit.imeprezime.activities;

import biz.osvit.imeprezime.R;
import biz.osvit.imeprezime.util.C;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity {
	
	private EditText mIme;
	
	private EditText mPrezime;
	
	private Button mButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initUI();
		initListeners();
	}


	@Override
	public void initUI() {
		
		mIme= (EditText) findViewById(R.id.ime);
		mPrezime= (EditText) findViewById(R.id.prezime);
		mButton = (Button) findViewById(R.id.activity_main_button);
		
	}

	@Override
	public void initListeners() {
		mIme.setOnClickListener(mOnClickListener);
		mPrezime.setOnClickListener(mOnClickListener);
		mButton.setOnClickListener(mOnClickListener);
		
	}

	private OnClickListener mOnClickListener=new OnClickListener() {
		
		@Override
		public void onClick(View slusalica) {
			switch (slusalica.getId()) {
			case R.id.activity_main_button:
				String tempIme = mIme.getText().toString();
				String tempPrezime = mPrezime.getText().toString();
				startSecond (tempIme, tempPrezime);
				break;
			}
			
		}
	};
	
	private void startSecond (String tempIme, String tempPrezime){
		Intent namjera = new Intent(this, SecondActivity.class);
		namjera.putExtra(C.MAIN_ACTIVITY_BUNDLE_KEY_FIRST_NAME, tempIme);
		namjera.putExtra(C.MAIN_ACTIVITY_BUNDLE_KEY_LAST_NAME, tempPrezime);
		startActivity(namjera);
	}
	

}
