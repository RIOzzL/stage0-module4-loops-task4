package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int a = 0;
        while (a <= lastPrinted) {
            if (a % 3 == 0) {
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }
    }
}
