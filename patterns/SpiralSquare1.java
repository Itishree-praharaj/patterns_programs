import java.util.Scanner;

public class SpiralSquare1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print(count + " ");
                    count++;
                }
            } else {
                for (int j = 1; j <= rows; j++) {
                    count--;
                    System.out.print(count + " ");
                }
            }
            System.out.println();
            count += rows;
        }
    }
}
