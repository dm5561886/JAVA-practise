public class DataTypeConcersion {
    public static void main(String[] args) {
        // 數字型態間轉換
        // 數字型態範圍大小排序:double > float > long > int > short > byte
        // 小範圍轉換到大範圍
        // byte x = 3;
        // int y = x;
        // System.out.println(y);
        // long z = y;
        // System.out.println(z);
        // double a = z;
        // System.out.println(a);
        // 大範圍轉小範圍:需要使用(資料型態) 做強制轉換
        // int x = 1024;
        // byte y=x; 錯誤:試圖把 int 轉換成 byte
        // 強制轉換
        // byte y = (byte) x;
        // System.out.println(y);
        // 字串轉換成數字
        /*
         * String text = "34";
         * int x = Integer.parseInt(text);
         * System.out.println(x);
         * text = "3.14159";
         * double a = Double.parseDouble(text);
         * System.out.println(a);
         */
        // 數字轉換成字串
        int x = 34;
        String s = String.valueOf(x);
        System.out.println(s);
        long y = 99999;
        s = String.valueOf(y);
        System.out.println(s);
        s = String.valueOf(3.14159F);
        System.out.println(s);

    }

}