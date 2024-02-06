import java.util.Scanner;

public class Spattern {
    public static void main(String[] args) {
        int spaces = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            System.out.print(i);
            if (i <= 4 / 2) {
                spaces++;
            } else {
                spaces--;
            }
            System.out.println();
        }
        spaces = 0;
        for (int i = 5; i <= 7; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            spaces++;
            System.out.println();
        }
    }
}
