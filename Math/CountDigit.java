package Math;

public class CountDigit {
    static void main() {
        int number = 1234576;
        int count=0;
        while(number!=0){
            count++;

            number=number/10;
        }
        System.out.println(count);
    }
}
