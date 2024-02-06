import java.util.Scanner;

public class NumberDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            if (i <= rows / 2 + 1) {
                for (int j = i; j <= rows / 2; j++) {
                    System.out.print("\t");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + "\t");
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + "\t");
                }
            } else {
                for (int j = rows / 2 + 1; j < i; j++) {
                    System.out.print("\t");
                }
                for (int j = 1; j <= rows + 1 - i; j++) {
                    System.out.print(j + "\t");
                }
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
        }
    }
}
