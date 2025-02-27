import java.util.Scanner;

import java.util.Arrays;

public class MultiDimension{
    public static void main(String[] args){
         /*
            1 2 3 4
            5 6 7 8

         */
Scanner in = new Scanner(System.in);
int[][] arr = new int[3][3];
      
// System.out.println(arr.length); // number of rows
    // int[][] arr2D = {
    //     {1, 2, 3}, // 0th index
    //     {4, 5},  // 1st index
    //     {6, 7, 8, 9};  // 2nd index
    // };



      
      //input
      for (int row = 0; row < arr.length; row++){
        // for each col in every row
        for(int col = 0; col < arr[row].length; col++){
            arr[row][col] = in.nextInt();
        }
      } 


      //Output
      // for (int row = 0; row < arr.length; row++){
      //   // for each col in every row
      //   for(int col = 0; col < arr[row].length; col++){
      //     System.out.print(arr[row][col] + " ");
      //   }
      //   System.out.println();
      // } 
                

      // ouput
      // for (int row = 0; row < arr.length; row++){
      //   System.out.println(Arrays.toString(arr[row])); // every single element outside the array is aray itself
      // }

      for(int [] a : arr){
        System.out.println(Arrays.toString(a));
      }   
    }
}