package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public static void printWhichIsBigger(int first, int second) {
        System.out.println(first > second ? "first": "second");
    }

    public static void main(String[] args) {
        printWhichIsBigger(1, 2);
    }
}
