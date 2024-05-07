#include <iostream>
#include <vector>
using namespace std;

long long max_utility = 0;
int min_items = 21;
vector<int> optimal_items(21, 0);
vector<int> is_chosen(21, 0);
vector<int> utility(21);
vector<int> weight(21);

int n, max_weight;

void search(int i, int current_weight, long long current_utility, int selected_items_count) {
    if (current_weight > max_weight) return;
    if (current_utility > max_utility || (current_utility == max_utility && selected_items_count < min_items)) {
        max_utility = current_utility;
        min_items = selected_items_count;
        optimal_items = is_chosen;
    }
    if (i > n) {
        return;
    }
    is_chosen[i] = 1;
    search(i + 1, current_weight + weight[i], current_utility + utility[i], selected_items_count + 1);
    is_chosen[i] = 0;
    search(i + 1, current_weight, current_utility, selected_items_count);
}

int main() {
    cin >> n >> max_weight;
    for (int i = 1; i <= n; i++) {
        cin >> weight[i] >> utility[i];
    }
    search(1, 0, 0, 0);
    cout << min_items << ' ' << max_utility << endl;
    for (int i = 1; i <= n; i++) {
        if (optimal_items[i] == 1) {
            cout << i << " ";
        }
    }
    return 0;
}