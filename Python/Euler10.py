n = 2000000
primes = [False]*(n+1)
for i in range(0, len(primes)):
    primes[i] = True

a = 2
while((a*a)<=n):
    if(primes[a]):
        for b in range(a*2, n+1, a):
            primes[b] = False
    a = a + 1

sum = 0

for j in range(2, len(primes)):
    if(primes[j]):
        print("{} + ".format(j))
        sum = sum + j

print(sum)