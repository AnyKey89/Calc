import java.util.List;

class MathRome {
    static String math(String one, String two, String operation){
        int oneNumber=0;
        int twoNumber=0;

        String[] arrayRome =new String[] {"I","II","III","IV", "V", "VI", "VII","IIX","IX","X"};
        for (int i=0; i<10; i++){
            if (arrayRome[i].equals(one)){
                oneNumber = i+1;
            }
            if (arrayRome[i].equals(two)){
                twoNumber = i+1;
            }
        }
        int resultInt;
        String stringResult;
        switch (operation){
            case("+"):
                resultInt = oneNumber + twoNumber;
                stringResult = (""+ resultInt);
                break;
            case ("-"):
                resultInt = oneNumber - twoNumber;
                if (resultInt<0){
                    return stringResult="throws Exception";
                }else{
                    stringResult = (""+ resultInt);
                }

                break;
            case ("*"):
                resultInt = oneNumber * twoNumber;
                stringResult = (""+ resultInt);
                break;
            case ("/"):
                resultInt = oneNumber / twoNumber;
                stringResult = (""+ resultInt);
                break;
            default: stringResult = "throws Exception";
        }


    return stringResult;
    }


    //преобразование в Римские
    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}
