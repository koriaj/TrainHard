import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int ngp,rgp,agp;
        System.out.println("Enter the starting term of the AP series");
    agp=sc.nextInt();
        System.out.println("Enter the common ratio of the AP");
    rgp=sc.nextInt();
        System.out.println("Enter the number of AP series");
    ngp=sc.nextInt();
    int term=agp;
        for (int i=0;i<ngp;i++){
        System.out.println(term);
        term=term*rgp;
    }
}}
