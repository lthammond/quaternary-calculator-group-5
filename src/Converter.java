import static java.lang.Integer.parseInt;

public class Converter {
    public int convertToDecimal(String quaternaryNumberToConvert) {
        int convertedDecimalNumber = 0;
        int placeValue = 1;
        for(int i = 0; i < quaternaryNumberToConvert.length(); i++) {
            int value = parseInt(String.valueOf(quaternaryNumberToConvert.charAt(quaternaryNumberToConvert.length()-i-1)));
            convertedDecimalNumber += value * placeValue;
            placeValue = placeValue * 4;
        }
        return convertedDecimalNumber;
    }

    // Converts base 10 number to base 4 by repeatedly dividing the decimal number
    // and appending the remainder to a string.
    public String convertToQuaternary(int decimalNumberToConvert) {
        StringBuilder stringBuilder = new StringBuilder(); // StringBuilder is used to append remainder.
        while(decimalNumberToConvert != 0) {
            int quotient = decimalNumberToConvert / 4;
            int remainder = decimalNumberToConvert % 4;
            decimalNumberToConvert = quotient;
            stringBuilder.append(remainder);
        } // Remainder string has been appended backwards and needs to be reversed.
        String convertedQuaternaryNumber = String.valueOf(stringBuilder.reverse());
        return convertedQuaternaryNumber;
    }
}
