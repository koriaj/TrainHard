public class MaximumElementOfArray {
    public static void main(String[]args){
        int B[]={5,1,6,11,4,9};
        int max=0;
        for (int i = 0; i < B.length; i++) {
            if (B[i]>max){
                max=B[i];
            }

        }
        System.out.println(max);
        /*for (int x:B)
        {
            if (x>max){
                max=x;
            }
        }
        System.out.println(max);*/
    }
}
