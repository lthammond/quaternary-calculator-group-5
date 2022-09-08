import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import quaternarycalculator.bsu.edu.backend.Operator;

public class OperatorTests {
    @Test
    public void addTest1() {
        String addend1 = "1";
        String addend2 = "3";
        Operator operator = new Operator();
        String sum = operator.doOperation("+", addend1, addend2);
        Assertions.assertEquals("10", sum);
    }

    @Test
    public void addTest2() {
        String addend1 = "0";
        String addend2 = "8";
        Operator operator = new Operator();
        String sum = operator.doOperation("+", addend1, addend2);
        Assertions.assertEquals("20", sum);
    }

    @Test
    public void addTest3() {
        String addend1 = "31320";
        String addend2 = "103300";
        Operator operator = new Operator();
        String sum = operator.doOperation("+", addend1, addend2);
        Assertions.assertEquals("201220", sum);
    }

    @Test
    public void addTest4() {
        String addend1 = "-10";
        String addend2 = "11";
        Operator operator = new Operator();
        String sum = operator.doOperation("+", addend1, addend2);
        Assertions.assertEquals("1", sum);
    }

    @Test
    public void subtractTest1() {
        String minuend = "11";
        String subtrahend = "2";
        Operator operator = new Operator();
        String diff = operator.doOperation("-", minuend, subtrahend);
        Assertions.assertEquals("3", diff);
    }

    @Test
    public void subtractTest2() {
        String minuend = "22";
        String subtrahend = "22";
        Operator operator = new Operator();
        String diff = operator.doOperation("-", minuend, subtrahend);
        Assertions.assertEquals("0", diff);
    }

    @Test
    public void subtractTest3() {
        String minuend = "1";
        String subtrahend = "11";
        Operator operator = new Operator();
        String diff = operator.doOperation("-", minuend, subtrahend);
        Assertions.assertEquals("-10", diff);
    }

    @Test
    public void subtractTest4() {
        String minuend = "1";
        String subtrahend = "-11";
        Operator operator = new Operator();
        String diff = operator.doOperation("-", minuend, subtrahend);
        Assertions.assertEquals("12", diff);
    }

    @Test
    public void multiplyTest1() {
        String factor1 = "4";
        String factor2 = "4";
        Operator operator = new Operator();
        String prod = operator.doOperation("*", factor1,factor2);
        Assertions.assertEquals("100", prod);
    }

    @Test
    public void multiplyTest2() {
        String factor1 = "0";
        String factor2 = "4";
        Operator operator = new Operator();
        String prod = operator.doOperation("*", factor1,factor2);
        Assertions.assertEquals("0", prod);
    }

    @Test
    public void multiplyTest3() {
        String factor1 = "-2";
        String factor2 = "3";
        Operator operator = new Operator();
        String prod = operator.doOperation("*", factor1,factor2);
        Assertions.assertEquals("-12", prod);
    }

    @Test
    public void multiplyTest4() {
        String factor1 = "-2";
        String factor2 = "-3";
        Operator operator = new Operator();
        String prod = operator.doOperation("*", factor1,factor2);
        Assertions.assertEquals("12", prod);
    }

    @Test
    public void divideTest1() {
        String dividend = "100";
        String divisor = "10";
        Operator operator = new Operator();
        String quot = operator.doOperation("/", dividend, divisor);
        Assertions.assertEquals("10", quot);
    }

    @Test
    public void divideTest2() {
        String dividend = "22";
        String divisor = "-11";
        Operator operator = new Operator();
        String quot = operator.doOperation("/", dividend, divisor);
        Assertions.assertEquals("-2", quot);
    }

    @Test
    public void divideTest3() {
        String dividend = "0";
        String divisor = "-11";
        Operator operator = new Operator();
        String quot = operator.doOperation("/", dividend, divisor);
        Assertions.assertEquals("0", quot);
    }

    @Test
    public void divideTest4() { // Notice: Remainder is dropped from division operation
        String dividend = "100";
        String divisor = "11";
        Operator operator = new Operator();
        String quot = operator.doOperation("/", dividend, divisor);
        Assertions.assertEquals("3", quot);
    }
}
