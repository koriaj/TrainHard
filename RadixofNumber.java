import java.util.Scanner;

public class RadixofNumber {
    public static void main(String[]args){
        //Find radix of a number given in a string
        //If number is given as a string
        Scanner sc=new Scanner(System.in);
        String num;
        System.out.println("Enter a number");
        num= sc.nextLine();
        if (num.matches("[01]+")){
            System.out.println("Binary");
        }else if(num.matches("[0-7]+"))
        {
                System.out.println("Octal Radix=8");
            } else if (num.matches("[0-9]+")) {
            System.out.println("Decimal Radix=10");

        } else {
            System.out.println("Not a number");
    }

    }
}
