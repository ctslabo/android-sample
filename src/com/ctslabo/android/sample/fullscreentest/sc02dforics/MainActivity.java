package com.ctslabo.android.sample.fullscreentest.sc02dforics;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// レイアウトを読み込み
		RelativeLayout view = (RelativeLayout)findViewById(R.id.layout);
		
		// ナビゲーションバーを非表示にする
		view.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
