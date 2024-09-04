package inheritance;

import inheritance.trytest.Class1;
import inheritance.trytest.Class2;

public class App {
    public static void main(String[] args) {
        Class1 obj1 = new Class1();
        Class2 obj2 = new Class2();
        obj1.render();
        System.out.println(obj2.x);
        obj2.render();
    }
}
