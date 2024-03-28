#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;
 
int main()
{
    ifstream in("INPUT.txt");
    ofstream out("OUTPUT.txt");
    short mas[12][12],i,j,xf,yf,xl,yl,xc,yc;
    for (i=0; i<12; i++)
        for (j=0; j<12; j++)
            mas[i][j]=0;
    char t;
    in>>t; xf = (int)t - 65 + 2;
    in>>t; yf = (int)t - 49 + 2; mas[yf][xf]=-1;
 
    in>>t; xl = (int)t - 65 + 2;
    in>>t; yl = (int)t - 49 + 2; mas[yl][xl]=-1;
 
    in>>t; xc = (int)t - 65 + 2;
    in>>t; yc = (int)t - 49 + 2; mas[yc][xc]=-1;
 
    for (i=0; i<12; i++)
        if (mas[i][xl]!=-1) mas[i][xl]=1;
 
    for (i=0; i<12; i++)
        if (mas[yl][i]!=-1) mas[yl][i]=1;
 
    for (i=0; i<12; i++)
        if (mas[i][xf]!=-1) mas[i][xf]=1;
 
    for (i=0; i<12; i++)
        if (mas[yf][i]!=-1) mas[yf][i]=1;
 
    for (i=yf-1, j=xf+1; i>=0 && j<=11; i--, j++)
        if (mas[i][j]!=-1) mas[i][j]=1;
 
    for (i=yf+1, j=xf+1; i<=11 && j<=11; i++, j++)
        if (mas[i][j]!=-1) mas[i][j]=1;
 
    for (i=yf+1, j=xf-1; i<=11 && j>=0; i++, j--)
        if (mas[i][j]!=-1) mas[i][j]=1;
 
    for (i=yf-1, j=xf-1; i>=0 && j>=0; i--, j--)
        if (mas[i][j]!=-1) mas[i][j]=1;
 
    j=xc+1; i=yc-2; if (mas[i][j]!=-1) mas[i][j]=1;
    j=xc+1; i=yc+2; if (mas[i][j]!=-1) mas[i][j]=1;
    j=xc+2; i=yc-1; if (mas[i][j]!=-1) mas[i][j]=1;
    j=xc+2; i=yc+1; if (mas[i][j]!=-1) mas[i][j]=1;
 
    j=xc-1; i=yc+2; if (mas[i][j]!=-1) mas[i][j]=1;
    j=xc-1; i=yc-2; if (mas[i][j]!=-1) mas[i][j]=1;
    j=xc-2; i=yc+1; if (mas[i][j]!=-1) mas[i][j]=1;
    j=xc-2; i=yc-1; if (mas[i][j]!=-1) mas[i][j]=1;
 
    short s=0;
    for (i=11-2; i>=0+2; i--)
        for (j=0+2; j<12-2; j++)
            if (mas[i][j]==1) s++;
    out<<s;
 
    in.close();
    out.close();
    return 0;
}
