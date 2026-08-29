package com.example.chatgptapk;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle state) {
    super.onCreate(state);
    LinearLayout root = new LinearLayout(this);
    root.setOrientation(LinearLayout.VERTICAL);
    root.setGravity(Gravity.CENTER);
    root.setPadding(48,48,48,48);
    TextView title = new TextView(this);
    title.setText("APK başarıyla derlendi");
    title.setTextSize(26);
    title.setGravity(Gravity.CENTER);
    TextView info = new TextView(this);
    info.setText("Android SDK 36 • Debug build");
    info.setTextSize(16);
    info.setGravity(Gravity.CENTER);
    root.addView(title);
    root.addView(info);
    setContentView(root);
  }
}
