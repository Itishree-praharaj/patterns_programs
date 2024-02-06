import java.util.Scanner;

public class Prajapati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int spaces = rows - 2;
        int star = 1;
        for (int i = 1; i <= rows; i++) {
            int k = 0;
            for (int j = 1; j <= star; j++) {
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
            if (i <= rows / 2) {
                spaces -= 2;
                star++;
            } else {
                spaces += 2;
                star--;
            }
            System.out.println();
        }
    }
}
