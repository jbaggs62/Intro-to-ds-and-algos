import java.util.*;



public class RadixSortJacobBaggs {

    public static void RadixSort(int[] list) {
        //get the number of digits to determine the # of loops
        int maxDigiits = 0;
        for (int i =0; i < list.length; i++){
            int temp = DigitCount(list[i]);
            if (temp> maxDigiits){
                maxDigiits = temp;
            }
        }
        // create queues
        QueueLinkedList bucket0 = new QueueLinkedList();
        QueueLinkedList bucket1 = new QueueLinkedList();
        QueueLinkedList bucket2 = new QueueLinkedList();
        QueueLinkedList bucket3 = new QueueLinkedList();
        QueueLinkedList bucket4 = new QueueLinkedList();
        QueueLinkedList bucket5 = new QueueLinkedList();
        QueueLinkedList bucket6 = new QueueLinkedList();
        QueueLinkedList bucket7 = new QueueLinkedList();
        QueueLinkedList bucket8 = new QueueLinkedList();
        QueueLinkedList bucket9 = new QueueLinkedList();
        //sort list using different buckets, which bucket they go in detemrine by the current digit
        for (int i =0; i < maxDigiits;i++) {
            // bucket for each digit with I being the digit you are on and k the is where you are in the list
            for (int k=0; k < list.length; k++) {
                int temp = ExtractDigit(list[k],i);
                if(temp == 0) {
                    bucket0.enqueue(list[k]);
                }
                if(temp == 1) {
                    bucket1.enqueue(list[k]);
                }
                if(temp == 2) {
                    bucket2.enqueue(list[k]);
                }
                if(temp == 3) {
                    bucket3.enqueue(list[k]);
                }
                if(temp == 4) {
                    bucket4.enqueue(list[k]);
                }
                if(temp == 5) {
                    bucket5.enqueue(list[k]);
                }
                if(temp == 6) {
                    bucket6.enqueue(list[k]);
                }
                if(temp == 7) {
                    bucket7.enqueue(list[k]);
                }
                if(temp == 8) {
                    bucket8.enqueue(list[k]);
                }
                if(temp == 9) {
                    bucket9.enqueue(list[k]);
                }
            }
            //empty buckets in proper order using dequeue to grab them out of their queue remember queue are FIFO
            //start with position zero and loop through each bucket
            int count=0;
            while (!bucket0.isEmpty()) {
                list[count] = ((int) bucket0.dequeue());
                count++;
            }
            while (!bucket1.isEmpty()) {
                list[count] = ( (int) bucket1.dequeue());
                count++;
            }
            while (!bucket2.isEmpty()) {
                list[count] = ( (int) bucket2.dequeue());
                count++;
            }
            while (!bucket3.isEmpty()) {
                list[count] = ((int)  bucket3.dequeue());
                count++;
            }
            while (!bucket4.isEmpty()) {
                list[count] = ((int) bucket4.dequeue());
                count++;
            }
            while (!bucket5.isEmpty()) {
                list[count] = ((int) bucket5.dequeue());
                count++;
            }
            while (!bucket6.isEmpty()) {
                list[count] = ((int) bucket6.dequeue());
                count++;
            }
            while (!bucket7.isEmpty()) {
                list[count] = ((int) bucket7.dequeue());
                count++;
            }
            while (!bucket8.isEmpty()) {
                list[count] = ((int) bucket8.dequeue());
                count++;
            }
            while (!bucket9.isEmpty()) {
                list[count] = ((int) bucket9.dequeue());
                count++;
            }

        }

    }
    // print code for print function so you don't just get bytes
    public static void printList(int[] list) {
        System.out.print(list[0]);
        for (int i = 1; i < list.length; i++)
            System.out.print(", " + list[i] );
        System.out.println();
    }
    // extract the digit
    public static int ExtractDigit(int digitNum, int position) {
        int result = 1;
        for (int i = 0; i < position; i++)
            result *= 10;
        return (digitNum / result) % 10;
    }
// counts the number of digits in a element
    public static int DigitCount(int digitNum) {
        int count = 0;
        double number = digitNum;
        while (number > 1) {
            number /= 10;
            count++;
        }
        return count;
    }

// main function that handle calling sort, inputs and while loop to create senitenal program
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
            System.out.print("Inputs array before sorting (Radix): ");
            printList(inputs);
            RadixSort(inputs);
            System.out.print("Inputs array after sorting (Radix): ");
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
