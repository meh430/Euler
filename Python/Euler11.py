def get_list(fileName):
    array = [[]*20]*20
    file = open(fileName, "r")
    for i in range(19):
        line = file.readline().split(" ")
        print(line)
        for j in range(19):
            array[i][j] = int(line[j])
    
    return array

print(get_list("e11.txt"))
