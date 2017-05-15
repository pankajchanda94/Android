package com.example.pcchanda.myapplication;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by pcchanda on 5/13/17.
 */

public class appendTextToTextView {



    public void append(String s,TextView v)
    {

     v.append(s);

    }

    public void depend(TextView v)
    {

        if(v.getText().length()>0)
        {

            String s = v.getText().toString();
            v.setText("");
            v.append(s.substring(0, s.length() - 1));


        }
    }
}
