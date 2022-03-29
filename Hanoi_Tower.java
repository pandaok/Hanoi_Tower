public class Hanoi_Tower {
    public static void main(String[] args) {
        Hanoi_Tower test=new Hanoi_Tower();
        test.ta(2,'A','C','B');
    }

    public void show(int i, char m, char n) {
        System.out.println("把" + i + "从" + m + "移至" + n);
    }

    public void ta(int i, char now, char aim, char other) {
        if (i == 2) {
            show(1, now, other);
            show(2, now, aim);
            show(1, other, aim);

        } else {
            ta(i - 1, now, other, aim);
            show(i, now, aim);
            ta(i - 1, other, aim, now);
        }

    }

}
