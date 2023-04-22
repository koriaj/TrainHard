public class SecondLargestElementInArray {
    public static void main(String[]args){
        int B[]={5,1,6,11,4,9};
        int max1,max2;
        max1=max2=B[0];
        for (int i = 0; i < B.length; i++) {
            if (B[i]>max1){
                max2=max1;
                max1=B[i];

            } else if (B[i]>max2) {
                max2=B[i];
            }


        }
       System.out.println("Second largest is: "+max2);

    }
}
