package encapsulation.math.geometry;

public class Point {
    // 類別屬性方法 (static)
    // "static"代表類別屬性和方法
    public static int ORIGIN_X = 0;
    public static int ORIGIN_Y = 0;

    public static void renderOrigin() {
        System.out.println(ORIGIN_X + ORIGIN_Y);
    }

    // 物件的屬性、方法、建構式 (non-static)
    // 物件屬性
    // private 不公開
    private int x;
    private int y;

    // 物件建構式
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 物件方法
    public void render() {
        System.out.println(this.x + "," + this.y);
    }

    // 設計物件的getter
    public int getx() {
        return this.x;
    }

    public int grty() {
        return this.y;
    }

}
