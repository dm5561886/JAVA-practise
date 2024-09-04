package encapsulation;

import encapsulation.math.geometry.*;

public class App {
    public static void main(String[] args) {
        // 程式進入點
        System.out.println(Point.ORIGIN_X);
        Point.renderOrigin();
        // 呼叫建構式產生Point物件實體
        Point p1 = new Point(3, 4);
        System.out.println(p1.getx() + "," + p1.grty());
        p1.render();
        Point p2 = new Point(5, 6);
        p2.render();

    }
}
