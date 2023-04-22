public class StringDemoExercise {
    public static void main(String[]args){
        String username,domain,gmail;
        String strt="programmer@gmail.com";
        //Find the username of the email above
       int i=strt.indexOf("@");//Find the index of "@"
       username=strt.substring(0,i);
        System.out.println("Username= "+username);
        //Find the domain of the email above
        domain=strt.substring(i+1, strt.length());//Finds the domain
        System.out.println("Domain= "+domain);
        //Find if the email is gmail
        System.out.println(domain.startsWith("gmail"));
        int j=domain.indexOf(".");
        String name=domain.substring(0,j);
        System.out.println(name.equals("gmail"));




    }
}
