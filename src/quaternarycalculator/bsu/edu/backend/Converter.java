package quaternarycalculator.bsu.edu.backend;

import static java.lang.Integer.parseInt;

public class Converter {
    public int convertToDecimal(String quaternaryNumberToConvert) {     // Converts base 4 number to base 10 number.
        int convertedDecimalNumber = 0;
        int placeValue = 1;
        boolean isNegative = false;

        if (quaternaryNumberToConvert.contains("-")) { // checks to see if base 4 number is negative and if so removes sign.
            quaternaryNumberToConvert = quaternaryNumberToConvert.replace("-", "");
            isNegative = true;
        }
        for(int i = 0; i < quaternaryNumberToConvert.length(); i++) {
            int value = parseInt(String.valueOf(quaternaryNumberToConvert.charAt(quaternaryNumberToConvert.length()-i-1)));
            // Reads value of string index from right to left.
            convertedDecimalNumber += value * placeValue; // takes value in string index and multiplies it by place value.
            placeValue *= 4;
        }
        if (isNegative == true) // Returns negative sign to int after conversion.
            convertedDecimalNumber *= -1;
        return convertedDecimalNumber;
    }

    public String convertToQuaternary(int decimalNumberToConvert) {     // Converts base 10 number to base 4 number.
        StringBuilder remainderList = new StringBuilder(); // StringBuilder is used to append remainders to list.
        boolean isNegative = false;
        if(decimalNumberToConvert == 0) {
            return "0";
        } else {
            if(decimalNumberToConvert < 0) {
                decimalNumberToConvert *= -1;
                isNegative = true;
            }
            while (decimalNumberToConvert != 0) {
                int quotient = decimalNumberToConvert / 4;
                int remainder = decimalNumberToConvert % 4;
                decimalNumberToConvert = quotient;
                remainderList.append(remainder);
                }
            if (isNegative) {
                remainderList.append("-");
            } // Remainder string has been appended backwards and needs to be reversed.
            return String.valueOf(remainderList.reverse());
        }
    }
}
