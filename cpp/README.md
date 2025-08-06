# C++ STL Complete Cheat Sheet


### String
```cpp
string s = "example";
s.push_back('!');
s += " text";
char c = s[0];
int length = s.size();
// Get substring (O(k) where k = substring length) from 2nd index to 4 char
string sub = s.substr(2, 4);
int pos = s.find("amp");
s.clear();
bool empty = s.empty();

```

## 1. Sequence Containers

### Vector
```cpp
#include <vector>
vector<int> v = {1,2,3};
v.push_back(4);     // Add to end (O1)
v.pop_back();       // Remove from end (O1)
v[0];              // Access element (O1)
v.size();          // Get size (O1)
sort(v.begin(), v.end()); // Sort (O(n log n))
```

### Deque
```cpp
#include <deque>
deque<int> dq = {2,3};
dq.push_front(1);   // Add to front (O1)
dq.push_back(4);    // Add to end (O1)
dq.pop_front();     // Remove from front (O1)
```

### List
```cpp
#include <list>
list<int> lst = {1,2};
lst.push_front(0);  // Add to front (O1)
lst.push_back(3);   // Add to end (O1)
lst.insert(++lst.begin(), 5); // Insert (O1)
lst.erase(lst.begin()); // Remove (O1)
```

## 2. Associative Containers

### Set
```cpp
#include <set>
set<int> s = {3,1,2}; // {1,2,3}
s.insert(4);        // Insert (O(log n))
s.erase(2);         // Remove (O(log n))
s.count(3);         // Check existence (O(log n))
```

### Map
```cpp
#include <map>
map<string,int> m = {{"a",1}};
m["b"] = 2;        // Insert/update (O(log n))
m.erase("a");      // Remove (O(log n))
m.count("b");      // Key exists (O(log n))

for (const auto &pair : m){
    cout << pair.first << pair.second << endl;
}
```

## 3. Unordered Containers
```cpp
#include <unordered_set>
#include <unordered_map>
unordered_set<int> us = {3,1,2}; // Hash set
unordered_map<string,int> um;    // Hash map
// Same interface but O(1) average case
```

## 4. Container Adapters

### Stack
```cpp
#include <stack>
stack<int> st;
st.push(1);        // Push (O1)
st.top();          // Peek top (O1)
st.pop();          // Pop (O1)
```

### Queue
```cpp
#include <queue>
queue<int> q;
q.push(1);         // Enqueue (O1)
q.front();         // Peek front (O1)
q.pop();           // Dequeue (O1)
```

### Priority Queue
```cpp
#include <queue>
priority_queue<int> pq; // Max-heap
pq.push(3);       // Insert (O(log n))
pq.top();         // Peek max (O1)
pq.pop();         // Remove max (O(log n))
```

## 5. Algorithms
```cpp
#include <algorithm>
sort(v.begin(), v.end());         // Sort
reverse(v.begin(), v.end());      // Reverse
auto it = find(v.begin(), v.end(), 2); // Find
count(v.begin(), v.end(), 2);    // Count
*max_element(v.begin(), v.end()); // Max element
```

## 6. Utilities
```cpp
#include <utility>
pair<int,string> p = {1,"a"};    // Pair
tuple<int,string> t = {2,"b"};   // Tuple
swap(a, b);                      // Swap
min(a, b); max(a, b);            // Min/Max
```

## 7. Iteration
```cpp
// Range-based
for(auto x : v) cout << x;

// Iterator
for(auto it = v.begin(); it != v.end(); ++it)

// Reverse
for(auto rit = v.rbegin(); rit != v.rend(); ++rit)
```

## 8. Common Headers
```cpp
#include <vector>
#include <deque>
#include <list>
#include <set>
#include <map>
#include <unordered_set>
#include <unordered_map>
#include <stack>
#include <queue>
#include <algorithm>
#include <utility>
```
