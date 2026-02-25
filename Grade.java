package Assignment;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        char grade;
        if (marks >= 95)
            grade = 'A';
        else if (marks >= 85)
            grade = 'B';
        else if (marks >= 75)
            grade = 'C';
        else if (marks >= 65)
            grade = 'D';
        else if (marks >= 50)
            grade = 'E';
        else
            grade = 'F';
        switch (grade) {
            case 'A':
                System.out.println("Grade A - Excellent");
                break;
            case 'B':
                System.out.println("Grade B - Very Good");
                break;
            case 'C':
                System.out.println("Grade C - Good");
                break;
            case 'D':
                System.out.println("Grade D - Average");
                break;
            case 'E':
                System.out.println("Grade E - Below Average");
                break;
            default:
                System.out.println("Grade F - Fail");
        }
    }
}


