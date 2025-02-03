public class Scope {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        String name = "shreyash";

        // Block Scope
        {
//            int a = 45; // already initailised the block in the same method hence you annot initiase them again
            a = 100; // here we can reassign the origin refrence variable to some other value
            int c = 334;
            name = "shreyash";
            System.out.println(name);
            // values initialised in this block , will remain in block
        }
        System.out.print(name);
//         System.out.println(c);  // cannot use outside the block


      // Scoping in for loops
        // anything witch initialized inside you cannot define outside
        for (int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 90;
            int a = 20;
        }
        Syatem.out.println(i);

    }
 // Function scope
    static void random( int marks){
         int num = 67;
         System.out.println(num);
         System.out.println(marks);
    }
}