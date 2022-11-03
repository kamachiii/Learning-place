import numbers


list1 = []
num1 = int(input("Enter list value to be entered: "))
for i in range(num1):
    numbers1 = int(input("Numbers in first list: "))
    list1.append(numbers1)

list2 = []
num2 = int(input("Enter list value to be entered: "))
for i in range(num2):
    numbers2 = int(input("Numbers in second list: "))
    list1.append(numbers2)

union = list(set().union(list1,list2))
print("The union of two sets are: ", union)
