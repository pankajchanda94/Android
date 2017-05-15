package com.example.pcchanda.Calculator;

import java.util.Stack;

/**
 * Created by pcchanda on 5/13/17.
 */

public class Num_String_to_stack {

    public static Stack calculateExp(String exp) throws Exception {
        Stack<String> result = new Stack<String>();
        String nums = "";
        String previousOperator = "";
        for (int i = 0; i < exp.length(); i++) {
            if (Num_String_to_stack.isNum(exp.charAt(i))) {
                nums += exp.charAt(i);
                if ((i != exp.length() - 1) && !Num_String_to_stack.isNum(exp.charAt(i + 1)) && exp.charAt(i) == '.') {
                    nums += '0';
                }
            } else {

                if (nums == "") {

                    if (exp.charAt(i) == '(' && i != 0 && exp.charAt(i - 1) == ')') {
                        result.push("*");
                    }
                    result.push(Character.toString(exp.charAt(i)));
                    previousOperator = Character.toString(exp.charAt(i));
                } else {
                    result.push(nums);
                    if (exp.charAt(i) == '(') {
                        result.push("*");
                    }
                    result.push(Character.toString(exp.charAt(i)));
                    if (exp.charAt(i) == ')' && i != exp.length() - 1 && Num_String_to_stack.isNum(exp.charAt(i + 1))) {
                        result.push("*");
                    }
                    previousOperator = Character.toString(exp.charAt(i));
                    nums = "";
                }
            }

        }
        if (nums != "") {
            result.push(nums);
        }
        return result;

    }

    public static boolean isNum(char num)  throws  Exception{

        return (((num >= 48) && (num <= 57)) || num == 46);

    }

}
