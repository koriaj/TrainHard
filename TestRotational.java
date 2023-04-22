public class TestRotational {
    public static void main(String[]args){
        int TA[]={9,6,8};
        System.out.println("Values before rotation to the right");
        for (int x:TA) {
            System.out.print(x);
        }
      int tempV=TA[TA.length-1];
        for (int i=TA.length-1;i>0;i--){
           TA[i]= TA[i-1];
        }
        TA[0]=tempV;
        System.out.println("Values after rotation");
        for (int x:TA) {
            System.out.print(x);
        }
    }
}
