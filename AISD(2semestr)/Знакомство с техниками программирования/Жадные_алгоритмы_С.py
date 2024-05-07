def max_subarray(arr):
    max_sum = float('-inf')
    cur_sum = 0
    start_index = 0
    end_index = 0
    current_start_index = 0

    for i in range(len(arr)):
        cur_sum += arr[i]
        if cur_sum > max_sum:
            max_sum = cur_sum
            start_index = current_start_index
            end_index = i
        if cur_sum < 0:
            cur_sum = 0
            current_start_index = i + 1

    return start_index, end_index

N = int(input())
arr = list(map(int, input().split()))

start, end = max_subarray(arr)

print(start, end)
