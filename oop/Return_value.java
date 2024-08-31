package oop;

public class Return_value {
    class T1 {
        static int add(int n1, int n2) {
            return n1 + n2;
        }

        static void hello(String msg) {
            System.out.println(msg);
            return;
        }

    }

    public static void main(String[] args) {
        // 主程式
        int result = T1.add(3, 4);
        System.out.println(result);
        T1.hello("你好");
    }

}
