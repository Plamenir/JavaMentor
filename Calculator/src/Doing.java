public class Doing {
    public static Integer action (int term1, int term2, char act) {
        switch (act) {
            case '+':
                return(term1 + term2);
            case '-':
                return(term1 - term2);
            case '*':
                return(term1 * term2);
            case '/':
                return(term1 / term2);
            default:
               return (-1);
        }

    }
}
