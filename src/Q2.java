import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int countA,countB;
        double weight;
        countA=0;
        countB=0;
        while(countA<50 && countB<70)
        {
            System.out.println("enter weight");
            weight= input.nextDouble();
            if(weight>=150 && weight<=250)
                countA=countA+1;
            else
                countB=countB+1;
        }
        if(countA==5)
            System.out.println("The first box is full");
         else
        System.out.println("The second box is full");


    }
}
