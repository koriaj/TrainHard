public class RegularExpression {
    public static void main(String[]args){
        //Find if a number is Binary or not
        int b=10110001;
        //String strb=b+"";//convert to string
        String strb= String.valueOf(b);//convert to string
        System.out.println(strb.matches("[01]*"));
        System.out.println(strb.matches("[01]+"));
        //Find is a number is Hexa-Decimal or not=[0-9A-F]
        String strh="B234A";
        System.out.println(strh.matches("[0-9A-F]*"));
        //Find is the data in Date format(dd/mm/yyyy)
        String d="01/12/2000";
        System.out.println(d.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
        //Remove Special characters from a string
        String strsp="ac!h22   WEfdj#k   kk%";
        System.out.println(strsp.replaceAll("[^a-zA-Z-9]",""));
        //Remove extra spaces from string
        System.out.println(strsp.replaceAll("\\s",""));
        //Find number of words in a String
       String words[]=strsp.split("\\s");
        System.out.println(words.length);
        }
}
