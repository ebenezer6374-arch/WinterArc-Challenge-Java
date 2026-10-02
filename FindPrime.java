public class FindPrime {
    public static void main (String[] args){
        for ( int num= 2; num <=20; num ++){
             boolean isPrime  = true;
            for (int i =2; i*i <= num; i++){
                if(num %i ==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(num + " ");
            }

        }
    }
}