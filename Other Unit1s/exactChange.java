import java.util.Scanner;
public class exactChange {
    public static void main(String[] args) {
        int quarters;
        int dimes;
        int nickels;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a dollar amount");
        int num = (int) (scanner.nextDouble() * 100);
        scanner.close();
        quarters = num / 25;
        num %=25;
        dimes = num / 10;
        num%=10;
        nickels = num / 5;
        num %=5;
        System.out.println("quarters: " + quarters);
        System.out.println("dimes: " + dimes);
        System.out.println("nickels: " + nickels);
        System.out.println("pennies: " + num);
        
    }
}