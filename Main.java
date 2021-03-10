//LAB CYCLE 2 BANK PROGRAM !!!

import java.util.ArrayList;
import java.util.Scanner;

abstract class Bank{
    String bankType;
    boolean offerCreditCard;
    int term;
    double rateOfInterest, balance;
    
    Bank(String bankType){
        this.balance=0.0;
        this.term=0;
        this.rateOfInterest=0;
        this.bankType=bankType;
    }

    boolean isInternational(){
        if(bankType.equalsIgnoreCase("international"))
            return true;
        return false;
    }

    void setCreditCardOffer(){
        if(isInternational()) offerCreditCard=true;
        else offerCreditCard=false;
    }

    abstract void getRateOfInterest();

    void depositAmount(double amount,int term){
        this.balance+=amount;
        this.term=term;
        getRateOfInterest();
    }
}

class SBI extends Bank{
    SBI(String bankType){
        super(bankType);
        setCreditCardOffer();
    }

    void getRateOfInterest(){
        if(term>=3){
            if(isInternational()) rateOfInterest=0.08;
            else rateOfInterest=0.07;
        }
    }
}

class PNB extends Bank{
    PNB(String bankType){
        super(bankType);
        setCreditCardOffer();
    }

    void getRateOfInterest(){
        if(term>=3){
            if(isInternational()) rateOfInterest=0.08;
            else rateOfInterest=0.07;
        }
    }
}

class KTK extends Bank{
    KTK(String bankType){
        super(bankType);
        setCreditCardOffer();
    }

    void getRateOfInterest(){
        if(term>=3){
            if(isInternational()) rateOfInterest=0.08;
            else rateOfInterest=0.07;
        }
    }
}

class CORP extends Bank{
    CORP(String bankType){
        super(bankType);
        setCreditCardOffer();
    }

    void getRateOfInterest(){
        if(term>=3){
            if(isInternational()) rateOfInterest=0.08;
            else rateOfInterest=0.07;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank;
        ArrayList<Bank> banks = new ArrayList<>();
        int choice;

        do{
            System.out.println("\n0.Exit\n1.SBI\n2.PNB\n3.KTK\n4.CORP\nSelect bank:");
            choice=sc.nextInt();

            if(choice==0) break;

            System.out.println("Enter the bank type: International or National?");
            String bankType=sc.next();

            System.out.println("Enter the amount you want to deposit?");
            double amount=sc.nextDouble();

            System.out.println("Enter the term?");
            int term=sc.nextInt();

            switch(choice){
                case 1: bank = new SBI(bankType);
                        bank.depositAmount(amount,term);
                        banks.add(bank);
                        break;
                case 2: bank = new PNB(bankType);
                        bank.depositAmount(amount,term);
                        banks.add(bank);
                        break;
                case 3: bank = new KTK(bankType);
                        bank.depositAmount(amount,term);
                        banks.add(bank);
                        break;
                case 4: bank = new CORP(bankType);
                        bank.depositAmount(amount,term);
                        banks.add(bank);
                        break;
                default: System.out.println("Enter proper choice");
            }
        }while(choice!=0);

        System.out.println("\nBank details:");
        for(Bank b : banks){
            System.out.println("---------------------");
            System.out.println("Bank name: "+b);
            System.out.println("Type: "+b.bankType);
            System.out.println("Balance: "+b.balance);
            System.out.println("ROI: "+b.rateOfInterest);
            System.out.println("Term: "+b.term);
        }

    }
}