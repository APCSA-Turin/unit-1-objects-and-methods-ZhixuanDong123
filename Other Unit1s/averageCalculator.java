import java.util.Scanner;
public class averageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter first test score: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("enter second test score: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("enter third test score: ");
        double num3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("enter fourth test score; ");
        double num4 = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();
        double average = (num1 + num2 + num3 + num4) / 4.0;
        System.out.println("The average is: " + average);
        if ((int)(average + 1) < 65) {
            System.out.println("The rounded average is " + (int)(average+1) + " which is failing");
        }
        else {
            System.out.println("The rounded average is " + (int)(average+1) + " which is passing");
        }
    }
}
