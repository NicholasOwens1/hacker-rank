import java.io.*;
import java.util.*;

public class StaticInitialization {


    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String input2 = scanner.nextLine();
            // turn input into an integer
            int num1 = Integer.parseInt(input);
            int num2 = Integer.parseInt(input2);
            if (num1 <= 0 || num2 <= 0) {
                System.out.print("java.lang.Exception: Breadth and height must be positive");
            } else System.out.print(num1 * num2);
        }
    }
}
