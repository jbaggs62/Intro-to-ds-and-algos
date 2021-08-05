// Class:     	CS 5040
// Term:       Spring 2021
// Name:       Jacob Baggs
// Program Number: Assignment3 StackADT
// IDE : 	IntelliJ Idea Ultimate



import java.util.Locale;
import java.util.Scanner;
public class TestPalindromeJacobBaggs {


    public static void main(String[] args)
    {
        // setup scanner and grab user input for string to test
        StackJacobBaggs newStack = new StackJacobBaggs();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to test: ");
        String str1 = input.nextLine();
        System.out.println("Input String: "+str1);
        // removes spaces
        String str1NoWS = str1.replaceAll("\\s+","");
        //converts to lower case
        String str1Fixed= str1NoWS.toLowerCase(Locale.ROOT);
        String str2 = "";

        // iterate over each object and push to new stack
        for(int i =0; i< str1Fixed.length();i++){
            newStack.push(str1Fixed.charAt(i));
        }
        // pops our the stack which will be the reverse order of how it went into string 2
        while (newStack.isEmpty()!=true){
            str2=str2+newStack.pop();

        }
        // returns statement based on whether str1 and str2 are equal or not
        if(str1Fixed.equals((str2)))
            System.out.println("Judgement: String1 is palindrome");
        else{
            System.out.println("Judgement: String1 is not a palindrome");
        }

    }
}
