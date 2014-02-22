package biz.osvit.testiranje.activities;

import biiz.osvit.testiranje.R;
import biz.osvit.testiranje.models.UserModel;
import biz.osvit.testiranje.utils.C;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity {
	
	private EditText mImeEditText;
	private EditText mPrezimeEditText;
	private EditText mAdresaEditText;
	private Button mPotvrdiBtn;
	private Button mPonistiBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initUI();
		initListeners();
	}

	@Override
	void initUI() {
		
		mImeEditText = (EditText) findViewById(R.id.activity_main_ime_edittext);
		mPrezimeEditText = (EditText) findViewById(R.id.activity_main_prezime_edittext);
		mAdresaEditText = (EditText) findViewById(R.id.activity_main_adresa_edittext);
		
		mPotvrdiBtn = (Button) findViewById(R.id.activity_main_potvrdi_button);
		mPonistiBtn = (Button) findViewById(R.id.activity_main_ponisti_button);
		
	}

	@Override
	void initListeners() {
		mPotvrdiBtn.setOnClickListener(mOnClickListener);
		mPonistiBtn.setOnClickListener(mOnClickListener);
		
	}
	
	private OnClickListener mOnClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View slusalica) {
			switch (slusalica.getId()) {
			case (R.id.activity_main_potvrdi_button):
				String ime = mImeEditText.getText().toString();
				String prezime = mPrezimeEditText.getText().toString();
				String adresa = mAdresaEditText.getText().toString();
				pokreniDrugiActivity (ime, prezime, adresa);
				break;
			case (R.id.activity_main_ponisti_button):
				mImeEditText.setText("");
				mPrezimeEditText.setText("");
				mAdresaEditText.setText("");
				break;
			}
			
		}
	};
	
	private void pokreniDrugiActivity (String ime, String prezime, String adresa){
		Intent namjera = new Intent(this, SecondActivity.class);
/*		namjera.putExtra(C.MAIN_ACTIVITY_BUNDLE_KEY_IME, ime);
		namjera.putExtra(C.MAIN_ACTIVITY_BUNDLE_KEY_PREZIME, prezime);
		namjera.putExtra(C.MAIN_ACTIVITY_BUNDLE_KEY_ADRESA, adresa);*/
		UserModel model = new UserModel();
		model.setFirstName(ime);
		model.setLastName(prezime);
		model.setAddress(adresa);
		namjera.putExtra(C.MAIN_ACTIVITY_BUNDLE_KEY_USER, model);
		startActivity(namjera);
	}

	
}
