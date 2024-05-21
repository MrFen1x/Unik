#include <iostream>
#include <vector>
#include <stack>
#include <unordered_set>

using namespace std;

bool topologicalSort(int v, const vector<vector<int>>& graph, vector<int>& visited, stack<int>& order) {
    visited[v] = 1; // Помечаем вершину как посещенную
    for (int u : graph[v]) {
        if (visited[u] == 0) { // Если вершина не была посещена, рекурсивно обходим её
            if (!topologicalSort(u, graph, visited, order))
                return false; // Если возвращается false, значит, был найден цикл
        } else if (visited[u] == 1) {
            return false; // Если встречаем вершину, которая еще обрабатывается, то нашли цикл
        }
    }
    visited[v] = 2; // Помечаем вершину как обработанную
    order.push(v); // Добавляем вершину в стек в порядке завершения обработки
    return true;
}

bool isAcyclic(int n, const vector<vector<int>>& graph, stack<int>& order) {
    vector<int> visited(n, 0); // Массив для отслеживания состояния вершин (0 - не посещена, 1 - в процессе обработки, 2 - обработана)
    for (int v = 0; v < n; ++v) {
        if (visited[v] == 0) { // Начинаем обход с непосещенных вершин
            if (!topologicalSort(v, graph, visited, order))
                return false; // Если находим цикл, возвращаем false
        }
    }
    return true;
}

int main() {
    int n, m;
    cin >> n >> m;

    vector<vector<int>> graph(n);

    for (int i = 0; i < m; ++i) {
        int a, b;
        cin >> a >> b;
        graph[a].push_back(b); // Направленное ребро от вершины a к вершине b
    }

    stack<int> order;
    if (!isAcyclic(n, graph, order)) {
        cout << -1 << endl; // Граф содержит цикл, нет топологической сортировки
    } else {
        while (!order.empty()) {
            cout << order.top() << " "; // Выводим вершины в порядке топологической сортировки
            order.pop();
        }
        cout << endl;
    }

    return 0;
}