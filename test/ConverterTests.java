import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import quaternarycalculator.bsu.edu.backend.Converter;

public class ConverterTests {
    @Test
    public void testConvertToQuaternary1() {
        int decimalNumber = 1;
        Converter converter = new Converter();
        String quaternaryNumber = converter.convertToQuaternary(decimalNumber);
        Assertions.assertEquals("1", quaternaryNumber);
    }

    @Test
    public void testConvertToQuaternary2() {
        int decimalNumber = 4;
        Converter converter = new Converter();
        String quaternaryNumber = converter.convertToQuaternary(decimalNumber);
        Assertions.assertEquals("10", quaternaryNumber);
    }
}
