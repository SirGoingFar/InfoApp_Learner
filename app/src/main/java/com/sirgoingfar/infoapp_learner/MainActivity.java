package com.sirgoingfar.infoapp_learner;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

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

    }
}
