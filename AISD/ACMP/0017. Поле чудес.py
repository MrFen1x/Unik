#include <iostream>
using namespace std;
int *a;
int n;
bool check(int s)
{
    int i = 0;
    while((a[i] == a[i % s]) && (i < n))
        i++;
    if(i == n)
        return true;
    else
        return false;
}
int main() {
    cin >> n;
    a = new int [n];
    for(int i = 0; i < n; ++i)
        cin >> a[i];
    n--;
    int r = n;
    for(int i = 1; i < n; ++i){
        if(!(n % i)){
            if(check(i)){
                r = i;
                break;
            }
        }
    }
    cout << r;
    delete [] a;
    return 0;
}
