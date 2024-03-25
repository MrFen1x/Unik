f= open('INPUT.TXT', 'r')
n = int(f.readline())
a= list(map(int, f.readline().split()))
l = int(f.readline())

ik=0
k=1000000000

for i in range(0,n):
    if abs(a[i]-l)<k:
        ik=a[i]
        k=abs(a[i]-l)
    elif abs(a[i]-l)==k:
        ik = min(ik, a[i])

f=open("OUTPUT.TXT", "w")
f.write(str(ik))