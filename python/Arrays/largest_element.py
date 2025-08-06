def largest_element(arr):
    """
    Find the largest element in an array
    Time Complexity: O(n)
    Space Complexity: O(1)
    """
    if not arr:
        return None
    
    largest = arr[0]
    for i in range(1, len(arr)):
        if arr[i] > largest:
            largest = arr[i]
    return largest

def main():
    # Read input
    n = int(input())
    
    # Read array elements
    arr = list(map(int, input().split()))
    
    # Find largest element
    result = largest_element(arr)
    
    # Print result
    print(result)

if __name__ == "__main__":
    main() 