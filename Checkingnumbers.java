package Assignment;
import java.util.Scanner;
public class Checkingnumbers {
    static void main() {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("The Entered Number is Zero");
        }
        else if(num<0){
            System.out.println("The Entered Number is Negative");
        }
        else {
            System.out.println("The Entered NUmber is Positive");
        }
    }
}
