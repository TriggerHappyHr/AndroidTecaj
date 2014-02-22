package biz.osvit.noviprojekt.activities;

import biz.osvit.demo.utils.C;
import biz.osvit.noviprojekt.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity {

	private EditText mInputEditText;
	private Button mSubmitButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initUi();
		initListeners();
	}

	@Override
	public void initUi() {
		mInputEditText = (EditText) findViewById(R.id.edit_Text);
		mSubmitButton = (Button) findViewById(R.id.prviButton);

	}

	@Override
	protected void initListeners() {

		mInputEditText.setOnClickListener(mOnClickListener);
		mSubmitButton.setOnClickListener(mOnClickListener);

	}

	
	private OnClickListener mOnClickListener =  new OnClickListener() {
		
		@Override
		public void onClick(View slucac) {
			switch (slucac.getId()) {
			case R.id.prviButton:
				String tempText = mInputEditText.getText().toString();
				startSecondActivity (tempText);
				break;

			}
			
		}
	};
	
	private void startSecondActivity(String predaniText) {
		Intent namjera = new Intent(this, SecondActivity.class);
		namjera.putExtra(C.MAIN_ACTIVITY_BUNDLE_KEY_TEXT, predaniText);
		startActivity(namjera);
	}

}