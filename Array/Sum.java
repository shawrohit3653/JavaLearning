package Array;
import java.util.*;

public class Sum {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter five number");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Total is : "+ sum);
    }
}
