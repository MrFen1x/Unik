def postfix(e):
    stack = []

    for token in e.split():
        if token.isdigit():
            stack.append(int(token))
        else:
            op2, op1 = stack.pop(), stack.pop()
            stack.append({
                '+': lambda x, y: x + y,
                '-': lambda x, y: x - y,
                '*': lambda x, y: x * y
            }[token](op1, op2))

    return stack[0]

e = input()
print(postfix(e))
