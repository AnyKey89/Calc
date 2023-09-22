class Math{

    static String math(String one, String two, String operation){
        int oneNumber=0;
        int twoNumber=0;

        String[] arrayNumber = new String[] {"1","2","3","4", "5", "6", "7","8","9","10"};

        for (int i=0; i<10; i++){
            if (arrayNumber[i].equals(one)){
                oneNumber = Integer.parseInt(arrayNumber[i]);
            }
            if (arrayNumber[i].equals(two)){
                twoNumber = Integer.parseInt(arrayNumber[i]);
            }
        }

        int result;
        String stringResult;
        switch (operation){
            case("+"):
                result = oneNumber + twoNumber;
                stringResult = (""+ result);
                break;
            case ("-"):
                result = oneNumber - twoNumber;
                stringResult = (""+ result);
                break;
            case ("*"):
                result = oneNumber * twoNumber;
                stringResult = (""+ result);
                break;
            case ("/"):
                result = oneNumber / twoNumber;
                stringResult = (""+ result);
                break;
            default: stringResult = "throws Exception";

        }
        return stringResult;
    }

}
