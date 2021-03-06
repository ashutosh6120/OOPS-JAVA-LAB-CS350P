//TO FIND ROOTS OF QUADRATIC EQUATION!

import java.io.*;
import java.util.Scanner;
import static java.lang.Math.*;
class Quadratic
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("let the equation be Ax^2+Bx+c=0"); // equation declaration
        System.out.println("enter the values of A, B and C:"); // input values a,b,c
        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
        double d=b*b-4*a*c; // descriminant calculation

        if(d==0)
            System.out.printf("roots are:  %.2f   %.2f ",-b/(2.0*a),-b/(2.0*a));  //if des is 0 
        else if(d>0)
            System.out.printf("roots are:  %.2f   %.2f ",(-b+Math.sqrt(d))/(2.0*a),(-b-Math.sqrt(d))/(2.0*a));   //if des greater than 0
        else
        {
            double x=-b/(2.0*a),y=Math.sqrt(-d)/(2.0*a);
            System.out.printf("roots are:  %.2f+ %.2fi   %.2f- %.2fi",x,y,x,y);
        }  
    }
}
