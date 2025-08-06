#include <iostream>
#include <vector>
using namespace std;

int SecondLargestElement(vector<int>& vec)
{
    int largest = vec[0];
    int secondLargest = -100000;
    for(int i=1; i<vec.size(); i++) {
        if (vec[i] > largest) {
            secondLargest = largest;
            largest = vec[i];
        } 
        else if (vec[i] < largest && vec[i] > secondLargest) {
            secondLargest = vec[i];
        }
    }
    return secondLargest;
}

int main()
{
    int n;
    cin >> n;

    vector<int> vec(n);
    for (int i = 0; i < n; i++)
    {
        cin >> vec[i];
    }

    int result = SecondLargestElement(vec);

    cout << result << endl;
    return 0;
}
