#include <iostream>
using namespace std;
 
int func(int a, int b)
{
    if(!b)
        return 1;
    int count = 0;
    for(int i = 1; i < a; ++i)
      if(b - i >= 0)
        count += func(i, b - i);
    return count;
}
 
int main()
{
    int n;
    cin >> n;
    int count = 0;
    for(int i = 1; i <= n; ++i)
        count += func(i, n - i);
    cout << count;
    return 0;
}
