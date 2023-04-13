package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int res = 0;
        if (divider != 0) {
            if (dividend / divider == divider) {
                res = dividend / divider;
                System.out.println("can be divided completely");
            }else{
                System.out.println("cannot be divided completely");
            }
        } else {
            System.out.println("division by zero");
        }
    }
}
