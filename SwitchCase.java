import java.util.Scanner;

public class SwitchCase {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        /*int num=sc.nextInt();
        switch (num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            default:
                System.out.println("Not in the system");
        }*/
        System.out.println("Enter day name");
        String day=sc.nextLine();
        switch (day){
            case "Monday":
                System.out.println("First day of the week");
                break;
            case "Tuesday":
                System.out.println("Second day of the week");
                break;
            case "Wednesday":
                System.out.println("Third day of the week");
                break;
            case "Thursday":
                System.out.println("Fourth day of the week");
                break;
            case "Friday":
                System.out.println("Fifth day of the week");
                break;
            case "Saturday":
                System.out.println("Sixth day of the week");
                break;
            case "Sunday":
                System.out.println("Seventh day of the week");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }
}
