#include <iostream>
#include <vector>

int main() {
    int n;
    std::cin >> n;
    std::vector<int> balls(n);
    
    for (int i = 0; i < n; i++) {
        std::cin >> balls[i];
    }

    int destroyed = 0;
    bool repeat = true;
    
    while (repeat) {
        repeat = false;
        for (int i = 0; i < static_cast<int>(balls.size()) - 2; i++) {
            if (balls[i] == balls[i+1] && balls[i] == balls[i+2]) {
                int color = balls[i];
                int j = i;
                while (j < static_cast<int>(balls.size()) && balls[j] == color) {
                    destroyed++;
                    j++;
                }
                balls.erase(balls.begin() + i, balls.begin() + j);
                repeat = true;
                break;
            }
        }
    }

    std::cout << destroyed << std::endl;

    return 0;
}