import java.util.Scanner;

public class addition {

    public static void main(String[] args0) {

        Scanner sc =new Scanner(System.in);

        int sum=0;
        while(true) {
            int a=sc.nextInt();
            if(a==-1) {
                break;
            }
            sum=sum+a;
        }
        System.out.println(sum);

    }
    
}
