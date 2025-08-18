import java.util.*;

public class Questions {

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

    public static String reverseWords(String s) {

        Stack<String> st = new Stack<>();

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else if (s.charAt(i) == ' ') {
                st.push(temp);
                temp = "";
            }
        }

        if (!temp.isEmpty()) {
            st.push(temp);
        }

        String ans = "";
        while (!st.isEmpty()) {
            ans += st.pop();
            if (!st.isEmpty())
                ans += " ";
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String ans = removeOuterParentheses(str);
        String ans = reverseWords(str);
        System.out.println(ans);
        sc.close();
    }
}
