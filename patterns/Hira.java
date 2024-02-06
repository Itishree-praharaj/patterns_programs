import java.util.Scanner;

public class Hira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int spaces = rows / 2;
        int star = 1;
        for (int i = 1; i <= rows / 2; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            spaces--;
            star += 2;
            System.out.println();
        }
        if (rows % 2 == 0) {
            spaces = 1;
            star = rows - 1;
        }
        for (int i = rows / 2 + 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            spaces++;
            star -= 2;
            System.out.println();
        }
    }
}
