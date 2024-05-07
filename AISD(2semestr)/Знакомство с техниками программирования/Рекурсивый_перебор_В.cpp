#include <iostream>
#include <vector>

using namespace std;

void generate_combinations(vector<int>& combination, int index, int N, int K) {
    if (combination.size() == K) {
        for (int num : combination) {
            cout << num << " ";
        }
        cout << endl;
        return;
    }

    for (int i = index; i <= N; ++i) {
        combination.push_back(i);
        generate_combinations(combination, i + 1, N, K);
        combination.pop_back();
    }
}

int main() {
    int N, K;
    cin >> N >> K;

    vector<int> combination;
    generate_combinations(combination, 1, N, K);

    return 0;
}
