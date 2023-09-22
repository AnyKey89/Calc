import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(scanner.nextLine()));
    }
git
    public static String calc(String input){
        String[] array = input.split(" ");

        if (array.length==3){
            if (Chek.chek(array[0],array[2], array[1]))
            {
                return Math.math(array[0],array[2], array[1]);
            }

            if (CheckRome.chek(array[0],array[2], array[1]))
            {
                return MathRome.arabicToRoman(Integer.parseInt(MathRome.math(array[0],array[2], array[1]))) ;
            }
            return "throws Exception";
        }

        return "throws Exception";
    }
}
