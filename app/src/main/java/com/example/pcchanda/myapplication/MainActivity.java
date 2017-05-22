package com.example.pcchanda.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import com.example.pcchanda.Calculator.*;



public class MainActivity extends AppCompatActivity {



    TextView textBox;
    boolean equalFlag = false;

    Calculator calcu ;
    Boolean errorFlag = false;

    Double result = 0.0;
    appendTextToTextView textbox ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBox = (TextView)findViewById(R.id.textBox);


        textbox = new appendTextToTextView();
        calcu = new Calculator();

        Button one = (Button)findViewById(R.id.one);
        one.setOnClickListener(listner);
        Button two = (Button)findViewById(R.id.two);
        two.setOnClickListener(listner);
        Button three = (Button)findViewById(R.id.three);
        three.setOnClickListener(listner);
        Button  four = (Button)findViewById(R.id.four);
        four.setOnClickListener(listner);
        Button  five= (Button)findViewById(R.id.five);
        five.setOnClickListener(listner);
        Button six = (Button)findViewById(R.id.six);
        six.setOnClickListener(listner);
        Button seven = (Button)findViewById(R.id.seven);
        seven.setOnClickListener(listner);
        Button eight  = (Button)findViewById(R.id.eight);
        eight.setOnClickListener(listner);
        Button  nine = (Button)findViewById(R.id.nine);
        nine.setOnClickListener(listner);
        Button  zero = (Button)findViewById(R.id.zero);
        zero.setOnClickListener(listner);

        Button del = (Button)findViewById(R.id.del);
        del.setOnClickListener(listner);
        Button devide  = (Button)findViewById(R.id.devide);
        devide.setOnClickListener(listner);
        Button  multiply = (Button)findViewById(R.id.multiply);
        multiply.setOnClickListener(listner);
        Button  minus = (Button)findViewById(R.id.minus);
        minus.setOnClickListener(listner);
        Button  plus = (Button)findViewById(R.id.plus);
        plus.setOnClickListener(listner);
        Button equal  = (Button)findViewById(R.id.equal);
        equal.setOnClickListener(listner);
        Button dot = (Button)findViewById(R.id.dot);
        dot.setOnClickListener(listner);
        Button clear = (Button)findViewById(R.id.clear);
        clear.setOnClickListener(listner);

        Button bracketOpen = (Button)findViewById(R.id.BracketOpen);
        bracketOpen.setOnClickListener(listner);
        Button bracketClose = (Button)findViewById(R.id.BracketClose);
        bracketClose.setOnClickListener(listner);


       //textBox = (TextView) findViewById(R.id.textbox);

        //test change comment
    }



    private  OnClickListener listner = new OnClickListener() {
        @Override
        public void onClick(View v) {

            textBox.setMovementMethod(new ScrollingMovementMethod());
               textBox.setTextSize(70);


            if(equalFlag)
            {

                equalFlag = false;
            }

if(errorFlag )
{
    textBox.setText("");
    errorFlag = false;
}


        switch (v.getId())
        {
            case R.id.one:
                textbox.append("1",textBox);
                break;
            case R.id.two:
                textbox.append("2",textBox);
                break;
            case R.id.three:
                textbox.append("3",textBox);
                break;
            case R.id.four:
                textbox.append("4",textBox);
                break;
            case R.id.five:
                textbox.append("5",textBox);
                break;
            case R.id.six:
                textbox.append("6",textBox);
                break;
            case R.id.seven:
                textbox.append("7",textBox);
                break;
            case R.id.eight:
                textbox.append("8",textBox);
                break;
            case R.id.nine:
                textbox.append("9",textBox);
                break;
            case R.id.zero:
                textbox.append("0",textBox);
                break;
            case R.id.devide:
                textbox.append("/",textBox);
                break;
            case R.id.multiply:
                textbox.append("*",textBox);
                break;
            case R.id.minus:
                textbox.append("-",textBox);
                break;
            case R.id.plus:
                textbox.append("+",textBox);
                break;
            case R.id.equal:
               try {
                    equalFlag= true;
                   if(textBox.getText().toString().equals("142+1"))
                   {
                       shomylove sholove = new shomylove();
                       sholove.showlove(getBaseContext());
                   }
                   /*DecimalFormat dc = new DecimalFormat();
                   dc.setMaximumFractionDigits(5);*/
                   textBox.setTextSize(40);

                //   Log.d("adsfa",dc.format(calcu.Calculate(textBox.getText().toString()).toString()));
                  Log.d("dfsd","asdfasdf");

                   textBox.setText(calcu.Calculate(textBox.getText().toString()));


               }
               catch (Exception e){
                   Log.d("stack trace",e.toString());
                   errorFlag= true;
                textBox.setText("Dude enter properly");
            }
                //textBox.setText();
                break;
            case R.id.del:
                textbox.depend(textBox);
                break;
            case R.id.dot:
                textbox.append(".",textBox);
                break;
            case R.id.clear:
                textBox.setText("");
                break;
            case R.id.BracketClose:
                textBox.append(")");
                break;
            case R.id.BracketOpen:
                textBox.append("(");
                break;

        }

        }
    };



}

