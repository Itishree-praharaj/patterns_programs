import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int count = 1, count2 = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\t");
            }
            for (int j = i; j <= rows; j++) {
                System.out.print(count + "\t");
                count++;
            }
            count2 = 32 - count;
            for (int j = i; j <= rows; j++) {
                System.out.print(count2 + "\t");
                count2--;
            }
            System.out.println();
        }

    }
}
