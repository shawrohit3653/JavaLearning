package Math;

public class SumOfAllDigit {
    static void main() {
        int n =1234;
        int sum = 0;
        while(n!=0){
            int rem=n%10;
            sum +=rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
