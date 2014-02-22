package biz.osvit.noviprojekt.activities;

import biz.osvit.demo.utils.C;
import biz.osvit.noviprojekt.R;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {

	private TextView mTitleTextView;
	private String textFromMainActivity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		initUi();

		Bundle extras = getIntent().getExtras();

		if (extras != null) {
			initExtras(extras);
		}

		setTitleTextView();
	}

	@Override
	public void initUi() {
		// TODO Auto-generated method stub
		mTitleTextView = (TextView) findViewById(R.id.activity_second_title_textview);

	}

	private void initExtras(Bundle extras) {
		textFromMainActivity = extras.getString(C.MAIN_ACTIVITY_BUNDLE_KEY_TEXT);

	}

	private void setTitleTextView() {
		mTitleTextView.setText(textFromMainActivity);
	}

	@Override
	protected void initListeners() {
		// TODO Auto-generated method stub

	}

}