import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample{
    public static void main(String[] args){
        // syntax
      ArrayList<Integer> list = new ArrayList<Integer>();

      Scanner in = new Scanner(System.in);         

      // list.add(33);
      // list.add(334);
      // list.add(333);
      // list.add(56);
      // list.add(645);
      // list.add(776);

      // int list= scanner.nextInt();

      // System.out.println(list.contains(232)); // checks that this number is there in list

      

    //   list.set(0, 99);  // You can change any number from the list
    //  list.remove(2); // For removing number from list

    //   System.out.println(list);


      //input 
      for (int i = 0; i < 5; i++){
        list.add(in.nextInt());
      }
         
         //get item at any index
      for (int i = 0; i < 5; i++){
        System.out.println(list.get(i)); // pass index here . list[] syantax will not work herer
      }


    }
}