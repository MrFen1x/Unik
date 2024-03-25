f= open('INPUT.TXT', 'r')
n = int(f.readline().strip())
a= list(map(int, f.readline().split()))
l = int(f.readline().strip())
b= list(map(int, f.readline().split()))

result=0

for i in range(0,l):
    k=b[i]
    kk = 0
    left=0
    right=n
    while left <= right:
        mid = (left + right) // 2
        if a[mid] == k:
            result = result+mid
            right = mid - 1  # продолжаем искать в левой части массива
        elif a[mid] < k:
            left = mid + 1
        else:
            right = mid - 1

    print(result)
