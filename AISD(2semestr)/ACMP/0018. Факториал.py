#include <bits/stdc++.h>
#pragma GCC optimize ("Ofast")
using namespace std;
 
string fact(string s , int power)
{
    string res;
    int temp = 0;
    for (int i = s.size() - 1;i >= 0;--i)
    {
        int temp2 = (s[i] - 48) * power + temp;
        temp = 0;
        if (temp2 > 9)
            temp = temp2 / 10;
        res.insert(0 , 1, temp2 % 10 + 48);
    }
    if (temp)
    {
        while(temp)
        {
            res.insert(0 , 1, temp % 10 + 48);
            temp /= 10;
        }
    }
    return res;
}
 
int main()
{
    ios::sync_with_stdio(0);
    cin.tie(nullptr);
    string s = "1";
    int n;
    cin >> n;
    for (auto i = 1;i <= n;++i)
        s = fact(s , i);
    cout << s << "\n";
    return 0;
}
