import java.util.Scanner;

public class Diamond2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        int stars = 1;
        int spaces = rows / 2;
        for (int i = 1; i<= rows; i++) {
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=stars; j++) {
                System.out.print("*");
            }

            if(i<=rows/2){
                stars+=2;
                spaces--;
            }
            else{
                stars-=2;
                spaces++;
            }
            System.out.println();
        }
    }
}
