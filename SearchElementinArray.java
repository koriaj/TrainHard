import java.util.Scanner;

public class SearchElementinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {1,2, 5, 5, 7};
        System.out.println("Enter a Key");
        int key=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
           if (key==arr[i]){
               System.out.println("Element is found at: "+i);
               System.exit(0);
           }

        }
        System.out.println("Not Found");

    }
}
