import java.util.Scanner;
import java.util.Arrays;

public class Input {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);

       // Array of Primitive
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 33;
        arr[2] = 445;
        arr[3] = 55;
        arr[4] = 21; 
       // [23, 33, 445, 55, 21]
       System.out.println(arr[4]);

       // inputs using for loops
       for (int i = 0; i < arr.length; i++){
        arr[i] = in.nextInt();
       }

       System.out.println(Arrays.toString(arr));

    //    for (int i = 0; i < arr.length; i++){
    //     System.out.println(arr[i] + " ");

    //you can directyl get the output
    // by inhance for loop
       
    //    for (int num : arr) { // for every element in array, print the element
    //          System.out.println(num); // here num is represent element of the array
    //    }
     
    //  System.out.println(arr[5]); // index out of boud error
         
         // array of object
         String[]  str = new String[4];
         for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
         }

         System.out.println(Arrays.toString(str));

         // modify 
         str[1] = "Shreyash";

         System.out.println(Arrays.toString(str));

    }
}