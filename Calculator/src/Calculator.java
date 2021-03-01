import java.io.IOException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Что необходимо посчитать?");
        String expression = in.nextLine();
        Integer term1 = 0, term2 = 0;
        boolean isArabian;
        char act = 0;
        if (expression.charAt(0) >= '0' && expression.charAt(0) <= '9') {
            isArabian = true;
            try {
                int i = 0;
                while (expression.charAt(i) != ' ') {
                    term1 *= 10;
                    term1 += expression.charAt(i) - '0';
                    ++i;
                }
                ++i;
                act = expression.charAt(i);
                i += 2;
                while (i != expression.length()) {
                    term2 *= 10;
                    term2 += expression.charAt(i) - '0';
                    ++i;
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода!");
                System.exit(1);
            }

        } else {
            isArabian = false;
            String part1 = "", part2 = "";
            try {
                int i = 0;
                while (expression.charAt(i) != ' ') {
                    ++i;
                }
                part1 = expression.substring(0, i);
                ++i;
                act = expression.charAt(i);
                part2 = expression.substring(i + 2);
            } catch (Exception e) {
                System.out.println("Ошибка ввода!");
                System.exit(1);
            }
            term1 = Transform.inputStr(part1);
            term2 = Transform.inputStr(part2);
        }
        //делаю проверку: по условию задачи входные числа не должны привышать 10
        if (term1 > 10 || term2 > 10) {
            System.out.println("Ошибка ввода!");
            System.exit(1);
        }
        Integer result = Doing.action(term1, term2, act);
        if (result.equals(-1)) {
            System.out.println("Ошибка ввода!");
            System.exit(1);
        }
        if (isArabian) {
            System.out.println(result);
        } else {
            System.out.println(Transform.outputStr(result));
        }
    }
}
