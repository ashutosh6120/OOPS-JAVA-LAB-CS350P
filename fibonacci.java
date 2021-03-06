//FIBONACCI JAVA PROGRAM
class fibonacci
{
    static void fibonacci(int n)
    {
        int num1 = 0, num2 = 1;  // assigning the first required values
        int counter = 0;
        while(counter<n)
        {
            System.out.println(num1 + "");
            int num3 = num2 + num1;  // adding the values
            num1 = num2;
            num2 = num3;
            counter= counter +1;
        }
    }

    public static void main(String args[])
    {
        int n = 15;
        fibonacci(n);
    }
}