def left_binary_search(arr, target):
    left, right = 0, len(arr) - 1
    result = -1

    while left <= right:
        mid = left + (right - left) // 2

        if arr[mid] == target:
            result = mid
            right = mid - 1
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    return result

n = int(input())
arr = list(map(int, input().split()))
m = int(input())
queries = list(map(int, input().split()))

total_sum = 0
for query in queries:
    index = left_binary_search(arr, query)
    total_sum += index

print(total_sum)

