
import java.util.Scanner;

public class Trident {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for (int j = 1; j <=r; j++) {
                if(j==1&&i<=r/2||j==r/2+1||j==r&&i<=r/2||i==r/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
