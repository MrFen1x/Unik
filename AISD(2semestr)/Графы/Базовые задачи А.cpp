#include <iostream>
#include <vector>

using namespace std;

int main() {
    int N;
    cin >> N;

    // Создаем матрицу смежности и инициализируем нулями
    vector<vector<int>> adjacencyMatrix(N, vector<int>(N, 0));

    // Заполняем матрицу смежности на основе списков смежности
    for (int i = 0; i < N; ++i) {
        int num_neighbors;
        cin >> num_neighbors;

        for (int j = 0; j < num_neighbors; ++j) {
            int neighbor;
            cin >> neighbor;
            adjacencyMatrix[i][neighbor - 1] = 1;
        }
    }

    // Выводим матрицу смежности
    for (int i = 0; i < N; ++i) {
        for (int j = 0; j < N; ++j) {
            cout << adjacencyMatrix[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}