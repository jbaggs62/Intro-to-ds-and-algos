import java.util.*;
public class HashTableJacobBaggs {
    public static void main(String[] args) {
        // create variable for sent. loop
        int repeat_number = 1;
        final int m = 50;
        // inital table
        int[] keys = {1234, 8234, 7867, 1009, 5438, 4312, 3420, 9487, 5418, 5299,
                5078, 8239, 1208, 5098, 5195, 5329, 4543, 3344, 7698, 5412,
                5567, 5672, 7934, 1254, 6091, 8732, 3095, 1975, 3843, 5589,
                5439, 8907, 4097, 3096, 4310, 5298, 9156, 3895, 6673, 7871,
                5787, 9289, 4553, 7822, 8755, 3398, 6774, 8289, 7665, 5523};
        // while loop menus
        while (repeat_number != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n-----MAIN MENU-----");
            System.out.println("0 - Exit Program");
            System.out.println("1 - Run HF1 (Division with Linear Probing)");
            System.out.println("2 - Run HF2 (Division with Quadratic Probing)");
            System.out.println("3 - Run HF3 (Division with Double Hashing)");
            System.out.println("4 - Run HF4 (Student-Designed Function)");

            repeat_number = sc.nextInt();
        // menu options using a switch statement instead of bunch of if/thens
            switch (repeat_number) {
                case 1:
                    System.out.println("Running HF1");
                    int[][] table = new int[50][2];
                    HF1(table,keys,m);
                    printFunction(table);
                    break;
                case 2:
                    System.out.println("Running HF2");
                    int[][] table2 = new int[50][2];
                    HF2(table2,keys,m);
                    printFunction(table2);
                    break;
                case 3:
                    System.out.println("Running HF3");
                    int[][] table3 = new int[50][2];
                    HF3(table3,keys,m);
                    printFunction(table3);
                    break;
                case 4:
                    System.out.println("Running HF4");
                    int[][] table4 = new int[50][2];
                    HF4(table4,keys,m);
                    printFunction(table4);
                    break;
                default:
                    break;
            }

        }
    }

    // different hash functions needed
    public static void  HF1(int [][] table, int [] list, int m){
        for ( int i = 0; i< list.length ; i++){
            int hash= list[i]% m;
            int probe = 0;
            int indx=hash;
            boolean status = true;
            while(status==true){
                probe++;
                if(probe>m){
                    System.out.println("Unable to store key  " + list[i] + " to the table");
                    status=false;
                }
                else if (table[indx][0] != list[i] && table[indx][0] != 0){
                    status =true;
                    indx=(hash+probe)%m;
                }
                else {
                    status=false;
                }
            }
            table[indx][0]= list[i];
            table[indx][1]=(probe-1);
        }
    }

    public static void  HF2(int [][] table, int [] list, int m){
        for ( int i = 0; i< list.length ; i++){
            int hash= list[i]%m;
            int probe = 0;
            int indx=hash;
            boolean status = true;
            while(status==true){
                probe++;
                if(probe>m){
                    System.out.println("Unable to store key  " + list[i] + " to the table");
                    status=false;
                }
                else if (table[indx][0] != list[i] && table[indx][0] != 0){
                    status =true;
                    indx=(hash+(probe * probe) )%m;
                }
                else {
                    status=false;
                }
            }
            table[indx][0]= list[i];
            table[indx][1]=(probe-1);
        }
    }
    public static void  HF3(int [][] table, int [] list, int m){
        for ( int i = 0; i< list.length ; i++){
            int hash= list[i]%m;
            int hash2 = 30-list[i]% 25;
            int probe = 0;
            int indx=hash;
            boolean status = true;
            while(status==true){
                probe++;
                if(probe>m){
                    System.out.println("Unable to store key  " + list[i] + " to the table");
                    status=false;
                }
                else if (table[indx][0] != list[i] && table[indx][0] != 0){
                    status =true;
                    indx=(hash+(probe * hash2))%m;
                }
                else {
                    status=false;
                }
            }
            table[indx][0]= list[i];
            table[indx][1]=(probe-1);
        }
    }
    public static void  HF4(int [][] table, int [] list, int m){
        for ( int i = 0; i< list.length ; i++){
            int hash= list[i]%m;
            int probe = 0;
            int indx=hash;
            boolean status = true;
            while(status==true){
                probe++;
                if(probe>m){
                    System.out.println("Unable to store key  " + list[i] + " to the table");
                    status=false;
                }
                else if (table[indx][0] != list[i] && table[indx][0] != 0){
                    status =true;
                    indx=(hash+(probe*probe*probe))%m;
                }
                else {
                    status=false;
                }
            }
            table[indx][0]= list[i];
            table[indx][1]=(probe-1);
        }
    }

    //sum function to determine # of collisions
    public static int sumProbes(int table [][]){
        //create sum of variable
        int sumOfProbs = 0;
        for (int i=0; i< table.length; i++){
            sumOfProbs= sumOfProbs + table[i][1];
        }
        return sumOfProbs;

    }
    //print function to reduce duplicate code
    public static void printFunction ( int table [][]){
        System.out.println("Index\t\tKey\t\tProbes");
        System.out.println("-----------------------");
        for(int i=0; i < table.length; i++){
            if (i<10){
                System.out.println("   "+ i+"       "+table[i][0]+"        "+ table[i][1]);
            }
            else{
                System.out.println("   "+ i+"      "+table[i][0]+"        "+ table[i][1]);
            }
        }
        System.out.println("----------------------------");
        System.out.println("Sum of probe values = "+ sumProbes(table)+ " probes.");

    }

}
