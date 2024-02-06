import java.util.Scanner;

public class PrajapatiForEveryRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int spaces = rows - 2;
        for (int i = 1; i <= rows / 2; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                k++;
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
                k++;
            }
            for (; k < rows; k++) {
                System.out.print("*");
            }
            System.out.println();
            spaces -= 2;
        }
        if (rows % 2 == 0) {
            spaces = 0;
        }
        for (int i = rows / 2 + 1; i <= rows; i++) {
            int k = 0;
            for (int j = i; j <= rows; j++) {
                System.out.print("*");
                k++;
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
                k++;
            }
            for (; k < rows; k++) {
                System.out.print("*");
            }
            System.out.println();
            spaces += 2;
        }
    }
}
