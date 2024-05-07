def can_return_to_zero(n, angles):
    def backtrack(index, total):
        if index == n:
            return total % 360 == 0
        return backtrack(index + 1, total + angles[index]) or backtrack(index + 1, total - angles[index])

    return "YES" if backtrack(0, 0) else "NO"

n = int(input())
angles = []
for _ in range(n):
    angle = int(input())
    angles.append(angle)

result = can_return_to_zero(n, angles)
print(result)