public class Num extends Element {
    private int num;

    public Num(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Num [num=" + num + "]";
    }

}
