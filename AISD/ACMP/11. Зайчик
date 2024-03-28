#include <bits/stdc++.h>
 
using namespace std;
string sumStr(string a, string b)
{
    string r, tt;
    if(b.size() > a.size())
        return sumStr(b, a);
    while(b.size() < a.size())
        b.insert(0,"0");
    int t = 0;
 
    for(int i = b.size() - 1; i >= 0; --i){
        t += a[i] + b[i] - 96;
        tt = t % 10 + 48;
        r.insert(0,tt);
        t/=10;
    }
    if(t)
        while(t){
            tt = t % 10 + 48;
            r.insert(0,tt);
            t/=10;
        }
    return r;
}
int main()
{
    int k,n;
    cin >> k >>  n;
    vector<string> a;
    a.push_back("1");
    a.push_back("2");
    string s = "3";
    for(int i = 2; i < k; ++i){
        a.push_back(s);
        a[i] = sumStr(a[i], "1");
        s = sumStr(s, s);
        s = sumStr(s, "1");
    }
    s = "0";
    int t = k;
    while(a.size() < n){
        for(int i = 0; i < t; ++i)
            s=sumStr(s,a[k - 1 - i]);
        a.push_back(s);
        s = "0";
        ++k;
    }
    cout << a[n - 1];
    return 0;
}
