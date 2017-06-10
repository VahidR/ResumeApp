package com.home.resumeapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button workHistoryActivity;
    Button callVahidButton;
    Button emailVahidButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workHistoryActivity = (Button) findViewById(R.id.workButton);
        callVahidButton = (Button) findViewById(R.id.callButton);
        emailVahidButton = (Button) findViewById(R.id.emailButton);

        workHistoryActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goingToWorkHistoryActivity = new Intent(getApplicationContext(), WorkHistoryActivity.class);
                startActivity(goingToWorkHistoryActivity);
            }
        });

        callVahidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri phoneNumber = Uri.parse("tel:1234567890");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, phoneNumber);
                startActivity(callIntent);
            }
        });

        emailVahidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"laksjdf@lkjasdf.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Vahid's Resume");
                startActivity(emailIntent);
            }
        });
    }
}
