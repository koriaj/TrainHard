public class Arrays {
    public static void main(String[]args){
        //Array creation and intialization method1
        int A[]=new int[10];
        //Array creation and intialization method2
        int B[]={1,3,2,5,6,4};
        //Array creation and intialization method3
        int C[];
        C=new int[10];
        //Access
        B[2]=15;//by using reference and subscript
        for (int i=0;i<B.length;i++){
            System.out.println(B[i]);
        }
        for (int x:B)
        {
            System.out.println(x);

        }
        System.out.println("Modify");
        //modify with for each loop user counter control for loop
        for (int i=0;i<B.length;i++){
            System.out.println(B[i]++);
        }

    }
}
