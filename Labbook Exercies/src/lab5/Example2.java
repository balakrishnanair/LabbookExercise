package lab5;
import java.util.Scanner;
import java.util.regex.*;
public class Example2 extends Exception{
    public Example2 (String str) {
        super(str);
    }
    static public void valName(String fullName) throws Example2{


        if(!(Pattern.matches("\\[a-zZ-A]", fullName))) {
            throw new Example2("Full Name Can Not Be Blank");
        }else {
            System.out.println("Full Name Valid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName=sc.next();
        try {
            valName(fullName);
        }catch(Example2 e) {
            System.out.println(e);
        }
    }
}