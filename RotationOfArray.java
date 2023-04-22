public class RotationOfArray {
    public static void main(String[]args){
        int AA[]={1,5,7,4,9,1,5,6,3};
        //int temp=AA[0];
        for (int x:AA){
            System.out.print(x+",");
        }
        System.out.println("");
        int temp=AA[0];
        for (int i=1;i<AA.length;i++){
          AA[i-1]=AA[i];

        }
        AA[AA.length-1]=temp;
        for (int x:AA){
            System.out.print(x+",");
        }

        }
    }


