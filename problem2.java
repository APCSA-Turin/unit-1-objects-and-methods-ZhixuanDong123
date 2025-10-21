package day4;
import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name1 = input.nextLine();
        System.out.print("Enter your number: ");
        int num1 = input.nextInt();
        input.nextLine();
        System.out.print("Enter name: ");
        String name2 = input.nextLine();
        System.out.print("Enter your number: ");
        int num2 = input.nextInt();
        input.nextLine();
        if (num1>num2){
            System.out.println(name1 + "'s number is bigger");
        }
        else if (num2>num1){
            System.out.println(name2 + "'s number is bigger");
        }
        else {System.out.println("The numbers are equal");
    }

    

    }   
}
