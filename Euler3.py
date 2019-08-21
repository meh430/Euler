import math

def checkPrime(num):
    if num > 2:
        for i in range(2, int(math.sqrt(num))):
            if num % i == 0:
                return False
        return True
    else:
        return True

limit = 600851475143

for i in range(1, limit):
    if checkPrime(i) and limit % i == 0:
        print(i)
