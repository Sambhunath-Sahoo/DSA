def reverse_string(s):
    """
    Reverse a string
    Time Complexity: O(n)
    Space Complexity: O(n)
    """
    return s[::-1]

def reverse_string_inplace(s):
    """
    Reverse a string in place (for list of characters)
    Time Complexity: O(n)
    Space Complexity: O(1)
    """
    s_list = list(s)
    left, right = 0, len(s_list) - 1
    
    while left < right:
        s_list[left], s_list[right] = s_list[right], s_list[left]
        left += 1
        right -= 1
    
    return ''.join(s_list)

def main():
    # Read input
    s = input().strip()
    
    # Reverse string
    result = reverse_string(s)
    
    # Print result
    print(result)

if __name__ == "__main__":
    main() 