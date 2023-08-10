import java.util.*;
import java.io.*;



public class Classify {

    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        long t =sc.nextLong();

        for(long i=0;i<t;i++)
        {

            try
            {
                // capture the number input
                long x =sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.print("* short \n");
                if(x>=-2147483648 && x<= 2147483647)System.out.print("* int \n");
                if(x>=-2147483648 && x<= 2147483647)System.out.print("* long \n");
                if(x < -2147483648 || x > 2147483647)System.out.print("* long \n");



            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}




