package com.fasco.tanfidzxviimmonline;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Arifh on 31/01/2015.
 */
public class Help extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

        // get action bar
        ActionBar actionBar = getActionBar();

        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}

