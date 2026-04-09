package Pattern;

public class SolidPyramid {
    public static void main(String[] args) {
        int n=6;
        int star=1;
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            star+=2;
            System.out.println();
        }
    }
}
