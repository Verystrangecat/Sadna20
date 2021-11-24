import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;
        double num2 = 0, repeats = 1;
        System.out.println("Please enter 2 the number (only this time)");
        num = input.nextDouble();
        num2 = input.nextDouble();
        while (num < num2) {
            repeats++;
            System.out.println("Please enter a number");
            num = num2;
            num2 = input.nextDouble();

        }
        System.out.println("The number of normal numbers "+repeats);
    }
}