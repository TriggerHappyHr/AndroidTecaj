package biz.osvit.imeprezime;

import biz.osvit.imeprezime.R;
import biz.osvit.imeprezime.R.layout;
import biz.osvit.imeprezime.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
