public class RotationOfArrayRight {
    public static void main(String[]args){
        int arr[]={1,2,3};
       // int n=1;
        for (int x:arr){
            System.out.print(x+",");
        }
        System.out.println("");
        int last=arr[arr.length-1];
        for (int j=arr.length-1;j>0;j--){
            arr[j]=arr[j-1];

        }
        arr[0]=last;
        for (int t:arr){
            System.out.print(t+",");
        }

    }
}
