
//1. GENERATE PRIME NO BETWEEN GIVEN INTERVAL
import java.util.Scanner;
public class Primerange
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,i,j,flag; // variable decalaration
        System.out.printf("enter lower upound:"); //asking user input
        a = sc.nextInt(); //taking input

        System.out.printf("enter upper upound:"); //asking user input
        b = sc.nextInt(); //taking input

        System.out.printf("\nPrime no between %d and %d are:",a,b);
        for (i = a; i <= b; i++) //Traversing loop
        {
            if(i == 1 || i == 0) //skipping 0 and 1 as they are not prime
               continue;
            flag = 1;   //to tell if i prime or not  
            for(j = 2; j <= i/2; ++j)
            {
                if(i % j ==0)
                {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
                System.out.println(i);
        }

    }
}
