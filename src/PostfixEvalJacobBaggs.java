// Class:     	CS 5040
// Term:       Spring 2021
// Name:       Jacob Baggs
// Program Number: Assignment3 StackADT
// IDE : 	IntelliJ Idea Ultimate


import java.util.Locale;
import java.lang.Math;
import java.util.Scanner;
public class PostfixEvalJacobBaggs {
    public static void main(String[] args) {
        // generate scanner object and grab input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String entry = input.nextLine();
        // casting since it all integers
        StackJacobBaggs<Integer> newStack = new StackJacobBaggs<Integer>();
        // checking if each value is a operand or a operator
        for (int i = 0; i < entry.length(); i++) {
            if (Character.isDigit(entry.charAt(i))) {
                newStack.push(Character.getNumericValue((entry.charAt(i))));
            }
            // creating new integer to do the calculation if the stack is big enough
            else {
                int stackSize = newStack.size();
                if (stackSize >= 2) {
                    Integer num2 = newStack.pop();
                    Integer num1 = newStack.pop();
                    String operate = "";
                    operate = operate += entry.charAt(i);
                    //various operations power is not native function so we import math based lang library
                    if (operate.equals("^")){

                        newStack.push((int) Math.pow(num1, num2));
                    }

                    else if (operate.equals("+")) {

                        newStack.push(num1 + num2);
                    }
                    else if (operate.equals("-")) {

                        newStack.push(num1 - num2);
                    }
                    else if (operate.equals("*")) {
                        newStack.push(num1 * num2);
                    }
                    else if (operate.equals("/")) {

                        newStack.push((num1 / num2));
                    }
                }
                //once it done we pop  the value of th stack
                else
                    newStack.pop();
            }
        }
        // return result values with logic to handle bad expressions
        int stackSize = newStack.size();
        if (stackSize == 1) {
            System.out.println("Result Value is " + newStack.pop());
        }
        else {
            System.out.println("The input Postfix expression is not valid");
        }
    }
}

