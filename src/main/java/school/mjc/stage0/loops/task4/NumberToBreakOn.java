package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith > numberToGoUntil) {
            System.out.print("iterating till the end");
        } else if (numberToGoUntil < 0) {
            System.out.println("last number in row is negative");
        } else {
            for (int i = 0; i < numberToGoUntil; i++) {
                if (i == 0) {
                    continue;
                } else if (i > toBreakWith) {
                    break;
                }
                System.out.println(i);
            }
        }
    }
}
