#include <iostream>
#include <vector>
using namespace std;

int MaximumConsequtiveOne(vector<int>& vec)
{
    int globalMax = 0;
    int localMax = 0;
    for(int i=0; i<vec.size(); i++) {
        if(vec[i] == 1) {
            localMax += 1;
        }
        else if (localMax > globalMax) {
            globalMax = localMax;
            localMax = 0;
        }
    }
    return globalMax;
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

    int result = MaximumConsequtiveOne(vec);

    cout << result << endl;
    return 0;
}
