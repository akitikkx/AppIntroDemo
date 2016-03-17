package com.tikiwa.ahmed.appintrodemo;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;

import com.vlonjatg.android.apptourlibrary.AppTour;
import com.vlonjatg.android.apptourlibrary.MaterialSlide;

public class MainActivity extends AppTour {

    @Override
    public void init(Bundle savedInstanceState) {
        // add color(s) for each of the slides
        // which can then be added as the second param
        // for addSlide
        int firstColor = Color.parseColor("#197C89");

        // define the first slide
        Fragment firstSlide = MaterialSlide.newInstance(android.R.drawable.ic_media_play, "First Slide title",
                "First slide information here", Color.WHITE, Color.WHITE);

        // define the next slide
        Fragment secondSlide = MaterialSlide.newInstance(android.R.drawable.ic_media_play, "Second Slide title",
                "Second slide information here", Color.WHITE, Color.WHITE);

        // define the next slide
        Fragment thirdSlide = MaterialSlide.newInstance(android.R.drawable.ic_media_play, "Third Slide title",
                "Third slide information here", Color.WHITE, Color.WHITE);

        // define the next slide
        Fragment fourthSlide = MaterialSlide.newInstance(android.R.drawable.ic_media_play, "Fourth Slide title",
                "Fourth slide information here", Color.WHITE, Color.WHITE);

        // define the next slide
        Fragment fifthSlide = MaterialSlide.newInstance(android.R.drawable.ic_media_play, "Fifth Slide title",
                "Fifth slide information here", Color.WHITE, Color.WHITE);

        // add each slide using addSlide method
        addSlide(firstSlide, firstColor);
        addSlide(secondSlide, firstColor);
        addSlide(thirdSlide, firstColor);
        addSlide(fourthSlide, firstColor);
        addSlide(fifthSlide, firstColor);

        setSkipButtonTextColor(Color.WHITE);
        setNextButtonColorToWhite();
        setDoneButtonTextColor(Color.WHITE);
    }

    @Override
    public void onSkipPressed() {

    }

    @Override
    public void onDonePressed() {

    }
}
