import java.util.Scanner;

public class ArithmetricProgression {
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n,d,a;
        System.out.println("Enter the starting term of the AP series");
        a=sc.nextInt();
        System.out.println("Enter the common difference of the AP");
        d=sc.nextInt();
        System.out.println("Enter the number of AP series");
        n=sc.nextInt();
        int term=a;
        for (int i=0;i<n;i++){
            System.out.println(term);
            term=term+d;
        }

        }


    }

