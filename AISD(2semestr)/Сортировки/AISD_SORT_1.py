def sort(arr, k):
    n = len(arr)
    for i in range(k):
        min_idx = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
    return arr

n = int(input().strip())
arr = list(map(int, input().split()))
k = int(input().strip())

sorted_array = sort(arr, k)

print(*sorted_array)

