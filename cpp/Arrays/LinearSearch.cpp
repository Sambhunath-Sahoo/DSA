#include <iostream>
#include <vector>
using namespace std;

int linearSearch(vector<int> &vec, int target)
{
    for(int i=0; i<vec.size(); i++) {
        if(vec[i] == target) {
            return i;
        }
    }
    return -1;
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

    int target;
    cin >> target;

    int result = linearSearch(vec, target);

    cout << result << endl;
    return 0;
}
