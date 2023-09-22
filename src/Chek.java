class Chek {
    static boolean chek(String one,String two, String oper){

        String[] arrayNumber = new String[] {"1","2","3","4", "5", "6", "7","8","9","10"};
        String[] operations = new String[]{"+","-","/","*"};

        boolean oneNumberChek= false;
        boolean twoNumberChek= false;
        boolean checkOperation = false;

        for (String tmp:arrayNumber) {
            if (tmp.equals(one)){
                oneNumberChek = true;
            }
            if (tmp.equals(two)){
                twoNumberChek = true;
            }
        }
        for (String tmp:operations) {
            if (tmp.equals(oper)) {
                checkOperation = true;
            }
        }
        if (oneNumberChek && twoNumberChek && checkOperation) {
            return true;
        }
        return false;

    }
}
