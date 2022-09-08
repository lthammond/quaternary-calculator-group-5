package quaternarycalculator.bsu.edu.backend;

public class Operator {
    Converter converter = new Converter();
    public String add(String addend1, String addend2) {
        int a1 = converter.convertToDecimal(addend1);
        int a2 = converter.convertToDecimal(addend2);
        int sum = a1 + a2;
        return converter.convertToQuaternary(sum);
    }

    public String subtract(String minuend, String subtrahend) {
        int min = converter.convertToDecimal(minuend);
        int sub = converter.convertToDecimal(subtrahend);
        int diff = min - sub;
        return converter.convertToQuaternary(diff);
    }

    public String multiply(String factor1, String factor2) {
        int f1 = converter.convertToDecimal(factor1);
        int f2 = converter.convertToDecimal(factor2);
        int prod = f1 * f2;
        return converter.convertToQuaternary(prod);
    }

    public String divide(String dividend, String divisor) {
        int dend = converter.convertToDecimal(dividend);
        int sor = converter.convertToDecimal(divisor);
        int quot = dend / sor;
        return converter.convertToQuaternary(quot);
    }
}
