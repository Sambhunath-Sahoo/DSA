#include <iostream>
#include <vector>
using namespace std;

void LeftRotateByOne(vector<int>& vec)
{
    int firstItem = vec[0]; 
    for(int i=1; i<vec.size(); i++) {
        vec[i-1] = vec[i];
    }
    vec[vec.size() - 1] = firstItem;
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

    LeftRotateByOne(vec);

    for (int i = 0; i < n; i++)
    {
        cout << vec[i] << ' ';
    }
    return 0;
}
