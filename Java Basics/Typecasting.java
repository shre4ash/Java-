import java.util.Scanner;   // import the Scanner class

public class Typecasting{
    public static void main(String[] arges){
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);

         // Typecasting all the decimal will be removed only the integer part will be printed
        // int num = (int)(63.55f);
        // System.out.println(num);

        // automatic type promotion in expression
         int a = 257;
         byte b = (byte)(a);

         System.out.println(b);


    }
}