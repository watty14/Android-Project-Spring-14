/**
 * the log in form page
 */
package com.example.wallt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
 
public class LoginActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.login_activity);
        
        TextView login = (TextView) findViewById(R.id.btnLogin);
        
        final TextView userName = (TextView) findViewById(R.id.usernameField);
        final TextView passWord = (TextView) findViewById(R.id.passwordField);
        
        login.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
            	if (userName.getText().toString().equals("user") 
            			&& passWord.getText().toString().equals("password")) {
	            	Intent i = new Intent(getApplicationContext(), MainHub.class);
	          	  	startActivity(i);
            	} else {
            		passWord.setText("");
            		Intent i = new Intent(getApplicationContext(), LoginFail.class);
	          	  	startActivity(i);
            	}
            }
        });
 
        TextView back = (TextView) findViewById(R.id.backToMain);
 
        back.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching back to login screen
                finish();
            }
        });
    }
    

}