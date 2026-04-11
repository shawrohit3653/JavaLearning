package Pattern;

public class SquareWithSpace {
     public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
                for (int col = 1; col <= 7; col++) {
                    //star
                    if(row==1 || row == n || col==1 || col ==7) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
        }
    }
}
