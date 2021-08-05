import java.util.Scanner;
// main sorting function  that call the partition function and two quick sorts to actually sort
public class QuickSortJacobBaggs{
    public static void quickSort(int[] list){
        quickSort(list, 0, list.length-1);
    }
    public static void quickSort( int[] list, int first, int last){
        if (last > first){
            int pI = partition(list, first, last);
            quickSort(list, first, pI-1);
            quickSort(list, pI +1, last);
        }
    }
    // split the value and established the pivot, low, and high value
    public static int partition(int[] list, int first, int last){
        int pivot = list[first];
        int low = first + 1;
        int high = last;
        while (high>low){
            while (low <= high && list[low] <= pivot)
                low++;
            while(low <= high && list[high]> pivot)
                high--;
            if (high > low){
                int temp = list[high];
                list[high]= list[low];
                list[low]=temp;
            }
        }
        while (high > first && list[high]>= pivot)
            high--;
        if (pivot > list[high]){
            list[first]=list[high];
            list[high]=pivot;
            return high;
        }
        else {
            return first;
        }
    }
    // so we can print the list out from bytes
    public static void printList( int[] list){
        System.out.print(list[0]);
        for (int i =1; i < list.length; i++)
            System.out.print(", "+list[i]);
        System.out.println();
    }
    // establish inputs, and print outs put using while loop to allow for multiple runs
    public static void main(String[] args) {
        boolean repeat = true;
        while (repeat != false) {
            Scanner arraySizeInput = new Scanner(System.in);
            System.out.println("How many integer numbers do you have?: ");
            int arraySize = arraySizeInput.nextInt();
            Scanner arrayInput = new Scanner(System.in);
            System.out.println("Enter " + arraySize + " integer numbers: ");
            int[] inputs = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                inputs[i] = arrayInput.nextInt();
            }
            System.out.print("Inputs array before sorting (quick): ");
            printList(inputs);
            quickSort(inputs);
            System.out.print("Inputs array after sorting (quick): ");
            printList(inputs);
            System.out.println("Do you want to rerun code with different inputs(Y/N);");
            Scanner yesOrNo = new Scanner(System.in);
            String response = yesOrNo.next();
            String exitVaule = "N";
            if (response.equals("N")) {
                repeat = false;
            }
        }
    }

}
