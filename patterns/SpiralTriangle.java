import java.util.Scanner;

public class SpiralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                count++;
                for (int j = 1; j <= i; j++) {
                    System.out.print(count + " ");
                    count++;
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(count + " ");
                    count--;
                }
            }
            System.out.println();
            count += i;
        }
    }
}
