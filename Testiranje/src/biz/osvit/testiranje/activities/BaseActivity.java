package biz.osvit.testiranje.activities;

import android.app.Activity;

public abstract class BaseActivity extends Activity{

	abstract void initUI ();
	abstract void initListeners();
}
