import java.util.Scanner;

public class ten {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i =sc.nextInt();

       //  if(i %2==0) {
       //     System.out.println("a"+n);
      //  }

       // if (i%2==1) {

      //      System.out.println("b"+n);
      //  }

 //       System.out.println(n);


int count =1;
int a,b=0;
 while (n!=0) {
    int rem=n%10;
    if(count %2 ==0){
        a=a*10+rem;
        count++;
    }

    else {
        b=b*10+rem;
        count++;
    }
    n=n/10;
 }

 System.out.println(a+"\n "+b);

        
    }
    
    }
