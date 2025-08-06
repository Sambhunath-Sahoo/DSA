#include <iostream>
#include <vector>
#include <map>
#include <climits> 
using namespace std;

int SumOfHighestAndLowestFrequency(vector<int> &vec)
{

    map<int, int> m;
    for (int i = 0; i < vec.size(); i++)
    {
        m[vec[i]]++;
    }

    int maxElement = -1;
    int maxOccurance = 0;

    int lowElement = INT_MAX;
    int lowOccurance = INT_MAX;
    for (auto &pair : m)
    {
        if(pair.second > maxOccurance) {
            maxElement = pair.first;
            maxOccurance = pair.second;
        }

        if(pair.second < lowOccurance) {
            lowOccurance = pair.second;
            lowElement = pair.first;
        }
    }

    return maxOccurance + lowOccurance;
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

    int result = SumOfHighestAndLowestFrequency(vec);

    cout << result << endl;
    return 0;
}
