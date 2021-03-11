//STACK program !!!

import java.io.*;
import java.util.*;

class StackExc extends Exception
{
    StackExc(String msg)
    {
        super(msg);
    }
}

class Stack
{
    int top,stk[];
    Stack(int size)
    {
        top = -1;
        stk = new int[size];
    }
    public void push(int x) throws StackExc
    {
        if(top==stk.length-1)
        {
            throw new StackExc("Stack is full! Can't push\n");
        }
        stk[++top] = x;
    }
    public int pop() throws StackExc
    {
        if(top==-1)
        {
            throw new StackExc("Stack is empty! Can't pop\n");
        }
        return stk[top--];
    }
    public void display()
    {
        System.out.print("Stack: ");
        for(int i=0;i<=top;i++)
        {
            System.out.print(stk[i]+" ");
        }
        System.out.println("\n");
    }
}
class StackOps
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int pushele,popele,n,ch;
        System.out.print("Enter size of stack: ");
        n = sc.nextInt();
        Stack s = new Stack(n);
        do
        {
            System.out.println("1.Push\n2.Pop\n3.Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    try
                    {
                        System.out.print("Enter the element: ");
                        pushele = sc.nextInt();
                        s.push(pushele);
                        s.display();
                    }
                    catch(StackExc se)
                    {
                        System.out.println("Error: "+se.getMessage());
                    }
                    break;

                case 2:
                    try
                    {
                        popele = s.pop();
                        System.out.println(popele+" has been popped");
                        if(s.top!=-1)
                            s.display();
                        else
                            System.out.println("Stack is empty\n");
                    }
                    catch(StackExc se)
                    {
                        System.out.println("Error: "+se.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice\n");
                    break;
            }
        }while(ch!=3);
        sc.close();
    }
}