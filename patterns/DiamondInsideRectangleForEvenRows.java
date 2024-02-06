import java.util.Scanner;

public class DiamondInsideRectangleForEvenRows{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbe of rows ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            if (i <= row / 2) {
                for (int j = i; j <= row / 2; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j <= row / 2; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = i; j >row / 2; j--) {
                    System.out.print("*");
                }
                for (int j = i; j <row; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j<row; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j >row / 2; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
