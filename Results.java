//RESULT JAVA LAB CYCLE 2 PROGRAM !!!!

import java.util.Scanner;

//Student class.
class Student {
    protected int rollNum;

    public void getNumber(int num) {
        this.rollNum = num;
    }

    public void putNumber() {
        System.out.println("Roll No.: " + this.rollNum);
    }
}

//Test class.

class Test extends Student {
    float sub1, sub2;

    public void putMarks() {
        System.out.println("Marks Obtained:");
        System.out.println("  - Subject 1: " + sub1);
        System.out.println("  - Subject 2: " + sub2);
    }
}

//Sports interface.
interface Sports {
    public void getWeightage(float weightage);

    public void putWeightage();
}

//Results
public class Results extends Test implements Sports {
    float total, weightage;

    public void getWeightage(float weightage) {
        this.weightage = weightage;
    }

    public void putWeightage() {
        System.out.println("Sports weightage: " + this.weightage);
    }

    public void display() {
        this.putNumber();
        this.putMarks();
        this.putWeightage();
        total = this.sub1 + this.sub2 + this.weightage;
        System.out.println("Total score: " + this.total + " / 300");
    }

    public void read(Scanner s) {
        int roll_no;
        float wt;
        System.out.print("Enter roll number: ");
        roll_no = s.nextInt();
        getNumber(roll_no);
        System.out.print("Enter marks in 2 subjects: ");
        this.sub1 = s.nextFloat();
        this.sub2 = s.nextFloat();
        System.out.print("Enter sports weightage: ");
        wt = s.nextFloat();
        getWeightage(wt);
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        n = s.nextInt();
        Results students[] = new Results[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Results();
            System.out.println("\nEnter student " + (i + 1) + " details:");
            students[i].read(s);
            System.out.println("\nStudent " + (i + 1) + " details:");
            students[i].display();
        }
        s.close();
    }
}
