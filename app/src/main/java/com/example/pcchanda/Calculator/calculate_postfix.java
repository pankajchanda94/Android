package com.example.pcchanda.Calculator;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by pcchanda on 5/13/17.
 */

public class calculate_postfix {




    public static Stack calculate(Stack exp) throws Exception {
        Stack result = exp;
        double a = 0;
        double b = 0;
        ArrayList<String> arrlist;
        arrlist = new ArrayList<String>();

        while (!exp.isEmpty()) {
            arrlist.add((String) exp.pop());
        }

        for (int i = arrlist.size() - 1; i >= 0; i--) {

            if (!post_to_infix.isOprator(arrlist.get(i))) {
                result.push(Double.parseDouble(arrlist.get(i)));
            } else if (post_to_infix.isOprator(arrlist.get(i))) {

                b = (double) result.pop();

                a = (double) result.pop();
                result.push(calculate_postfix.math(a, b, arrlist.get(i)));

            }

        }
        return result;
    }

    public static double math(double a, double b, String op)  throws Exception{
        double r;
        switch (op) {
            case "+":
                r = a + b;
                break;
            case "-":
                r = a - b;
                break;
            case "*":
                r = a * b;
                break;
            case "/":
                r = a / b;
                break;
            default:
                r = 0;
        }
        return r;
    }

}
