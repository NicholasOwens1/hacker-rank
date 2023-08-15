import java.io.*;
import java.util.*;

public class IntToString {


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            String conversion = Integer.toString(input);
            if (conversion instanceof String) {
                System.out.println("Good job");
        }
    }

}
