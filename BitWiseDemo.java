public class BitWiseDemo {
    public static void main(String[]args){
        int x1=10,x2=9,y1;
        System.out.println(x1&x2);
        System.out.println(x1^x2);
        System.out.println(y1=x1>>1);
       // Swapping
        int a1=6, b1=9;
        System.out.println("a1= "+a1+", "+"b1= "+b1);
        a1=a1^b1;
        b1=a1^b1;
        a1=a1^b1;
        System.out.println("a1= "+a1+", "+"b1= "+b1);
    }
}
