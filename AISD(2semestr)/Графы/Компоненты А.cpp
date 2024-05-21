#include <iostream>
#include <vector>
#include <unordered_set>

using namespace std;

void DFS(int v, const vector<vector<int>>& graph, vector<bool>& visited, unordered_set<int>& component) {
    visited[v] = true;
    component.insert(v);

    for (int u : graph[v]) {
        if (!visited[u]) {
            DFS(u, graph, visited, component);
        }
    }
}

int main() {
    int N, M;
    cin >> N >> M;

    // Создаем граф в виде списка смежности
    vector<vector<int>> graph(N + 1); // +1 для индексации с 1
    for (int i = 0; i < M; ++i) {
        int from, to;
        cin >> from >> to;
        graph[from].push_back(to);
        graph[to].push_back(from); // так как граф неориентированный
    }

    vector<bool> visited(N + 1, false); // +1 для индексации с 1
    vector<unordered_set<int>> components;

    // Обходим каждую вершину и находим компоненты связности
    for (int v = 1; v <= N; ++v) {
        if (!visited[v]) {
            unordered_set<int> component;
            DFS(v, graph, visited, component);
            components.push_back(component);
        }
    }

    // Выводим количество компонент связности
    cout << components.size() << endl;

    // Выводим сами компоненты связности
    for (const auto& component : components) {
        cout << component.size() << endl;
        for (int v : component) {
            cout << v << " ";
        }
        cout << endl;
    }

    return 0;
}