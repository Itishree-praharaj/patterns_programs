import java.util.Scanner;

public class DiamondInsideRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        int stars=rows/2;
        for(int i=1;i<=rows;i++){
            if(i<=rows/2){
                for(int j=1;j<=stars;j++){
                    System.out.print("*");
                }
                for(int j=1;j<i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=stars;j++){
                    System.out.print("*");
                }
                stars--;
            }
            else{
                for(int j=1;j<=stars+1;j++){
                    System.out.print("*");
                }
                for(int j=i;j<rows;j++){
                    System.out.print(" ");
                }
                for(int j=i;j<rows;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=stars+1;j++){
                    System.out.print("*");
                }
                stars++;
            }      
            System.out.println();
        }
    }
}
