//TO PRINT PYRAMID SHAPE USING * SYMBOLS

import java.io.*;

public class pyramid    //class declaration
{
    public static void printstars(int n)
    {
        int i, j;
        for(i=0; i<n; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");      // using * to print
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int n = 8;     // size of the input
        printstars(n);
    }
}
