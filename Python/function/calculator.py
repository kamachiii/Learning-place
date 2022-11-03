def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multifly(x, y):
    return x * y

def devide(x, y):
    return x / y

print("Select Operation.")
print("1. Add")
print("2. Subtract")
print("3. Multifly")
print("4. Devide")

choice = input("Enter Choice (1/2/3/4) : ")

num1 = int(input("Enter First Number : "))
num2 = int(input("Enter Second Number : "))

if choice == '1':
    print("Result =>",num1,"+",num2,"=", add(num1, num2))

elif choice == '2':
    print("Result =>",num1,"-",num2,"=", subtract(num1, num2))

elif choice == '3':
    print("Result =>",num1,"*",num2,"=", multifly(num1, num2))

elif choice == '4':
    print("Result =>",num1,"/",num2,"=", devide(num1, num2))

else:
    print("Invalid Input")
