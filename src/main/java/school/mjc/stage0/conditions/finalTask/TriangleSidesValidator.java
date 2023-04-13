package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double max;
        max = firstSide > secondSide ? firstSide : secondSide;
        max = max > thirdSide ? max : thirdSide;

        if ((firstSide + secondSide + thirdSide - max) < max) {
            System.out.println("it's not a triangle");
        }else{
            System.out.println("this is a valid triangle");
        }
    }
}
