#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void DFS(int v, const vector<vector<int>>& graph, vector<bool>& visited, int& farthestVertex, int& maxDistance, int distance) {
    visited[v] = true;
    if (distance > maxDistance) {
        maxDistance = distance;
        farthestVertex = v;
    }

    for (int u : graph[v]) {
        if (!visited[u]) {
            DFS(u, graph, visited, farthestVertex, maxDistance, distance + 1);
        }
    }
}

int main() {
    int N;
    cin >> N;

    vector<vector<int>> graph(N + 1); // +1 для индексации с 1
    for (int i = 0; i < N - 1; ++i) {
        int a, b;
        cin >> a >> b;
        graph[a].push_back(b);
        graph[b].push_back(a); // граф неориентированный
    }

    vector<bool> visited(N + 1, false); // +1 для индексации с 1
    int farthestVertex = 0, maxDistance = 0;

    // Находим самую удаленную вершину от случайно выбранной (1)
    DFS(1, graph, visited, farthestVertex, maxDistance, 0);

    // Сбрасываем массив посещенных вершин и находим самую удаленную от нее вершину
    fill(visited.begin(), visited.end(), false);
    DFS(farthestVertex, graph, visited, farthestVertex, maxDistance, 0);

    // Выводим найденное расстояние (диаметр графа), что и будет минимальным временем жизни пакета
    cout << maxDistance << endl;

    return 0;
}