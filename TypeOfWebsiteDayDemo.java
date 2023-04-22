import java.util.Scanner;

public class TypeOfWebsiteDayDemo {
    public static void main(String[]args){
        //Display name of a day based on number
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter no of a day");
        int d;
        d=sc.nextInt();
        if (d==1){
            System.out.println("The day is Monday");
        } else if (d==2) {
            System.out.println("The day is Tuesday");

        }
        else if (d==3) {
            System.out.println("The day is Wednesay");

        }
        else if (d==4) {
            System.out.println("The day is Thursday");

        }
        else if (d==5) {
            System.out.println("The day is Friday");

        }
        else if (d==6) {
            System.out.println("The day is Saturday");

        }else if(d==7) {
            System.out.println("The day is Sunday");
        } else{
            System.out.println("Invalid entry");
        }*/
        //Find the type of website and protocol used
        //http://www.google.com
        System.out.println("Enter the url of website");
        String url=sc.nextLine();
        int fcolon=url.indexOf(":");
        String protocol=url.substring(0,fcolon);
        System.out.println(protocol);
        int dot=url.lastIndexOf(".");
        String typeWeb=url.substring(dot+1,url.length());
        System.out.println(typeWeb);
        if (typeWeb.equals("com")){
            System.out.println("Commercial website");
        } else if (typeWeb.equals("org")) {
            System.out.println("Organization website");
        }
        else {
        System.out.println("Not a website");
    }
}}
