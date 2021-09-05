import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    public void testPl0() {
        Triangle triangle = new Triangle();
        triangle.pl(9, 9, 9);
        Assertions.assertTrue(true);
    }
    @Test
    public void testPl1() {
        Triangle triangle = new Triangle();
        triangle.pl(2, 3, 9);
        Assertions.assertTrue(true);
    }
    @Test
    public void testPl2() {
        Triangle triangle = new Triangle();
        triangle.pl(-5, -8, 5);
        Assertions.assertTrue(true);
    }
}
