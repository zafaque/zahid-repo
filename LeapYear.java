import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        int year = new Scanner(System.in).nextInt();

        if ((year%4==0 && year%100 != 0) || year%400==0){
            System.out.println("Leap year");
        }else {
            System.out.println("not a leap year");
        }
        int age = 22;
        double weight = 71.23;
        int height = 191;
        boolean married = false;
        boolean attached = false;
        char gender = 'm';

        if (!married && (gender=='m') && (age>= 21 && age <=35) && height>180 && (weight<=70 && weight>=80)){
            System.out.println("adult");
        }else {
            System.out.println("not adult");
        }

    }
}
