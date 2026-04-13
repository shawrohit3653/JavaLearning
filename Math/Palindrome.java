package Math;

public class Palindrome {
    static void main() {
        int n=122;
        System.out.println(isPali(n));
    }
    public static boolean isPali(int n){
        int ori=n;
        int rev=0;
        while(n!=0){
            int rem =n%10;
            rev = rev *10+rem;
            n/=10;
        }
        if(ori==rev){
            return true;
        }
        return false;
    }
}
