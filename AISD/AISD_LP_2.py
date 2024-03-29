f=open('INPUT.TXT', 'r')
n = int(f.readline())
a = list(map(int, f.readline().split()))

n=n+2
a.append(a[0])
a.append(a[1])
summ=a[0]

if n == 2:
    summ =a[0]+a[1]
for i in range(0, n-2):
        if a[i]+a[i+1]+a[i+2]>summ:
            summ= a[i]+a[i+1]+a[i+2]

print (summ)
