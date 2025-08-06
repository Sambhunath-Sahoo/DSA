#include <iostream>
#include <vector>
#include <map>
using namespace std;

int HighestOccuringElement(vector<int> &vec)
{

    map<int, int> m;
    for (int i = 0; i < vec.size(); i++)
    {
        m[vec[i]]++;
    }

    int maxElement = -1;
    int maxOccurance = 0;
    for (const auto &pair : m)
    {
        if(pair.second > maxOccurance) {
            maxElement = pair.first;
            maxOccurance = pair.second;
        }
    }

    return maxOccurance;
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

    int result = HighestOccuringElement(vec);

    cout << result << endl;
    return 0;
}
