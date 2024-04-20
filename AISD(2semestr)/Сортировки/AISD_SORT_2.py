def sort(arr,k):
    while k>0:
        for i in range(0,len(arr)-1):
            if arr[i]>arr[i+1]:
                arr[i],arr[i+1]=arr[i+1],arr[i]
                break;
        k=k-1
    return arr
n = int(input().strip())
arr = list(map(int, input().split()))
k = int(input().strip())

sorted_array = sort(arr, k)
print(*sorted_array)
