import java.util.Scanner;

public class Q1 {

    public static void main(String[] args)
    {
        Scanner input= new Scanner (System.in);
        int num,sum, repeats=0;
        System.out.println("enter number");
        num=input.nextInt();
        sum=0;
        while(num>0)
        {
            sum=sum+num%10;
            num=num/10;
            repeats++;
        }
        System.out.println("Sum digits="+sum);
        System.out.println("The number of digits:"+repeats);
    }

}
