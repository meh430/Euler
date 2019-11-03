def sum_square():
    sum = 0
    for i in range(1, 101):
        sum = sum + (i*i)
    return sum

def square_sum():
    sum = 0
    squareSum = 0
    for i in range(1, 101):
        sum = sum + i
    
    squareSum = sum * sum
    return squareSum

squareOfSum = square_sum()
sumOfSquare = sum_square()
diff = squareOfSum-sumOfSquare 
print(diff)