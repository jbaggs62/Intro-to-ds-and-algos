// Class:     	CS 5040
// Term:       Spring 2021
// Name:       Jacob Baggs
// Program Number: Assignment1 Programming 1
// IDE : 	IntelliJ Idea Ultimate


import java.util.Scanner;
class VowelsJacobBaggs{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        // create new line for int to be entered
        System.out.print("Enter a String: ");
        // create input for the line
        String s = input.nextLine();
        //call recursive function
        System.out.println("Entered String: " + s);
        System.out.println( "Number of Vowels: " + countVowels(s, s.length()));
    }
    //helper function
    static int Vowel_Finder(char ch){
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch =='u')
            return 1;
        else return 0;
    }
    //recursive function
    static int countVowels(String str, int i)
    {
        if (i == 1) {
            return Vowel_Finder(str.charAt(i - 1));
        }
        return countVowels(str, i-1) + Vowel_Finder(str.charAt(i-1));

    }
}