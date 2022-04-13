package HW4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TriangleTest {

    Triangle triangle1 = new Triangle (5, 6, 7);
    Triangle triangle2 = new Triangle (5, 6, 70);

    @Test
    void isFindingSquareWorks() throws TriangleException {
        assertNotNull(triangle1.findingTriangleSquare());
    }

    @Test
    void isSidesNotNull() {
        assertAll(
                () -> assertTrue(triangle1.getFirstSide() != 0),
                () -> assertTrue(triangle1.getSecondSide() != 0),
                () -> assertTrue(triangle1.getThirdSide() != 0));
    }

    @Test
    void sidesSummaryTest() {
        assertAll(
                () -> assertTrue(triangle1.getFirstSide() + triangle1.getSecondSide() > triangle1.getThirdSide()),
                () -> assertTrue(triangle1.getFirstSide() + triangle1.getThirdSide() > triangle1.getSecondSide()),
                () -> assertTrue(triangle1.getSecondSide() + triangle1.getThirdSide() > triangle1.getFirstSide()));
    }

    @Test
    void exceptionCatch(){
        assertThrows(TriangleException.class, () -> triangle2.findingTriangleSquare(),
                "Triangle with wrong sides throw it");
    }



}
