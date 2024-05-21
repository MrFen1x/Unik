#include <iostream>
#include <vector>
#include <stack>
#include <algorithm>

using namespace std;

void DFS1(int v, const vector<vector<int>>& graph, vector<bool>& visited, stack<int>& order) {
    visited[v] = true;

    for (int u : graph[v]) {
        if (!visited[u]) {
            DFS1(u, graph, visited, order);
        }
    }

    order.push(v);
}

void DFS2(int v, const vector<vector<int>>& transposedGraph, vector<bool>& visited, vector<int>& component, int componentId) {
    visited[v] = true;
    component[v] = componentId;

    for (int u : transposedGraph[v]) {
        if (!visited[u]) {
            DFS2(u, transposedGraph, visited, component, componentId);
        }
    }
}

void kosaraju(int n, const vector<vector<int>>& graph, const vector<vector<int>>& transposedGraph, vector<int>& component) {
    vector<bool> visited(n, false);
    stack<int> order;

    // Обход графа в глубину и формирование стека
    for (int v = 0; v < n; ++v) {
        if (!visited[v]) {
            DFS1(v, graph, visited, order);
        }
    }

    // Сброс меток посещенных вершин
    fill(visited.begin(), visited.end(), false);

    int componentId = 1;
    // Обход транспонированного графа и нахождение компонент сильной связности
    while (!order.empty()) {
        int v = order.top();
        order.pop();

        if (!visited[v]) {
            DFS2(v, transposedGraph, visited, component, componentId);
            ++componentId;
        }
    }
}

int main() {
    int n, m;
    cin >> n >> m;

    vector<vector<int>> graph(n);
    vector<vector<int>> transposedGraph(n);

    for (int i = 0; i < m; ++i) {
        int a, b;
        cin >> a >> b;
        --a; // для нумерации с 0
        --b;
        graph[a].push_back(b);
        transposedGraph[b].push_back(a);
    }

    vector<int> component(n);
    kosaraju(n, graph, transposedGraph, component);

    // Подсчёт количества компонент сильной связности
    int componentCount = *max_element(component.begin(), component.end());

    // Вывод количества компонент сильной связности
    cout << componentCount << endl;

    // Вывод номеров компонент сильной связности для каждой вершины
    for (int i = 0; i < n; ++i) {
        cout << component[i] << " ";
    }
    cout << endl;

    return 0;
}