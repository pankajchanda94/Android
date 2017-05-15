package com.example.pcchanda.Calculator;

import android.util.Log;

import java.util.Stack;

/**
 * Created by pcchanda on 5/13/17.
 */

public class Calculator {



    public String Calculate( String exp) throws Exception {
        Stack result = new Stack();

        Stack<String> corrStack = new Stack<String>();

        post_to_infix postFixExpress = new post_to_infix();

        result = calculate_postfix.calculate(postFixExpress.calculate(Stack_inverter.evaluate(Num_String_to_stack.calculateExp(exp))));

        if(result.size()!=1){
            Log.d("result ",result.toString());
            return "enter properly dude";

        }
        else{
            return result.pop().toString();
        }
    }
}
