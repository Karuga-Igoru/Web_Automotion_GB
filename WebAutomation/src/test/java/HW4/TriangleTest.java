package HW4;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;


import static org.junit.jupiter.api.Assertions.*;


public class TriangleTest {

    //private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    Triangle triangle1 = new Triangle (5, 6, 7);
    Triangle triangle2 = new Triangle (5, 6, 70);

    @Test
    void isFindingSquareWorks() throws TriangleException {
        assertNotNull(triangle1.findingTriangleSquare());

    }

    @Test
    void isSidesNotNull() {
        boolean side1check = triangle1.getFirstSide() != 0;
        //if (side1check == false) logger.;                 //logging, don't work
        boolean side2check = triangle1.getSecondSide() != 0;
        boolean side3check = triangle1.getThirdSide() != 0;

        assertAll(
                () -> assertTrue( side1check),
                () -> assertTrue(side2check),
                () -> assertTrue(side3check));
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
        assertDoesNotThrow(() -> triangle1.findingTriangleSquare());
    }

    /*@Test                             // uncomment for negative result
    void exceptionCatchNegative(){
        assertDoesNotThrow(() -> triangle2.findingTriangleSquare());
    }*/


}
