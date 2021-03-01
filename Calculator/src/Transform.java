import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Transform {
    public static int inputStr(String str) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("II", 2);
        numbers.put("III", 3);
        numbers.put("IV", 4);
        numbers.put("V", 5);
        numbers.put("VI", 6);
        numbers.put("VII", 7);
        numbers.put("VIII", 8);
        numbers.put("IX", 9);
        numbers.put("X", 10);
        if(!numbers.containsKey(str)) {
            System.out.println("Ошибка ввода!");
            System.exit(1);
        }
        return (numbers.get(str));
    }

    public static String outputStr(int number) {
        String result = "";
        Map<Integer, String> str = new LinkedHashMap<>();
        str.put(100, "C");
        str.put(90, "XC");
        str.put(50, "L");
        str.put(40, "XL");
        str.put(10, "X");
        str.put(9, "IX");
        str.put(5, "V");
        str.put(4, "IV");
        str.put(1, "I");
        if(str.containsKey(number)) {return(str.get(number));}
        for (Map.Entry<Integer, String> entry : str.entrySet()) {
            for(int i = 0; i < number / entry.getKey(); ++i) {
                result += entry.getValue();
            }
            number %= entry.getKey();
        }
    return (result);
    }
}


