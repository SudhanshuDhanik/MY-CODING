# Write a function calculate_total that takes a base price and variable-length keyword 
# arguments representing additional charges (e.g., tax, shipping). Calculate and return the 
# total price. The function should be able to handle any number of additional charges.

def calculate_total(base_price, **additional_charges):
    total_price = base_price

    for charge, amount in additional_charges.items():
        total_price += amount

    return total_price

# Example usage:
base_price = 1000
tax = 0.08 * base_price
shipping = 50
discount = -100

total_price = calculate_total(base_price, tax=tax, shipping=shipping, discount=discount)

print(f"The total price is: ${total_price}")
