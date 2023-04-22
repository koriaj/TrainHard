public class StringObjects {
    public static void main(String[]args){
        String str1="Java coding";
        System.out.println(str1);
        String str2 =new String("JAVA CODING");
        System.out.println(str2);
        char c[]={'J','a','V','a',' ','C','o','D','e'};
        String str3=new String(c,1,3);
        System.out.println(str3);
        byte b[]={65,66,67,68};
        String str4=new String(b,1,2);
        System.out.println(b);
        //comparing objects
        String ss="Java";
        String ss1="Java";
        System.out.println(ss==ss1);
        String sss="Java";
        String sss1=new String("Java");
        System.out.println(sss==sss1);
    }
}
