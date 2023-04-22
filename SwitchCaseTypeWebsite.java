import java.util.Scanner;

public class SwitchCaseTypeWebsite {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter website url");
        String weburl=sc.nextLine();
        String typeOfWeb=weburl.substring(weburl.lastIndexOf(".")+1);
        System.out.println(typeOfWeb);
        switch (typeOfWeb){
            case "com":
                System.out.println("Commercial Website");
                break;
            case "org":
                System.out.println("Organozation Website");
                break;
            case "net":
                System.out.println("Network Website");
                break;
            case "gov":
                System.out.println("Governemnt Website");
                break;
            default:
                System.out.println("Not a website");
        }
    }
}
