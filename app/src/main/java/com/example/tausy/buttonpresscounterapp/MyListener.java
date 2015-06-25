package com.example.tausy.buttonpresscounterapp;

import android.view.View;

/**
 * Created by TAUSY on 6/26/2015.
 */
class MyListener implements View.OnClickListener {

    MainActivity caller;
    private int count;

    public MyListener(MainActivity mainActivity){

        this.caller = mainActivity;
        this.count = 0;

    }


    @Override
    public void onClick(View v) {

        count = count + 1;
        String tempRes = "";

            tempRes = "Button is Clicked " + count + " time";
        if(count != 1)
            tempRes = tempRes + "s";
        caller.showText.setText(tempRes);
    }
}
