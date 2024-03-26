f= open('INPUT.TXT', 'r')
n = int(f.readline())
a= list(map(int, f.readline().split()))
k = int(f.readline())
ol = list(map(int, f.readline().split()))
result = 0

for item in ol:
    rt = []
    l = 0
    r = n - 1
    c = (l + r) // 2
    k = 0
    while(l < r and k < n-1):
        if item == a[k]:
            rt.append(k)
        elif item > a[k]:
            l = c + 1
        else: r = c - 1
        k= k + 1
    if len(rt)==0:
        result=result-1
    else:
        result=result+min(rt)
print (result)