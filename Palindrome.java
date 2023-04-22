import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int rev=0,r;
        while (n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
            //System.out.println(rev);
        }
        if (m==rev){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palidrome");
        }
    }
}
