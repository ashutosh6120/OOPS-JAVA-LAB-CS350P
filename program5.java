//CLASS ACCOUNT AND METHODS AND MAIN METHOD 
import java.util.Scanner;

class Account{
    private String name;
    private long accountNo;
    private String type;
    private double balance;
    static int totalNo = 0;

    static void noOfAccountHolder()
    {
        totalNo++;
    }
    Account(String name, long accountNo, String type, double balance)
    {
        this.name = name;
        this.accountNo = accountNo;
        this.type = type;
        this.balance = balance;
        noOfAccountHolder();
    }
    
    Account()
    {
        noOfAccountHolder();
    }

    void setData(String n, long a, String t, double b)
    {
        name = n;
        accountNo = a;
        type = t;
        balance = b;
    }

    void depositAmount(double deposit)
    {
        balance = balance + deposit;
    }

    void withdraw(double x)
    {
        if (x > balance)
            System.out.println("the amount cannot be withdrawn"+'\n'+"INSUFFICIENT BALANCE");
        else
            balance = balance - x;
    }

    void checkBalance()
    {
        System.out.println("name: "+name+'\n'+"balance: "+balance);
    }

    void display()
    {
        System.out.println("name: "+name);
        System.out.println("account number: "+accountNo);
        System.out.println("account type: "+type);
        System.out.println("account balance: Rs"+balance);
    }
}


class program5
{
    static int menu()
    {
        System.out.println('\n'+"1. set account details");
        System.out.println("2. deposit an ammount");
        System.out.println("3. withdraw ammount");
        System.out.println("4. check balance");
        System.out.println("5. check total number of accounts in the bank");
        System.out.println("6. display");
        System.out.println("7. exit");
        System.out.print("enter the choice number: ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        return choice;
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of accounts needed: ");
        int n1=sc.nextInt(),i;
        Account a1[]=new Account[n1];
        for(i=0;i<n1;i++)
            a1[i]=new Account();
        while(true)
        {
            System.out.print('\n'+"enter the account index: ");
            i=sc.nextInt();
            if(i>n1-1)
            {
                System.out.println("invalid index");
                continue;
            }
            switch(menu())
            {
                case 1:
                        String str=sc.nextLine();
                        System.out.println("enter name: ");
                        String n=sc.nextLine();
                        System.out.println("enter account number: ");  
                        long a=sc.nextLong();
                        String h=sc.nextLine();
                        System.out.println("enter account type: ");
                        String t=sc.nextLine();
                        System.out.println("enter balance: ");
                        double b=sc.nextDouble();
                        a1[i].setData(n,a,t,b);
                        break;

                case 2:
                        System.out.println("enter amount to be deposited: ");
                        double deposit=sc.nextDouble();
                        a1[i].depositAmount(deposit);
                        break;

                case 3:
                        System.out.println("enter amount to be withdrawn: ");
                        double x=sc.nextDouble();
                        a1[i].withdraw(x);
                        break;

                case 4:
                        a1[i].checkBalance();
                        break;
                case 5:
                        System.out.println("toatl number of accounts in the bank: "+Account.totalNo);
                        break;
                case 6:
                        a1[i].display();
                        break;
                case 7:
                        System.exit(0);
                default:
                        System.out.println("wrong choice entry\n");

            }
        }
    }
}
