// Class:     	CS 5040
// Term:       Spring 2021
// Name:       Jacob Baggs
// Program Number: Assignment2 LinkedList
// IDE : 	IntelliJ Idea Ultimate


import java.util.Scanner;
public class ListTestJacobBaggs {
    public static void main(String[] args) {
        LinkedListJacobBaggs newList = new LinkedListJacobBaggs();
        Scanner input = new Scanner(System.in);
        System.out.print(
                "0 – Exit Program\n" +
                        "1 – Add First Node\n" +
                        "2 – Add Last Node\n" +
                        "3 – Add at Index\n" +
                        "4 – Remove First Node\n" +
                        "5 – Remove Last Node\n" +
                        "6 – Remove at Index\n" +
                        "7 – Print List Size\n "+
                        "Select Option: ");
        int i = input.nextInt();

        while (i>0){

            if (i==1) {
                System.out.println("Testing addFirst()");
                System.out.println("The List before adding an element to first Node: "+ newList);
                System.out.println("Enter Value: ");
                String entry = input.next();
                newList.addFirst(entry);
                System.out.println("The list after adding an element to first Node: "+ newList);
            }
            else if (i==2){
                System.out.println("Testing addLast()");
                System.out.println("The List before adding an element to last Node: "+ newList);
                System.out.println("Enter Value: ");
                String entry = input.next();
                newList.addLast(entry);
                System.out.println("The list after adding an element to last Node: "+ newList);


            }
            else if (i==3){
                System.out.println("Testing add()");
                System.out.println("The List before adding an element to " + newList);
                System.out.println("Enter an Index: ");
                int index = input.nextInt();
                System.out.println("Enter an Value: ");
                String entry = input.next();
                newList.add(index, entry);
                System.out.println("The List after adding an element to " + newList + " at the " + index);
            }
            else if (i==4){
                System.out.println("Testing removeFirst()");
                System.out.println("The List before removing an element at first Node: "+ newList);
                newList.removeFirst();
                System.out.println("The List after removing an element at first Node: "+ newList);
            }
            else if (i==5){
                System.out.println("Testing removeLast()");
                System.out.println("The List before removing an element at last Node: "+ newList);
                newList.removeLast();
                System.out.println("The List after removing an element at last Node: "+ newList);
            }
            else if (i==6){
                System.out.println("Testing remove()");
                System.out.println("The List before removing an element: "+ newList);
                System.out.println("Enter an Index: ");
                int index = input.nextInt();
                newList.remove(index);
                System.out.println("The List after removing an element to " + newList + " at the " + index);;
            }
            else if (i==7){
                if (newList.size()!=0){
                System.out.println("The size of this list is " + newList.size());
            }
            }
            System.out.print(
                    "0 – Exit Program\n" +
                            "1 – Add First Node\n" +
                            "2 – Add Last Node\n" +
                            "3 – Add at Index\n" +
                            "4 – Remove First Node\n" +
                            "5 – Remove Last Node\n" +
                            "6 – Remove at Index\n" +
                            "7 – Print List Size\n ");
            System.out.println("Select Option: ");
            i= input.nextInt();
        }

    }
}



