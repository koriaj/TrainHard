public class InsertingAnElement {
    public static void main(String[]args){
        int iElement[]= new int[10];
        iElement[0]=3;
        iElement[1]=9;
        iElement[2]=7;
        iElement[3]=8;
        iElement[4]=12;
        iElement[5]=6;
        int n=6;
        for (int i=0;i<n;i++){
            System.out.print(iElement[i]+",");
            System.out.println("");
            int x=20;
            int index=2;
            /*for (int i=n; i>index;i--){
                iElement[i]=iElement[i-1];
                iElement[index]=x;
                System.out.print(iElement[i]);
            }*/
        }
 }
}
