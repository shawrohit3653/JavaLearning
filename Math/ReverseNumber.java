package Math;

public class ReverseNumber {
    static void main() {
        int n= 1234;
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        System.out.println(rev);
    }
}
