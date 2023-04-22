import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        int m=n;
        int sum=0;
        while (n>0){
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;

        }
        System.out.println(sum);
        System.out.println("");
        if (sum==m){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not an Armstrong");
        }
    }
}
