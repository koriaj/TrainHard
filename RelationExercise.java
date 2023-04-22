import java.util.Scanner;

public class RelationExercise {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        //Check a number is odd or even
        if (a%2==0){
            System.out.println("It is an even");
        }else {
            System.out.println("It is an odd");
        }
        //Find person is young or not
        System.out.println("Enter age");
        int age=sc.nextInt();
        if (age>=14&&a<=55){
            System.out.println("Young");
        }else {
            if (age<14||age>55){
                System.out.println("Not young");
            }
        }
        //Find grade for given marks
        int total,m1,m2,m3;
        double avg;
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        total=m1+m2+m3;
        System.out.println( "Total is "+total);
        avg=total/3;
        System.out.println("Average is "+avg);
        if (avg>100){
            System.out.println("Invalid Score");
        } else if
        (avg>=70&& avg<=100) {
            System.out.println("Grade is an A");
        }

    }
}
