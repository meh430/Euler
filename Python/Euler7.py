import math
def check_prime(num):
    if(num > 2):
        for i in range(2, int(math.sqrt(num) + 1)):
            if(num%i==0):
                return False
        return True
    else:
        return True

numPrimes = 1
num = 1
while (numPrimes<10001):
    num = num + 2
    if(check_prime(num)):
        numPrimes = numPrimes + 1
    
print(num)