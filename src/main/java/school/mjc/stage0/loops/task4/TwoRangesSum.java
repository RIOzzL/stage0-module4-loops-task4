package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            int sum = 0;
            int skip = 0;
            for (int a = 0; a <= lastInRow; a++) {
                if (a <= numberToSkip) {
                    skip += a;
                    continue;
                }
                sum += a;
            }
            System.out.println("skipped sum is "+skip);
            System.out.println("counted sum is "+sum);
        }
    }
}
