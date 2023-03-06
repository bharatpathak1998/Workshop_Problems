num = 65

for i in range(2):
    for j in range(26):
        print(chr(num), end="  ")
        num += 1
        if num == 91:
            num = num + 6
        if num == 123:
            break
    print()
