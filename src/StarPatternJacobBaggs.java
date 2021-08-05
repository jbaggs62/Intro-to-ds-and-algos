// Class:     	CS 5040
// Term:       Spring 2021
// Name:       Jacob Baggs
// Program Number: Assignment1 Programming 1
// IDE : 	IntelliJ Idea Ultimate

import java.util.Scanner;
class StarPatternJacobBaggs{
    /** main method**/
    public static void main(String[] args)
    {
        //Create Scanner
        Scanner input = new Scanner (System.in);
        // create new line for int to be entered
        System.out.print("Enter a number of Rows: ");
        // create input for the line
        int n = input.nextInt();
        //call recursive function
        PrintStars(n,0);
    }
    /** create Recursive function**/
    static void PrintStars(int n, int r)
    {
        // base condition
        if (n < 0)
            return;
        //recursive function
        PrintStars(n-1, r+1);
        // initiate i
        int i;
        // makes spaces
        for (i =0; i < r; i++)
            System.out.printf(" ");
        // print stars with space between them
        for (i=0; i<n; i++) //
            System.out.printf("* ");
        System.out.print("\n");

    }

}