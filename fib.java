import java.util.Scanner;

public class fib {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int last =0;
        int secondlast =1;
        int result =0;

        for(int i=3;i<=n;i++) {
            result = last + secondlast;
            secondlast =last;
            last =result;
        }
        System.out.println(result);
    }
    
}
