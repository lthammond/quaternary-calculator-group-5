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

    @Test
    public void testConvertToQuaternary3() {
        int decimalNumber = 1234;
        Converter converter = new Converter();
        String quaternaryNumber = converter.convertToQuaternary(decimalNumber);
        Assertions.assertEquals("103102", quaternaryNumber);
    }

    @Test
    public void testConvertToQuaternary4() {
        int decimalNumber = 0;
        Converter converter = new Converter();
        String quaternaryNumber = converter.convertToQuaternary(decimalNumber);
        Assertions.assertEquals("0", quaternaryNumber);
    }

    @Test
    public void testConvertToDecimal1() {
        String quaternaryNumber = "0";
        Converter converter = new Converter();
        int decimalNumber = converter.convertToDecimal(quaternaryNumber);
        Assertions.assertEquals(0, decimalNumber);
    }

    @Test
    public void testConvertToDecimal2() {
        String quaternaryNumber = "1";
        Converter converter = new Converter();
        int decimalNumber = converter.convertToDecimal(quaternaryNumber);
        Assertions.assertEquals(1, decimalNumber);
    }

    @Test
    public void testConvertToDecimal3() {
        String quaternaryNumber = "22";
        Converter converter = new Converter();
        int decimalNumber = converter.convertToDecimal(quaternaryNumber);
        Assertions.assertEquals(10, decimalNumber);
    }

    @Test
    public void testConvertToDecimal4() {
        String quaternaryNumber = "110321";
        Converter converter = new Converter();
        int decimalNumber = converter.convertToDecimal(quaternaryNumber);
        Assertions.assertEquals(1337, decimalNumber);
    }
}