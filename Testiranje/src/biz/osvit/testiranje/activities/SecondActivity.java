package biz.osvit.testiranje.activities;

import biiz.osvit.testiranje.R;
import biz.osvit.testiranje.models.UserModel;
import biz.osvit.testiranje.utils.C;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends BaseActivity {
	
/*	private String mIme;
	private String mPrezime;
	private String mAdresa;*/
	private TextView ispisanoIme;
	private TextView ispisanoPrezime;
	private TextView ispisanaAdresa;
	private UserModel mUserModel;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		initUI();
		
		Bundle extras = getIntent().getExtras();
		
		if (extras != null){
		
		initExtras (extras);}
		
		ispisiMiVarijable();
		
	}

	

	@Override
	void initUI() {
		
		ispisanoIme = (TextView) findViewById(R.id.activity_second_ime_textview);
		ispisanoPrezime= (TextView) findViewById(R.id.activity_second_prezime_textview);
		ispisanaAdresa = (TextView) findViewById(R.id.activity_second_adresa_textview);
			
	}
	
	public void initExtras(Bundle extras) {
		
/*		mIme = extras.getString(C.MAIN_ACTIVITY_BUNDLE_KEY_IME);
		mPrezime = extras.getString(C.MAIN_ACTIVITY_BUNDLE_KEY_PREZIME);
		mAdresa = extras.getString(C.MAIN_ACTIVITY_BUNDLE_KEY_ADRESA);*/
		
		mUserModel = extras.getParcelable(C.MAIN_ACTIVITY_BUNDLE_KEY_USER);
		
	}
	
	void ispisiMiVarijable (){
		
	/*	ispisanoIme.setText(mIme);
		ispisanoPrezime.setText(mPrezime);
		ispisanaAdresa.setText(mAdresa);*/
		
		ispisanoIme.setText(mUserModel.getFirstName());
		ispisanoPrezime.setText(mUserModel.getLastName());
		ispisanaAdresa.setText(mUserModel.getAddress());
	}
	
	

	@Override
	void initListeners() {
		// TODO Auto-generated method stub
		
	}

}
