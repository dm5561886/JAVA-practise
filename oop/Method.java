package oop;

class Try {
    public static void main(String[] args) {
        // 程式進入點
        Try.talk("Hello");
        Try.math1(3, 4);
        Try.math2(5, 8);
        Try2.math1(9, 9);
        Try2.math2(9, 9);
    }

    // 定義更多自己的類別方法
    static void talk(String content) {
        System.out.println(content);
    }

    static void math1(int n1, int n2) {
        int result = n1 + n2;
        System.out.println(result);
    }

    static void math2(int x1, int x2) {
        System.out.println(x1 * x2);
    }
}

class Try2 {
    static void math1(int x1, int x2) {
        System.out.println(x1 + x2);
    }

    static void math2(int x1, int x2) {
        System.out.println(x1 * x2);
    }
}