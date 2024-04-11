purchases = {}

while True:
    try:
        purchase_info = input().split()
        customer = purchase_info[0]
        product = purchase_info[1]
        quantity = int(purchase_info[2])

        if customer in purchases:
            if product in purchases[customer]:
                purchases[customer][product] += quantity
            else:
                purchases[customer][product] = quantity
        else:
            purchases[customer] = {product: quantity}
    except EOFError:
        break

for customer in sorted(purchases.keys()):
    print(customer + ':')
    sorted_products = sorted(purchases[customer].items(), key=lambda x: x[0])
    for product, quantity in sorted_products:
        print(product, quantity)
