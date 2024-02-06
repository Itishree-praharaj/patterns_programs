import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            if(i<=r/2){
                for(int j=1;j<=r;j++){
                    if(i+j==r-1||j-i==r/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            else{
                for (int j = 1; j <=r; j++) {
                    if(i-j==r/2||i+j==r+(r/2)+1){
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
}
