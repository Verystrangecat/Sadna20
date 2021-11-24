public class Q7b {
    public static void main(String[] args) {
        int num1 = 1, num2 = 1, repeats=0;
        System.out.print(num1 + " " + num2 + " ");
        while (num1!=1597){
            num1 = num1 + num2;
            num2 = num1 + num2;
            repeats=repeats+2;}
        num1=1;
        num2=1;
        while ((num1 + num2) < 100) {
            num1 = num1 + num2;
            num2 = num1 + num2;
            if((num1 + num2) < 100)
                System.out.print(num1 + " " + num2 + " ");
            else  System.out.print(num1 + " ");}
        System.out.println("\nNumber of the repeats:"+repeats);
    }
}
