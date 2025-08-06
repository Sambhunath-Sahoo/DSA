#include <iostream>
#include <vector>
using namespace std;

int LargestElement(vector<int>& vec)
{
    int largest = vec[0];
    for(int i=1; i<vec.size(); i++) {
        if(vec[i] > largest) {
            largest = vec[i];
        }
    }
    return largest;
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

    int result = LargestElement(vec);

    cout << result << endl;
    return 0;
}
