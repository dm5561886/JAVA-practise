package computer.data;

public class CPU extends Product {
    public double clockRate;// 時脈 2.4G
    public int coreNumber; // 核心數 4 核心

    public CPU(
            String number,
            String brand,
            String name,
            double clockRate,
            int coreNumber) {
        super(number, brand, name);
        this.clockRate = clockRate;
        this.coreNumber = coreNumber;
    }

    public void render() {
        String description = this.number + "," + this.brand + "," + this.name + "," + this.clockRate + ","
                + this.coreNumber;
        System.out.println(description);
    }
}
