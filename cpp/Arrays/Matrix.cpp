#include <iostream>
#include <vector>
using namespace std;

void makeRow(vector<vector<int>> &matrix, int i) {
    for(int j=0; j<matrix.size(); j++) {
        matrix[i][j] = -1;
    }
}

void makeCols(vector<vector<int>> &matrix, int j) {
    for(int i=0; i<matrix[0].size(); i++) {
        matrix[i][j] = -1;
    }
}

void setZeroes(vector<vector<int>> &matrix)
{
    int rows = matrix.size();
    int cols = matrix[0].size();

    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            if (matrix[i][j] == 0) {
                makeRow(matrix, j);
                makeCols(matrix, i);
            }
        }
    }


    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            if (matrix[i][j] == -1) {
                matrix[i][j] = 0;
            }
        }
    }
}

int main()
{
    int rows, cols;
    cin >> rows;
    cin >> cols;

    vector<vector<int>> matrix(rows, vector<int>(cols));

    for (int i = 0; i < rows; ++i)
    {
        for (int j = 0; j < cols; ++j)
        {
            cin >> matrix[i][j];
        }
    }

    for (int i = 0; i < rows; ++i)
    {
        for (int j = 0; j < cols; ++j)
        {
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
