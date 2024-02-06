import java.util.Scanner;

public class SymetricHira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter odd number of rows");
        int rows = sc.nextInt();
        int spaces = rows / 2;
        int stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if (i <= rows / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
            System.out.println();
        }
    }
}
