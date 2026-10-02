public class Second {

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 30, 15};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for  (int num : arr){
            if (num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num ;
                
            }

            if (num < smallest){
                secondSmallest = smallest;
                smallest = num;
            } else if ( num < secondSmallest && num != smallest) {
                secondSmallest = num;

            }
        }

        System.out.println(secondLargest);
        System.out.println(secondSmallest);
        System.out.println(largest);
        System.out.println(smallest);

    }
}