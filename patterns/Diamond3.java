import java.util.Scanner;

public class Diamond3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        int stars = 1;
        for(int i=1;i<=rows;i++){
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            stars+=2;
            System.out.println();
        }
        stars=rows*2-1;
        for (int i = 1; i <=rows; i++) {
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            stars-=2;
        }
    }
}
