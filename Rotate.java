//package array;

public class Rotate{

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6};
        int no = 2;


        int[] rotate = rotateRight(arr,no);

        for(int fin:rotate) {
            System.out.print(fin+" ");
        }
    }

    public static int[] rotateRight(int[] arr, int k) {
        int n = arr.length; //n=6

        int[] result = new int[n];  //0 0 0 0 0 0

        for (int i = 0; i < n; i++) {
            result[(i+k)%n] = arr[i];       //(0+2)%6=2,  2 index = 1,  => [0,0,1,0,0,0]
        }                                   //(1+2)%6=3,  3 index = 2,  => [0,0,1,2,0,0]
        return result;
    }
}
