public class Relational {
    public static void main(String[]args){
        int a=25,b=10,c=15;
        System.out.println(a<b);
        System.out.println(a<b && a>c);
        System.out.println(a<b || a>c);
        //Conditional statement
        int n=5;
        if (n>0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
        //Greater
        if (a>b&&a>c){
            System.out.println(a+ " is greater");
        } else if (b>c) {
            System.out.println(b+" is greater");
        }else {
            System.out.println(c+" is greater");
        }

    }
}
