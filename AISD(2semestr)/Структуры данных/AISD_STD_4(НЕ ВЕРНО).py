num_lines = int(input().strip())
total=0
stek=[]
otvet=[]
zapros=[]
for i in range(num_lines):
    line = input().strip().split()
    if line[0] == "1":
        stek.append(int(line[1]))
        total += int(line[1])
    if not stek:
        otvet.append("0")
        zapros.append(0)
    if line[0] == "2":
        otvet.append(stek[0])
        stek.pop(0)
        zapros.append(2)
    if line[0] == "3":
        otvet.append(total)
        zapros.append(3)
    if line[0] == "4":
        otvet.append(max(stek))
        zapros.append(4)
    if line[0] == "5":
        if not stek.index(max(stek))+1 in otvet:
            otvet.append(stek.index(max(stek))+1)
            zapros.append(5)



otvet1 = []
zapros1 = []

for i in range(len(otvet)):
    pair = (otvet[i], zapros[i])
    if pair not in zip(otvet1, zapros1):
        otvet1.append(otvet[i])
        zapros1.append(zapros[i])

for i in range(len(otvet1)):
    print(otvet1[i])



