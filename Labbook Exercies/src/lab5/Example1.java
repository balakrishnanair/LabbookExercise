package lab5;
/*
 * Exercise 1:  Validate the age of a person and display proper 
 * message by using user defined exception. Age of a person should be above 15.
 */
import java.util.*;

public class Example1 extends Exception{
    public Example1(String str) {
        super(str);
    }

    static public void valAge(int age) throws Example1 {
        if (age <= 15) {
            throw new Example1("Age should be above 15");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ag = sc.nextInt();
        try {
            valAge(ag);
        } catch (Example1 e) {
            System.out.println(e);
        }
    }
}