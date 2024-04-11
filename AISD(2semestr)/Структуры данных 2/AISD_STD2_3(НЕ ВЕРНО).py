n = int(input())
a = []
b = 0
c = 0
d = []

for i in range(n):
    b = int(input())
    for j in range(b):
        c = str(input())
        d.append(c)
    a.append([b, d])
    d = []

for i in range(n):
    d.append(a[i][1])
a = []
for i in range(n):
    a += set(d[i])
a = set(a)

c = []
for i in range(len(a)):
    a = list(a)
    c.append(a[i])
c = set(c)
for i in range(len(d)):
    c &= set(d[i])
print(len(c))
print(*c, sep="\n")
print(len(a))
print(*a, sep="\n")
