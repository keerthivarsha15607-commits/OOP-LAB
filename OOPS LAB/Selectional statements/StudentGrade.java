import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if(marks >= 90 && marks <= 100) {
            System.out.println("Grade: O (Outstanding)");
        }
        else if(marks >= 75) {
            System.out.println("Grade: A");
        }
        else if(marks >= 60) {
            System.out.println("Grade: B");
        }
        else if(marks >= 50) {
            System.out.println("Grade: C");
        }
        else if(marks >= 0) {
            System.out.println("Fail");
        }
        else {
            System.out.println("Invalid Marks");
        }

        sc.close();
    }
}