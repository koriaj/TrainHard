import java.util.Locale;

public class StringMethods {
    public static void main(String[]args){
        String stringMethods= " Welcome  ";
        //length method
        int l=stringMethods.length();
        System.out.println(l);
        //trim method
        String tr=stringMethods.trim();
        System.out.println(tr);
        //toLowerCase Method
        String tLC=stringMethods.toLowerCase();
        System.out.println(tLC);
        //toUpperCase
        String tUC=stringMethods.toUpperCase();
        System.out.println(tUC);
        //Substring
        String sb=stringMethods.substring(3);
        String sb1=stringMethods.substring(3,7);
        System.out.println(sb);
        System.out.println(sb1);
        //replace
        String r=stringMethods.replace('e','k');
        System.out.println("Before= "+stringMethods+" After= "+r);
        //
        String str11="Mr. Shahruk Khan";
       System.out.println(str11.startsWith("Mr"));
       System.out.println(str11.startsWith("Shah",4));
        System.out.println(str11.charAt(5));
        for (int i=0;i<str11.length();i++){
            System.out.print(str11.charAt(i));
        }
        System.out.println("");
        String web="www.udemy.co.ke";
        System.out.println(web.indexOf("."));
        System.out.println(web.indexOf(".",4));
        System.out.println(web.lastIndexOf("."));
        System.out.println(web.lastIndexOf(".",10));

        String st1="Pyramid";
        String st2="pyramid";
        String st3="Pyramid";
        String st4=new String("Pyramid");
        System.out.println(st1.equals(st2));
        System.out.println(st1.equalsIgnoreCase(st2));
        System.out.println(st1==st2);
        System.out.println(st1==st3);
        //checks the content
        System.out.println(st1.equals(st4));
        //checks the references
        System.out.println(st1==st4);
        //compare
        System.out.println(st1.compareTo(st2));
        System.out.println(st1.compareTo(st3));
        System.out.println(st1.compareTo(st4));
        System.out.println(st1.compareToIgnoreCase(st2));
        //contains
        System.out.println(st1.contains("id"));
        System.out.println(st1.concat(st2));
        //Regular Expression
        String rexp= "f";//true
        String rexp1="abc";//false
        String rexp2="abc";
        System.out.println(rexp.matches("."));// Any character
        System.out.println(rexp1.matches("."));// Any character
        System.out.println(rexp2.matches("[abc]"));

    }
}
