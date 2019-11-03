num1 = 1
num2 = 2
sum = 0
sumev = 0
for i in range(0, 100):
    sum = num1 + num2
    num2 = sum
    num1 = num2
    if(num1%2==0):
        sumev = sumev + num1
    
    if(sum > 4000000):
        break

print(num1)
print(sumev)
    