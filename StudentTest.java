package BantilanJhonwill;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter test case number: ");
        int testCase = scanner.nextInt();

        switch (testCase) {
            case 1:
                
                Student pupil1 = new Student("Jemar Jude", "Maranga", 17);
                System.out.println("Case 1: Student below 18");
                System.out.println(pupil1.toString());
                break;

            case 2:
                
                Student pupil2 = new Student("Jemar Jude", "Maranga", 17);
                System.out.println("Case 2: Increment age of pupil1");
                System.out.println(pupil2.toString());
                break;

            case 3:
                
                Student pupil3 = new Student("Jose", "Cruz", 19);
                System.out.println("Case 3: Student 18 or older");
                System.out.println(pupil3.toString());
                break;

            default:
                System.out.println("Invalid test case number.");
        }
    }
}