package biz.osvit.soloeffort.activities;

import biz.osvit.soloeffort.R;
import biz.osvit.soloeffort.R.layout;
import biz.osvit.soloeffort.R.menu;
import biz.osvit.soloeffort.utils.C;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class DrugiActivity extends BaseActivity {

	private TextView mTitleTextView;
	private String textPrviActivity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		// i sad mi pokreni layout
		initUI();

		Bundle extras = getIntent().getExtras();

		if (extras != null) {
			initExtras(extras);
		}

		setTitleTextView();
	}

	@Override
	public void initUI() {
		// iscrtavanje svega što treba bit tu na drugom ekranu

		mTitleTextView = (TextView) findViewById(R.id.activity_second_text_unos);

	}

	private void initExtras(Bundle extras) {
		textPrviActivity = extras.getString(C.MAIN_ACTIVITY_BUNDLE_KEY_TEXT);

	}

	private void setTitleTextView() {

		mTitleTextView.setText("Unio si: " + textPrviActivity);

	}
	
	
	//ovo ne treba ali ne smijem obrisat jer je to iz apstraktne klase

	@Override
	public void initListeners() {
		// TODO Auto-generated method stub

	}

}
