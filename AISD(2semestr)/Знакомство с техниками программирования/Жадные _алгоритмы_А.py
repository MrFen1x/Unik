def max_sand_value(N, M, piles):
    piles.sort(key=lambda x: -x[1])

    total_value = 0
    total_weight = 0

    for weight, price in piles:

        if total_weight + weight <= M:
            total_value += weight * price
            total_weight += weight

        else:
            remaining_space = M - total_weight
            total_value += remaining_space * price
            break

    return total_value


N, M = map(int, input().split())
piles = []
for _ in range(N):
    w, p = map(int, input().split())
    piles.append((w, p))

result = max_sand_value(N, M, piles)
print(result)
