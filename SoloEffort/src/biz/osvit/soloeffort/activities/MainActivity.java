package biz.osvit.soloeffort.activities;

import biz.osvit.soloeffort.R;
import biz.osvit.soloeffort.R.id;
import biz.osvit.soloeffort.utils.C;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity {

	// osnovni dio

	private EditText mInputEditText;
	private Button mSubmitButton;

	protected void onCreate(Bundle savedInstanceState) {
		// ovaj dio bi TREBAO rijesiti autocomplete :)
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// pokretanje metoda navedenih dolje
		initUI();
		initListeners();
	}

	@Override
	public void initUI() {
		// pokreni i kreiraj button i textbox

		mInputEditText = (EditText) findViewById(R.id.activity_main_tekst);
		mSubmitButton = (Button) findViewById(R.id.activity_main_button);

	}

	@Override
	public void initListeners() {
		// pokreni listenere na textboxu i buttonu
		mInputEditText.setOnClickListener(mOnClickListener);
		mSubmitButton.setOnClickListener(mOnClickListener);

	}

	// e sad idem definirat listenere

	public OnClickListener mOnClickListener = new OnClickListener() {

		@Override
		public void onClick(View slusalica) {
			// TODO Auto-generated method stub
			switch (slusalica.getId()) {
			case R.id.activity_main_button:
				String privremeniText = mInputEditText.getText().toString();
				pokreniDrugiActivity(privremeniText);
				break;
			}
		}
	};

	private void pokreniDrugiActivity(String predaniText) {
		Intent namjeraPokretanja = new Intent(this, DrugiActivity.class);
		namjeraPokretanja
				.putExtra(C.MAIN_ACTIVITY_BUNDLE_KEY_TEXT, predaniText);
		startActivity(namjeraPokretanja);

	}
}
