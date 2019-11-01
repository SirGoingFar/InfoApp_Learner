package com.sirgoingfar.infoapp_learner;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

public class ProfileActivity extends AppCompatActivity {

    private final String TEXT_TO_SHARE = "PERSONAL INFORMATION \n\n" +
            "Name: Android OS\n" +
            "Phone: 08123456789\n" +
            "Email: android@os.com\n" +
            "Location: 618 E South St Orlando, FL\n" +
            "Twitter: https://twitter.com/AndroidDeveloper";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_profile, menu);
        return true;
    }

    // ***
    // TODO: Share the Profile Detail with an Intent
    // ***

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        createShareIntent();
        return super.onOptionsItemSelected(item);
    }


    // ***
    // TODO: Launch the Phone Activity
    // ***

    public void createPhoneIntent(View view) {
        //Step 1: Create an Intent with action 'Intent.ACTION_DIAL'

        //Step 2: Add the telephone number as a data (URI) to the intent
        //Using "tel:phone_num"

        //Step 3: Start the activity
    }


    // ***
    // TODO: Launch the Compose Mail Activity
    // ***

    public void createMailClientIntent(View view) {
        //Step 1: Compose the text to share

        //Step 2: Create a mailClientIntent with action 'Intent.ACTION_SENDTO'.
        Intent mailClientIntent = new Intent(Intent.ACTION_SENDTO);

        //Step 3: Set the intent data ("mailto:recipientEmail")

        //Step 4: Add the text to share as an extra (Intent.EXTRA_TEXT)

        //Step 5: Check if any Mail Client is available to ACCEPT this intent
        if (mailClientIntent.resolveActivity(getPackageManager()) != null){
            //Mail Client app exists, start Mail Client activity
        } else {
            //There is no Mail Client app, DO NOTHING
            Toast.makeText(this, "No Mail Client is available", Toast.LENGTH_SHORT).show();
        }
    }


    // ***
    // TODO: Launch the Google Maps Activity
    // ***

    public void createMapIntent(View view) {
        //Step 1: Create the data for this intent using the Long & Lat of the Location
        //E.g. "geo:0,0?q=618 E South St Orlando, FL 32801"

        //Step 2: Create a mapIntent with action 'Intent.ACTION_VIEW'. Pass the data too

        //Step 3: Set the package name of the Map App (i.e. the unique name of the app)
        //E.g. mapIntent.setPackage("com.google.android.apps.maps");

        //Step 4: Check if the Map app is available to ACCEPT this intent
        //if Map App is available, Start the Map Activity
        //Else, DO NOTHING
    }


    // ***
    // TODO: Launch the Browser App
    // ***

    public void createBrowserIntent(View view) {
        //Step 1: Create the data for this intent using the Twitter Profile address
        //E.g. "https://twitter.com/SirGoingFar"

        //Step 2: Create a browserIntent with action 'Intent.ACTION_VIEW'

        //Step 3: Set the data of the intent

        //Step 4: Start the intent
    }


    // ***
    // TODO: Launch the Share Activity
    // ***

    private void createShareIntent() {
        //Step 1: Compose the text to share

        //Step 2: Create the shareIntent with action 'Intent.ACTION_SEND'

        //Step 3: Specify the intent type
        //E.g. shareIntent.setType("text/plain");

        //Step 4: Add the text to share as an extra data (Intent.EXTRA_TEXT)

        //Step 5: Start shareIntent
    }


    /**
     *
     * NOTE:
     *
     * 1. onClick Methods to be called from the XML MUST be 'public' and NOT 'private' or 'protected'
     *
     * */
}
