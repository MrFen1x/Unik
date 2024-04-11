def valid(s):
    stack = []
    m = {')': '(', ']': '[', '}': '{'}

    for char in s:
        if char in '([{':
            stack.append(char)
        elif char in ')]}':
            if not stack or stack.pop() != m[char]:
                return "NO"

    if not stack:
        return "YES"
    else:
        return "NO"


s = input().strip()

result = valid(s)
print(result)
