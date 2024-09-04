package computer;

import computer.data.CPU;

public class App {
    public static void main(String[] args) {
        CPU c1 = new CPU("P123456", "Bran A", "CPU X", 2.4, 4);
        c1.render();
        CPU c2 = new CPU("P78999", "Bran B", "CPU Y", 3.1, 8);
        c2.render();
    }
}
