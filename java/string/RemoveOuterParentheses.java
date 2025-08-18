import java.util.*;

public class RemoveOuterParentheses {

    public static String removeOuterParentheses(String str) {
        String ans = "";
        int counter = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                if (counter > 0) {
                    ans += "(";
                }
                counter++;
            } else if (ch == ')') {
                counter--;
                if (counter > 0) {
                    ans += ")";
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = removeOuterParentheses(str);
        System.out.println(ans);
        sc.close();
    }
}
