import java.io.*;
import java.util.Scanner;


public class ReverseString {
//    reverse a string:
//    example: Employed -> deyolpmE
public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next(), reversed = "";
    /* Enter your code here. Print output to STDOUT. */
    // loop through the string backwards and add the current letter to the reversed string.
    for(int i = A.length() - 1 ; i >= 0; i--) {
        char ch = A.charAt(i);
        reversed+=ch;
    }
    if (A.equals(reversed) == true) {
        System.out.print("Yes");
    }
    else System.out.print("No");
}
}