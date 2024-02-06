import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int row=sc.nextInt();
        int stars=1;
        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                if(j==1||j==stars||i==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            stars+=2;
        }
    }
}
