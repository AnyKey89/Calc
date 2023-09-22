class CheckRome {
    static boolean chek(String one, String two, String oper) {
        String[] arrayRome = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "IIX", "IX", "X"};
        String[] operations = new String[]{"+", "-", "/", "*"};
        boolean oneRomeChek = false;
        boolean twoRomeChek = false;
        boolean checkOperation = false;

        for (String tmp : arrayRome) {
            if (tmp.equals(one)) {
                oneRomeChek = true;
            }
            if (tmp.equals(two)) {
                twoRomeChek = true;
            }
        }
        for (String tmp : operations) {
            if (tmp.equals(oper)) {
                checkOperation = true;
            }

        }
        if (oneRomeChek && twoRomeChek && checkOperation) {
            return true;
        }
        return false;
    }
}