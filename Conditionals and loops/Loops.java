import  java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        /*
        Syntax for for loop:

        for (initialization; condition; increment/decrement){
              //body
              }
         */

        // Q: Print number from 1 to 5

//        for (int num = 1; num <= 5; num +=2){
//            System.out.println(num);
//        }
        Scanner in = new Scanner(System.in);
//        int n =  in.nextInt(); // This ask fopr inputes  for outputs

//        for (int num = 1; num <= n; num++){
//            System.out.println(num + " ");
//        }


        //While loop
        /*
        Syntax:
        while (condition) {
            // body
         }
         
       */
//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num += 1;
//        }

        // do while
        /*

        do {

        } while (condition);

         */
        int n = 1;
         do {

             System.out.println(n);
         } while ( n <= 5);
    }
}