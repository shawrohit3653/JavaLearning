package Array;

import java.util.Scanner;

public class Maximum {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter five number");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        System.out.println("Total is : "+ max);
    }
}
