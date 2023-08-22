import java.util.Scanner;

public class eval { 
    public static void main(String[] args) {

        

        Scanner sc=new Scanner(System.in);

        int i =sc.nextInt();

        if(i %3==0){

            System.out.println("Divded by 3");
        }




        else if(i%3==0 && i%5==0){
            System.out.println("divided by 3 and 5");

        }

        else if(i %5==0){

            System.out.println("Divded by 5");
        }

        else {
            System.out.println("Not Divisible");
        }

    }
    
}
