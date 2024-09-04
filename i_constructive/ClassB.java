package i_constructive;

//子類別
public class ClassB extends ClassA {
    public int number;

    public ClassB(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void render() {
        System.out.println(this.text + " " + this.number);
    }

}
