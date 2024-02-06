import java.util.Scanner;

public class DiamondForAnyInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int stars = 1;
        int spaces;
        for (int i = 1; i <= rows / 2; i++) {
            for (int j = i; j <= rows / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
            }
            System.out.println();
            stars += 2;
        }
        spaces = 0;
        if (rows % 2 == 0) {
            stars = (rows - (rows / 2)) * 2 - 1;
            spaces = 1;
        } else
            stars = rows;
        for (int i = (rows - (rows / 2)); i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
            }
            spaces++;
            stars -= 2;
            System.out.println();
        }
    }
}