package biz.osvit.imeprezime.activities;

import biz.osvit.imeprezime.R;
import biz.osvit.imeprezime.util.C;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {

	private TextView mIme;
	private TextView mPrezime;
	private String textIme;
	private String textPrezime;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		initUI();

		Bundle extras = getIntent().getExtras();

		if (extras != null) {
			initExtras(extras);
		}

		setTitleTextView();
	}

	@Override
	public void initUI() {
		mIme = (TextView) findViewById(R.id.textView2);
		mPrezime = (TextView) findViewById(R.id.textView1);
	}

	private void initExtras(Bundle extras) {
		textIme = extras.getString(C.MAIN_ACTIVITY_BUNDLE_KEY_FIRST_NAME);
		textPrezime = extras.getString(C.MAIN_ACTIVITY_BUNDLE_KEY_LAST_NAME);

	}

	private void setTitleTextView() {

		mIme.setText("Dobar dan, "+textIme);
		mPrezime.setText(" "+textPrezime+".");

	}

	@Override
	public void initListeners() {
		// TODO Auto-generated method stub

	}

}
