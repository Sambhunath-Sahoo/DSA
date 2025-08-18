import java.util.*;

public class ReverseWords {
    public static String reverseWords(String s) {
        s = s.trim();
        Stack<String> st = new Stack<>();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else if (s.charAt(i) == ' ') {
                if (temp != "") {
                    st.push(temp);
                }
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
        String ans = reverseWords(str);
        System.out.println(ans);
        sc.close();
    }
}
