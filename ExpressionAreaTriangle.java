import java.util.Scanner;

public class ExpressionAreaTriangle {
    public static void main(String[]args){
        float base,height,area;
        System.out.println("Enter base and height");
        Scanner sc=new Scanner(System.in);
        base=sc.nextFloat();
        height=sc.nextFloat();
        area=base*height;
        System.out.println(area);
        //Area of a triangle with three sides S=1/2(a+b+c), Area=Sqrt[s(s-a)(s-b)(s-c)]
        int base1, base2,base3;
        float s;
        double area1;
        base1=sc.nextInt();
        base2= sc.nextInt();
        base3=sc.nextInt();
        s=(float) (base1+base2+base3)/2;
        System.out.println(s);
       area1=Math.sqrt(s*(s-base1)*(s-base2)*(s-base3));
    }
}
