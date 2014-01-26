/**
 * the log in form page
 */
package com.example.wallt;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
 
public class LoginActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.login_activity);
 
        TextView back = (TextView) findViewById(R.id.backToMain);
 
        back.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching back to login screen
                finish();
            }
        });
    }
}