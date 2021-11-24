import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int id, numst1=0, numst2=0, numstn=0;
        boolean ass1, ass2;
        System.out.println("Please enter your id:");
        id= input.nextInt();
        while (id!=0)
        {
            System.out.println("Did you do the first assigment? If you did type 'true', else 'false'");
            ass1=input.nextBoolean();
            System.out.println("Did you do the second assigment? If you did type 'true', else 'false'");
            ass2=input.nextBoolean();
            if (ass1)
                numst1++;
            if (ass2)
                numst2++;
            if(!(ass1)&& !(ass2))
                numstn++;
            System.out.println("Please enter your id:");
            id= input.nextInt();
        }
        System.out.println("The number of students who did the firts assigment "+numst1);
        System.out.println("The number of students who did the second assigment "+numst2);
        System.out.println("The number of students who did nothing "+numstn);

    }
}
