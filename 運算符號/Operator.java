public class Operator {
    public static void main(String[] args) {
        // 算術運算
        /*
         * int x = 5 + (3 / 4);
         * System.out.println(x);
         * int y = 5 / 2;
         * System.out.println(y);
         * double z = 5 / 2.0;
         * System.out.println(z);
         * int w = 10 % 6;
         * System.out.println(w);
         */
        // 指定運算
        /*
         * int x = 5;
         * x += 2;
         * x *= 6;
         * System.out.println(x);
         */
        // 比較運算
        /*
         * int x = 6;
         * int y = 8;
         * boolean z = x < y;
         * System.out.println(z);
         */
        // 單元運算
        /*
         * int x = 3;
         * x++;
         * System.out.println(x);
         * x--;
         * System.out.println(x);
         */
        // 邏輯運算
        boolean x = true;
        boolean y = false;
        boolean z = x || y;
        System.out.println(z);
        boolean a = false || false;
        System.out.println(a);
        boolean b = true && true;
        boolean d = a || b;
        System.out.println(d);

    }
}
