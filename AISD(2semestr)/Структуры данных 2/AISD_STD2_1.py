with open('input.txt', 'r', encoding='utf-8') as file:
    text = file.read()

words = text.split()
count = {}
result = []
for word in words:
    count[word] = count.get(word, 0) + 1
    result.append(count[word])

for count in result:
    print(count - 1, end=' ')
