n = int(input())
a = list(map(int, input().split()))
m = int(input())
d = list(map(int, input().split()))

total = 0

for i in d:
    l, r = 0, n-1
    result = -1

    while l <= r:
        c= l+ (r - l) // 2
        if a[c] == i:
            result = c
            r = c - 1
        elif a[c] < i:
            l = c + 1
        else:
            r = c - 1
    total += result

print(total)