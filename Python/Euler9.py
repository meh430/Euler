c = 0
for a in range(3, 501, 3):
    for b in range(4, 501, 4):
        c = 1000 - (a+b)
        if((a*a)+(b*b)==c*c):
            print("a:{}, b:{}, c:{}".format(a, b, c))
            print(a*b*c)