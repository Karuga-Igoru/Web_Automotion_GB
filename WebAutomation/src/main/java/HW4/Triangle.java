package HW4;


public class Triangle {

    private final int firstSide;
    private final int secondSide;
    private final int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public Double findingTriangleSquare() throws TriangleException{
        try {
            if ((firstSide + secondSide < thirdSide) ||
                    (firstSide + thirdSide < secondSide) ||
                    (secondSide + thirdSide < firstSide)) throw new TriangleException();
        } catch (TriangleException e) {
            System.out.println(e.info(firstSide, secondSide, thirdSide));
            return 0.0;
        }
        int p = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }
}