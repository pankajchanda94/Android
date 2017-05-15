package com.example.pcchanda.Calculator;

import java.util.Stack;

/**
 * Created by pcchanda on 5/13/17.
 */

public class post_to_infix {



    public Stack calculate(Stack exp) throws Exception {

        Stack pexp = new Stack();

        Stack opst = new Stack();
        while (!exp.isEmpty()) {

            String item = (String) exp.pop();

            if (!post_to_infix.isOprator(item)) {
                pexp.push(item);

            } else {

                if (opst.isEmpty() || item == "(") {

                    opst.push(item);

                } else if (!item.equals(")")) {

                    String chart = item;
                    try {
                        while (!opst.isEmpty() && !((String) opst.peek()).equals("(") && (post_to_infix.priotity(chart) >= post_to_infix.priotity((String) opst.peek()))) {

                            pexp.push(opst.pop());

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    opst.push(chart);

                } else {
                    while (!((String) opst.peek()).equals("(")) {
                        pexp.push(opst.pop());

                    }
                    if (((String) opst.peek()).equals("(")) {
                        opst.pop();

                    }

                }

            }

        }
        while (!opst.isEmpty() && !((String) opst.peek()).equals("(") && !((String) opst.peek()).equals(")")) {
            pexp.push(opst.pop());

        }
        return pexp;
    }

    public static boolean isOprator(String a) throws Exception {
        try {
            Double.parseDouble(a);

            return false;

        } catch (NumberFormatException e) {

            return true;
        }

    }

    public static int priotity(String Op) throws Exception {
        int x = 0;
        switch (Op) {
            case "^":
                x = 1;
                break;
            case "*":
                x = 2;
                break;
            case "/":
                x = 2;
                break;
            case "+":
                x = 3;
                break;
            case "-":
                x = 3;
                break;
            default:

        }
        return x;
    }

}
