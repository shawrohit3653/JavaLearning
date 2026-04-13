package Math;

public class Prime {
    static void main() {
        int n =5;
        boolean isPrime = true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime =false;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
