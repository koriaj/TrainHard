public class WideningNarrowingDemo {
    public static void main(String[]args){
        byte bb=10;
        short ss=20;
        int i=10;
        long l=10;
        float f=10;
        double d=10;
        char c=10;
        //Widening
        System.out.println(bb);
       ss=bb;
        //Narrowing
        bb=(byte)ss;
        System.out.println(ss);
    }
}
