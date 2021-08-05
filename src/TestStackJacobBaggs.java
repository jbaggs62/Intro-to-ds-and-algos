// Class:     	CS 5040
// Term:       Spring 2021
// Name:       Jacob Baggs
// Program Number: Assignment3 StackADT
// IDE : 	IntelliJ Idea Ultimate

import java.awt.*;
import java.util.Scanner;

public class TestStackJacobBaggs {
        // create initial scanner object with menu
        public static void main(String[] args) {
            StackJacobBaggs newStack = new StackJacobBaggs();
            Scanner input = new Scanner(System.in);
            System.out.print(
                    "0 – Exit Program\n" +
                            "1 – Push\n" +
                            "2 – Pop\n" +
                            "3 – Peek\n" +
                            "4 – Size\n" +
                            "5 – Is Empty?\n" +
                            "6 – Print Stack\n" +
                            "Select Option: ");
            int i = input.nextInt();
            // this option push an object into the stack and show before and after push
            while (i>0){
                if (i==1) {
                    System.out.println("Testing Push()");
                    System.out.println("The stack before pushing: "+ newStack.to_string());
                    System.out.println("Enter Value: ");
                    int entry = input.nextInt();
                    newStack.push(entry);
                    System.out.println("The list after pushing  "+ newStack.to_string());
                }
                // this option pops top value  and show before and after pop
                else if (i==2){
                    System.out.println("Testing Pop()");
                    System.out.println("The List before pop: "+ newStack.to_string());
                    System.out.println("The pop value is:"+ newStack.pop());
                    System.out.println("The list after pop: "+ newStack.to_string());


                }
                // this option prints out the stack and then print out top value
                else if (i==3){
                    System.out.println("Testing peek()");
                    newStack.peek();
                    System.out.println("The stack is " + newStack.to_string());
                    System.out.println("The top element is " + newStack.peek());
                }
                // this option print out size of the stack with showing you the current stack
                else if (i==4){
                    System.out.println("Testing size() of " + newStack.to_string() );
                    newStack.size();
                    System.out.println("The size of the stack is " + newStack.size());
                }
                // this option is use to print out true or false if stack is empty
                else if (i==5){
                    System.out.println("Testing is Empty?() for " + newStack.to_string());
                    newStack.isEmpty();
                    System.out.println("Result from isEmpty() is "+ newStack.isEmpty());
                }
                // this option prints the whole stack
                else if (i==6){
                    System.out.println("Testing print stack");
                    newStack.to_string();
                    System.out.println("The stack is " + newStack .to_string());
                }
                // this option isn't in the menu but was designed as hidden option for designer to test the search function
                // it can be called but doesn't display to user aka it hidden
                else if (i==7){
                    System.out.println("Testing search");
                    System.out.println("Enter Value:");
                    int entry = input.nextInt();
                    newStack.search(entry);
                    System.out.println("The index for "+ entry +" is " + newStack.search(entry));
                }
                //return the options after every run so user can see them
                System.out.print(
                        "0 – Exit Program\n" +
                                "1 – Push\n" +
                                "2 – Pop\n" +
                                "3 – Peek\n" +
                                "4 – Size\n" +
                                "5 – Is Empty?\n" +
                                "6 – Print Stack\n");
                System.out.println("Select Option: ");
                i= input.nextInt();
            }

        }
    }




