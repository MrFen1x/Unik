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

void DFS2(int v, const vector<vector<int>>& transposedGraph, vector<bool>& visited) {
    visited[v] = true;

    for (int u : transposedGraph[v]) {
        if (!visited[u]) {
            DFS2(u, transposedGraph, visited);
        }
    }
}

int kosaraju(int n, const vector<vector<int>>& graph, const vector<vector<int>>& transposedGraph) {
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

    int count = 0;
    // Обход транспонированного графа и поиск компонент сильной связности
    while (!order.empty()) {
        int v = order.top();
        order.pop();

        if (!visited[v]) {
            DFS2(v, transposedGraph, visited);
            ++count;
        }
    }

    return count;
}

int main() {
    int n, m;
    cin >> n >> m;

    vector<vector<int>> graph(n);
    vector<vector<int>> transposedGraph(n);

    for (int i = 0; i < m; ++i) {
        int a, b;
        cin >> a >> b;
        graph[a].push_back(b);
        transposedGraph[b].push_back(a);
    }

    int result = kosaraju(n, graph, transposedGraph);

    cout << result << endl;

    return 0;
}