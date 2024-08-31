package 迴圈;

public class ContinueBreak {
    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++) {
            if (x == 3) {
                continue;
            }
            System.out.println(x);
        }
        int i = 10;
        while (i > 3) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
            i--;
        }
    }

}
