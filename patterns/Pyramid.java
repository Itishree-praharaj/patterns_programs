import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows =sc.nextInt();
        int stars=1;
        for(int i=1;i<=rows;i++){
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            stars+=2;
        }
    }
}
