package Array;

import java.util.Scanner;

public class Multiply {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter five number");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int mul=1;
        for(int i=0;i<arr.length;i++){
            mul*=arr[i];
        }
        System.out.println("Total is : "+ mul);
    }
}
