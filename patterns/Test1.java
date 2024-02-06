public class Test1 {
    public static void main(String[] args) {
        int size = 5; // You can adjust the size of the pattern

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || i == size / 2) {
                    System.out.print(j + 1);
                } else if (j == 0 || j == size - 1) {
                    System.out.print(j + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
