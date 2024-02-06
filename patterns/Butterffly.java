import java.util.Scanner;

public class Butterffly{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int rows = sc.nextInt();
        int spaces=rows-1;
        int stars=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            if(i<=rows/2){
                spaces-=2;
                stars++;

            }
            else{
                spaces+=2;
                stars--;
            }
            System.out.println();
        }
    }
}