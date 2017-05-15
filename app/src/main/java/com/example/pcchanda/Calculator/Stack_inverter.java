package com.example.pcchanda.Calculator;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by pcchanda on 5/13/17.
 */

public class Stack_inverter  {



    public static Stack evaluate(Stack exp)  throws Exception{

        Stack<String> result = new Stack<String>();
        ArrayList<String> arrlist = new ArrayList<String>();
        String temp;
        while (!exp.isEmpty()) {
            temp = (String) exp.pop();
            arrlist.add(temp);
            result.push(temp);
        }
        return result;

    }


}
