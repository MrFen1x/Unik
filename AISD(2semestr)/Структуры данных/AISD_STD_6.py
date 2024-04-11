clases = {9: [], 10: [], 11: []}

while True:
    try:
        num, name = input().split()
        clases[int(num)].append(name)
    except EOFError:
        break

for num in sorted(clases.keys()):
    for name in clases[num]:
        print(num, name)
