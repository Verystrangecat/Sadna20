public class Q7 {
    public static void main(String[] args) {
        int num1 = 1, num2 = 1;
        System.out.print(num1 + " " + num2+" ");
        while (num1!=34) {
            num1=num1+num2;
            num2=num1+num2;
            if(num1!=34)
                System.out.print(num1 + " " + num2+" ");
            else System.out.print(num1);



        }
    }
}