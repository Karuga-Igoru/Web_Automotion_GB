package HW4;

import java.text.DecimalFormat;

public class HW4Main {

    public static void main (String[] args) throws TriangleException {

        Triangle triangle1 = new Triangle (5, 6, 7);
        Triangle triangle2 = new Triangle (5, 6, 70);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(triangle1.findingTriangleSquare());

        System.out.println("Square of triangle with sides: " +
                triangle1.getFirstSide() + ", "
                 + triangle1.getSecondSide()  + ", "
                 + triangle1.getThirdSide() + ": "
                 + result);

        String result1 = decimalFormat.format(triangle2.findingTriangleSquare());

        System.out.println("Square of triangle with sides: " +
                triangle2.getFirstSide() + ", "
                + triangle2.getSecondSide()  + ", "
                + triangle2.getThirdSide() + ": "
                + result1);
    }
}
