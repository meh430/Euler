import math

listOfPowers = []
for i in range(2, 101):
    for j in range(2, 101):
        if math.pow(i, j) not in listOfPowers:
            listOfPowers.append(math.pow(i, j))

print(len(listOfPowers))
