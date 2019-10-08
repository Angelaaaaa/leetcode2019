package easy;

public class s1175 {
    public static int numPrimeArrangements(int n) {
//        find prime number
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(isPrime(i)==1){
                count++;
            }
        }
//        System.out.println(count);

        long sum = 1;
        for(int i = 1; i <= count;i++){
            sum = (i*sum) % ((int)Math.pow(10,9)+ 7);
//            System.out.println(sum);

        }
        for(int i = 1; i <= n-count;i++){
            sum = (i*sum) % ((int)Math.pow(10,9)+ 7);
        }

        System.out.print(sum);
        return (int)sum;
    }

    public static int isPrime(int n){
        if(n ==1 ){
            return 0;
        }
        for(int i = 2;i < n-1;i++)
        {
            if (n % i == 0){
                return 0;
            }
        }
        return 1;
    }
}
