def linear_search(arr, target):
    """
    Linear search algorithm
    Time Complexity: O(n)
    Space Complexity: O(1)
    """
    for i in range(len(arr)):
        if arr[i] == target:
            return i
    return -1

def main():
    # Read input
    n = int(input())
    arr = list(map(int, input().split()))
    target = int(input())
    
    # Perform search
    result = linear_search(arr, target)
    
    # Print result
    print(result)

if __name__ == "__main__":
    main() 