public class Converter {
//    public int convertToDecimal(int quaternaryNumberToConvert) {
//
//        return convertedDecimalNumber;
//    }

    public String convertToQuaternary(int decimalNumberToConvert) {
        StringBuilder stringBuilder = new StringBuilder();
        while(decimalNumberToConvert != 0) {
            int quotient = decimalNumberToConvert / 4;
            int remainder = decimalNumberToConvert % 4;
            decimalNumberToConvert = quotient;
            stringBuilder.append(remainder);
        }
        String convertedQuaternaryNumber = String.valueOf(stringBuilder.reverse());
        return convertedQuaternaryNumber;
    }
}
