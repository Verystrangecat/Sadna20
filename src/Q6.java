import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num, st = 1;
        double num1=0;
        while (st == 1) {
            System.out.println("Please enter the number:");
            num = input.nextDouble();
            if ((num%1)==0)
                num=(int) num;
            else num=num;
            if (num<0)
                num=num*(-1);
            System.out.println(num);
            System.out.println("Do you want to continue, if yes,type '1' ");
            st= input.nextInt();}
        System.out.println("End");
        }
    }
