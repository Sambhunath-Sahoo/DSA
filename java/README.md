# Java Collections & Utilities Complete Cheat Sheet

## 0. String Operations

```java
String s = "example";
s += " text";                  // Concatenate (O(n))
char c = s.charAt(0);          // Access char (O(1))
int length = s.length();       // Get length (O(1))
String sub = s.substring(2, 6);// From index 2 to 5 (O(k))
int pos = s.indexOf("amp");    // Find (O(n))
boolean empty = s.isEmpty();
s = "";                        // Clear
```

## 1. Sequence-like Collections

### ArrayList
```java
import java.util.*;

ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
list.set(j, 6);
list.add(4);                   // Add to end (O(1) amortized)
list.remove(list.size()-1);    // Remove last (O(1))
int x = list.get(0);           // Access (O(1))
Collections.sort(list);        // Sort (O(n log n))
```

### LinkedList
```java
LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2));
ll.addFirst(0);                // Add front (O(1))
ll.addLast(3);                 // Add end (O(1))
ll.removeFirst();              // Remove front (O(1))
ll.add(1, 5);                  // Insert at index (O(n))
```

## 2. Sets

### TreeSet (Sorted Set)
```java
Set<Integer> ts = new TreeSet<>(Arrays.asList(3, 1, 2)); // {1, 2, 3}
ts.add(4);                        // Insert (O(log n))
ts.remove(2);                     // Remove (O(log n))
boolean exists = ts.contains(3);  // Search (O(log n))
```

### HashSet
```java
Set<Integer> hs = new HashSet<>(Arrays.asList(3, 1, 2));
hs.add(4);                        // Insert (O(1) avg)
hs.remove(3);                     // Remove (O(1) avg)
```

## 3. Maps

### TreeMap (Sorted Map)
```java
Map<String, Integer> tm = new TreeMap<>();
tm.put("a", 1);                  // Insert/update (O(log n))
tm.put("b", 2);
tm.remove("a");                   // Remove (O(log n))
boolean exists = tm.containsKey("b");

for (Map.Entry<String, Integer> e : tm.entrySet()) {
    System.out.println(e.getKey() + " " + e.getValue());
}
```

### HashMap
```java
HashMap<String, Integer> hm = new HashMap<>();
hm.containsKey(integer);
hm.get("a");
hm.put("a", 1);                  // O(1) avg
hm.put("b", 2);
hm.remove("a");
```

## 4. Queues & Stacks

### Stack
```java
Stack<Integer> st = new Stack<>();
st.push(1);                      // Push (O(1))
int top = st.peek();             // Peek (O(1))
st.pop();                        // Pop (O(1))
```

### Queue (FIFO)
```java
Queue<Integer> q = new LinkedList<>();
q.add(1);                        // Enqueue (O(1))
int front = q.peek();            // Peek (O(1))
q.poll();                        // Dequeue (O(1))
```

### PriorityQueue (Min-heap by default)
```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(3);                       // Insert (O(log n))
int min = pq.peek();             // Peek min (O(1))
pq.poll();                       // Remove min (O(log n))

// Max-heap:
PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
```

## 5. Collections Algorithms
```java
Collections.sort(list);                    // Sort
Collections.reverse(list);                 // Reverse
int freq = Collections.frequency(list, 2); // Count
int max = Collections.max(list);           // Max element
Collections.swap(list, 0, 1);             // Swap
```

## 6. Utilities

### Pair and Tuple Equivalents
```java
// Pair equivalent: AbstractMap.SimpleEntry
Map.Entry<Integer, String> p = new AbstractMap.SimpleEntry<>(1, "a");

// Tuple: custom class or record (Java 14+)
record Tuple(int id, String name) {}
Tuple t = new Tuple(2, "b");

// Min/Max
int m1 = Math.min(a, b);
int m2 = Math.max(a, b);
```

## 7. Iteration Methods
```java
// For-each loop
for (int val : list) {
    System.out.println(val);
}

// Iterator
for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
    System.out.println(it.next());
}

// Lambda expression
list.forEach(System.out::println);
```

---

## Quick Reference

| Collection | Insert | Access | Search | Remove | Order |
|------------|--------|--------|--------|--------|-------|
| ArrayList | O(1) | O(1) | O(n) | O(n) | Insertion |
| LinkedList | O(1) | O(n) | O(n) | O(n) | Insertion |
| HashSet | O(1) | N/A | O(1) | O(1) | None |
| TreeSet | O(log n) | N/A | O(log n) | O(log n) | Sorted |
| HashMap | O(1) | N/A | O(1) | O(1) | None |
| TreeMap | O(log n) | N/A | O(log n) | O(log n) | Sorted |

## Notes
- **Time Complexity**: Most operations are amortized O(1) for hash-based collections
- **Memory**: ArrayList is more memory-efficient than LinkedList for most use cases
- **Thread Safety**: None of these collections are thread-safe by default
- **Null Values**: HashSet and HashMap allow null values; TreeSet and TreeMap do not