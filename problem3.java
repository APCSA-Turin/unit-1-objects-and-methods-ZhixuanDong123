package day4;
import java.util.Scanner;
public class problem3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        int newnum = 0;
        while (num != 0) {
            int digit = num % 10;
            newnum = newnum * 10 + digit;
            num /= 10;
        } 
    }
}
    