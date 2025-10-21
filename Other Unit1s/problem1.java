package day4;
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Welcome " + name);

        System.out.print("enter first num: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter second num: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("enter third num: ");
        int num3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("The average is: " + (num1 + num2 + num3) / 3.0);
        scanner.close();
    }
}
