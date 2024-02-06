public class Swastik {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 11; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((i == 1 && j <= 5) || (j == 9 && i <= 5) || (i == 6) || (j == 5) || (j == 1 && i > 5)
                        || (i == 11 && j > 5)) {
                    System.out.print(count + "\t");
                    count++;
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
