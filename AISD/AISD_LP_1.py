f= open('INPUT.TXT', 'r')
n = int(f.readline())
a= list(map(int, f.readline().split()))
l, r = map(int, f.readline().split())

max_element = 0
max_index = 0
for i in range(l, r):
    if a[i] > max_element:
        max_element = a[i]
        max_index = i + 1

f= open('OUTPUT.TXT', 'w')
f.write(f"{max_element} {max_index}")
