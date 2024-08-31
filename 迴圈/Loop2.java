package 迴圈;

public class Loop2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d*%d=%-3d", i, j, i * j);
                if (j == 9) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }

        }
    }
}
