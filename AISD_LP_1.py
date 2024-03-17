# Чтение входных данных из файла
with open('INPUT.TXT', 'r') as f:
    N = int(f.readline())
    A = list(map(int, f.readline().split()))
    L, R = map(int, f.readline().split())

# Находим максимальный элемент и его индекс на заданном отрезке
max_element = A[L-1]
max_index = L
for i in range(L, R):
    if A[i] > max_element:
        max_element = A[i]
        max_index = i + 1

# Запись результата в выходной файл
with open('OUTPUT.TXT', 'w') as f:
    f.write(f"{max_element} {max_index}")
