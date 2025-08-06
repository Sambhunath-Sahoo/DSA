#include <iostream>
#include <vector>
#include <map>
using namespace std;

int SecondHighestOccuringElement(vector<int> &vec)
{

    map<int, int> m;
    for (int i = 0; i < vec.size(); i++)
    {
        m[vec[i]]++;
    }

    int maxElement = -1;
    int maxOccurance = 0;

    int secondMaxElement = -1;
    int secondMaxOccurance = 0;

    for (const auto &pair : m)
    {
        if(pair.second > maxOccurance) {
          
            secondMaxOccurance = maxOccurance;
            secondMaxElement = maxElement;

            maxOccurance = pair.second;
            maxElement = pair.first;
        }
        else if (pair.second < maxOccurance && pair.second > secondMaxOccurance) {
            secondMaxOccurance = pair.second;
            secondMaxElement = pair.first;
        }
    }

    return secondMaxOccurance;
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

    int result = SecondHighestOccuringElement(vec);

    cout << result << endl;
    return 0;
}
