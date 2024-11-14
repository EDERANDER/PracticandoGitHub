def sumar(a,b):
    cantidad = 7
    print(a+b)
    print("Esta suma es muy facil")
sumar(5,6)

def multiplicar(a,b):
    return a * b
multiplicar(3,5)
       
def main():
    numero1 = int(input("Ingrese numero 1:"))
    numero2 = int(input("Ingrese numero 2:"))
    obj = sumar(numero1 ,numero2)
    print(obj)
main()