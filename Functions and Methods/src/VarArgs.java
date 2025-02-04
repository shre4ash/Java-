import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args){
        fun(2,4,5,6,7,4);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
/*
Returns a string representation of the contents of the specified array.
The string representation consists of a list of the array's elements, enclosed in square brackets ("[]").
Adjacent elements are separated by the characters ", " (a comma followed by a space).
Elements are converted to strings as by String. valueOf(int).
Returns "null" if a is null.
Params:
a – the array whose string representation to return
Returns:
a string representation of */