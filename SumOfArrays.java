public class SumOfArrays {
    public static void main(String[]args){
        int arr[]={1,5,5,7};
        int sum=0;
        for (int i=0;i<arr.length;i++){
           // System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
