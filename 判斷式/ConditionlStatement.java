package 判斷式;

import java.util.Scanner;

public class ConditionlStatement {
    public static void main(String[] args) {
        /*
         * // 標準輸入
         * Scanner s = new Scanner(System.in);
         * System.out.println("請輸入任意整數:");
         * // 取得輸入的整數
         * int x = s.nextInt();
         * System.out.println(x);
         */
        // 取得輸入的任意文字
        /*
         * Scanner a = new Scanner(System.in);
         * System.out.println("請輸入任意文字:");
         * String text = a.nextLine().trim();
         */

        // 判斷式 if...else if..else
        /*
         * if (x == 3) {
         * System.out.println("輸出3");
         * } else if (x == 4) {
         * System.out.println("輸出4");
         * } else {
         * System.out.println("輸出" + x);
         * }
         */
        // 判斷式 switch
        String y = "測試2";
        switch (y) {
            case "測試1":
                System.out.println("成功1");
                break;
            case "測試2":
                System.out.println("成功2");
                break;
            default:
                System.out.println("失敗");
                break;
        }
    }

}
