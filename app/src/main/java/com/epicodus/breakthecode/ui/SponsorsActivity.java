package com.epicodus.breakthecode.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.breakthecode.R;
import com.epicodus.breakthecode.models.PartnerLib;
import com.epicodus.breakthecode.models.Sponsor;
import com.epicodus.breakthecode.models.SponsorLib;

public class SponsorsActivity extends AppCompatActivity {

    private TextView mNameLabel;
    private TextView mDescriptionLabel;
    private ImageView mSponsorImage;
    private Button mNextSponsorButton;

    private SponsorLib mSponsorLib;
    private Sponsor mCurrentSponsor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);

        mNameLabel = (TextView) findViewById(R.id.nameLabel);
        mDescriptionLabel = (TextView) findViewById(R.id.descriptionLabel);
        mSponsorImage = (ImageView) findViewById(R.id.sponsorImage);
        mNextSponsorButton = (Button) findViewById(R.id.nextSponsorButton);
        mSponsorLib = new SponsorLib();
        mCurrentSponsor = mSponsorLib.getSponsors().get(0);

        setLayoutContent();

        mNextSponsorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentSponsor = mSponsorLib.nextSponsor(mCurrentSponsor);
                setLayoutContent();

            }
        });

        mSponsorImage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mCurrentSponsor.getWebsite()));
                startActivity(intent);
            }
        });


    }

    private void setLayoutContent() {
        mNameLabel.setText(mCurrentSponsor.getName());
        mDescriptionLabel.setText(mCurrentSponsor.getDescription());
        mSponsorImage.setImageResource(mCurrentSponsor.getImage());
    }
}
