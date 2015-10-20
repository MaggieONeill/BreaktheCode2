package com.epicodus.breakthecode.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.epicodus.breakthecode.R;

public class EnrollActivity extends AppCompatActivity {

    private EditText mEmailText;
    private EditText mNameText;
    private Button mSubmitButton;
    private TextView mThankyouText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);

        mEmailText = (EditText) findViewById(R.id.emailText);
        mNameText = (EditText) findViewById(R.id.nameText);
        mSubmitButton = (Button) findViewById(R.id.submitButton);
        mThankyouText = (TextView) findViewById(R.id.thankyouLabel);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameText.getText().toString();
                String email = mEmailText.getText().toString();
                String message = String.format(
                        "Hello %s, thank you for your interest in Break the Code! \n\n " +
                                "We have sent more information by email to %s", name, email
                );
                mThankyouText.setText(message);

                mEmailText.setVisibility(View.INVISIBLE);
                mNameText.setVisibility(View.INVISIBLE);
                mSubmitButton.setVisibility(View.INVISIBLE);
                mThankyouText.setVisibility(View.VISIBLE);
            }
        });
    }


}
