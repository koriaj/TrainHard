import java.util.Scanner;

public class MenuDrivenArithmethicOperation {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int numb1=sc.nextInt();
        int numb2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operation");
        String mathOp=sc.nextLine();
            switch (mathOp){
                case "ADD":
                    System.out.println("Arithmetric operation is Add and the result is: "+numb1+numb2);
                    break;
                case "DIVISION":
                    System.out.println("Arithmetric operation is Division and the result is: "+numb2/numb1);
                    break;
                case "Multiply":
                    System.out.println("Arithmetric operation is Multiply and the result is: "+numb1*numb2);
                    break;

            }
        }
    }

