package com.example.pcchanda.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import static android.support.v4.content.ContextCompat.startActivity;


/**
 * Created by pcchanda on 5/15/17.
 */

public class shomylove {

    public void showlove(Context c)
    {




        Intent mylove = new Intent(c,sholove.class);
        //startActivity(c,mylove);
          c.startActivity(mylove);



    }
}
