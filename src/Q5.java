import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double gr, sum=0, repeats=0, st=1, avr;
        while (st==1)
        {System.out.println("Enter your grade:");
            gr= input.nextInt();
         if(gr>=50 && gr<=90){
            sum=sum+gr;
                repeats++;}
            System.out.println("Do you want to continue, if yes,type '1' ");
                st= input.nextInt();}
        avr=sum/repeats;
        System.out.println("Your average is: "+avr);



    }
}
