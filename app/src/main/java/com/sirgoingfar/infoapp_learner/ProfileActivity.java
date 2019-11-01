package com.sirgoingfar.infoapp_learner;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

        //Todo: Read More...
        // - https://developer.android.com/guide/topics/ui/menus
        // - http://www.dre.vanderbilt.edu/~schmidt/android/android-4.0/out/target/common/docs/doc-comment-check/guide/topics/ui/menus.html

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

        //Todo: Read more...
        // - https://android--code.blogspot.com/2017/08/android-open-dialer-with-phone-number.html
        // - https://stackoverflow.com/questions/11699819/how-do-i-get-the-dialer-to-open-with-phone-number-displayed
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

        //Todo: Read more...
        // - https://medium.com/@cketti/android-sending-email-using-intents-3da63662c58f
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

        //Todo: Read more...
        // - https://developers.google.com/maps/documentation/urls/android-intents
        // - https://www.codexpedia.com/android/android-open-map-apps-through-intent/
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

        //Todo: Read more...
        // - https://www.tutorialkart.com/kotlin-android/android-open-url-in-browser-activity/
        // - https://stackoverflow.com/questions/3004515/sending-an-intent-to-browser-to-open-specific-url?rq=1
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

        //Todo: Read more...
        // - https://developer.android.com/training/sharing/send
        // - https://stackoverflow.com/questions/9948373/android-share-plain-text-using-intent-to-all-messaging-apps
    }


    /**
     *
     * NOTE:
     *
     * 1. onClick Methods to be called from the XML MUST be 'public' and NOT 'private' or 'protected'
     *
     * */
}
