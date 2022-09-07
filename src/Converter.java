import static java.lang.Integer.parseInt;

public class Converter {
    public int convertToDecimal(String quaternaryNumberToConvert) {     // Converts base 4 number to base 10 number.
        int convertedDecimalNumber = 0;
        int placeValue = 1;
        for(int i = 0; i < quaternaryNumberToConvert.length(); i++) {
            int value = parseInt(String.valueOf(quaternaryNumberToConvert.charAt(quaternaryNumberToConvert.length()-i-1)));
            // Reads value of string index from right to left
            convertedDecimalNumber += value * placeValue; // takes value in string index and multiplies it by place value.
            placeValue = placeValue * 4;
        }
        return convertedDecimalNumber;
    }

    public String convertToQuaternary(int decimalNumberToConvert) {     // Converts base 10 number to base 4 number.
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
