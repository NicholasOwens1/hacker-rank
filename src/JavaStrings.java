import java.io.*;
import java.util.*;
public class JavaStrings {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int aLength = A.length();
        int bLength = B.length();
        System.out.print(aLength + bLength + "\n");
        // String[] arr = new arr[2];
        // arr[0] = A;
        // arr[1] = B;
        // if B comes before A in the alphabet print No, otherwise print Yes.
        if (B.compareTo(A) >= 0 ) {
            System.out.print("No \n");
        } else System.out.print("Yes \n");
        //    Print the input with the first
        // letter of each input capitalized and a space in between.
        System.out.print(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));

        /* Enter your code here. Print output to STDOUT. */
    }
}
