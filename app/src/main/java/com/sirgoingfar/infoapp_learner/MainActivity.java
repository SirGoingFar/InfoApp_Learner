package com.sirgoingfar.infoapp_learner;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Todo: Open the Profile Activity
    public void openProfilePage(View view) {
        //Step 1: Create an EXPLICIT INTENT (pass in 'this' as context and the Activity class)

        //Step 2: Start the activity using the 'created' intent

        //Todo: Read more...
        // - https://developer.android.com/training/basics/firstapp/starting-activity
        // - https://stackoverflow.com/questions/4186021/how-to-start-new-activity-on-button-click
    }
}
