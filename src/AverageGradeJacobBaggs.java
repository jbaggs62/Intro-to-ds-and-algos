// Class:     	CS 5040
// Term:       Spring 2021
// Name:       Jacob Baggs
// Program Number: Assignment1 Programming 1
// IDE : 	IntelliJ Idea Ultimate

import java.util.Scanner;
class AverageGradeJacobBaggs{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        // create new line for int to be entered
        System.out.print("Enter number of students: ");
        // create input for the class size
        int cs = input.nextInt();
        // create input for the grades
        int[] g = new int[cs];
        System.out.print("Enter Grades: ");
        // loop to create array of grade
        for (int i=0; g.length > i; i++)
            g[i]=input.nextInt();
        //call recursive function
        System.out.println("Class Size: " + cs);
        System.out.println("Class Average: " + findAverage(g, cs));

    }
    static double findAverage(int g[], int cs)
    {
        if (cs == 1)
            return (double) g[cs-1];
        else
            return ((double) (findAverage(g, cs-1)*(cs-1) +
                    g[cs-1]) / cs);
    }
}
