package oop;

class Test1 {
    static int a = 10;
    static String s = "Hello Class";
}

class Test2 {
    static double a = 3.14;

    public static void main(String[] args) {
        System.out.println(Test1.a);
        System.out.println(Test2.a);
        System.out.println(Test1.s);
        Test1.a++;
        System.out.println(Test1.a);
    }
}