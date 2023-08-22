import java.util.Scanner;

public class fact {

    public static void main(String args[]) {

        Scanner sc =new Scanner(System.in);

        int fact=1;
        int number = sc.nextInt();

        for(int i=number;i>=1;i--) {
            fact=fact*1;
            System.out.println("Factorial is :"+fact);
        }

    }
    
}
