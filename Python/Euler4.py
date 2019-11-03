def check_palin(num):
    rev = num[::-1]
    if(rev==num):
        return True    
    return False

print("hello")
possible = 0
for i in range(900, 1000):
    for j in range(999, 899, -1):
        possible = i*j
        if(check_palin(str(possible))):
            print("{}, {}, {}".format(possible, i, j))