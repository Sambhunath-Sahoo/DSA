import java.util.*;

public class CollectionsFramework {

    public static void arrayOperations() {
        int[] arr = { 10, 1, 2, 3, 4, 5 };

        Arrays.sort(arr);
    }

    public static void arrayListOperations() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.remove(Integer.valueOf(10));
        list.set(0, 50);
        list.get(0); // Access (O(1))

        Collections.sort(list);
    }

    public static void stringOperations() {
        String s = "hello";
        s.replace('l', 'p');
        s.charAt(0); // Access char (O(1))
        s.length(); // Get length (O(1))
        s.substring(2, 6);// From index 2 to 5 (O(k))
        s.indexOf("amp"); // Find (O(n))
        s.isEmpty();

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    public static void mapOperations() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 90);
        map.get("a");
        map.remove("Alice");
        map.containsKey(1);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void stackOperations() {
        Stack<String> stack = new Stack<>();
        stack.push("apple");
        stack.pop();
        stack.peek();

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void queueOperations() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("first");
        queue.poll();
        queue.offer("fourth");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

    }

    public static void setOperations() {
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.remove(100);
        set.add(400);
        for (int val : set) {
            System.out.print(val + " ");
        }

    }

    public static void main(String[] args) {
        arrayOperations();
        // arrayListOperations();
        // stringOperations();
        // stackOperations();
        // queueOperations();
        // setOperations();
        // mapOperations();
    }
}
