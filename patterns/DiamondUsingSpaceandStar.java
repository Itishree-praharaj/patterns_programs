import java.util.Scanner;

public class DiamondUsingSpaceandStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int r = sc.nextInt();
        int spaces = r - 1;
        int stars = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            if (i <= r / 2) {
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
