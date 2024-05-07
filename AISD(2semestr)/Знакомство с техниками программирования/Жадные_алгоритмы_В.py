def max_passengers(X, N, passengers):
    passengers.sort(key=lambda x: (x[1], -x[0]))

    current_position = 0
    count = 0

    for start, end in passengers:

        if start >= current_position:
            count += 1
            current_position = end

    return count


X, N = map(int, input().split())
passengers = []
for _ in range(N):
    A, B = map(int, input().split())
    passengers.append((A, B))

result = max_passengers(X, N, passengers)
print(result)
