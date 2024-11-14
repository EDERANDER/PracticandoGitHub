
# Proyecto de Ejemplo: Operaciones Matemáticas Básicas en Python

Este proyecto contiene código en Python para realizar operaciones matemáticas sencillas, como suma y multiplicación. También incluye una función principal (`main`) que permite al usuario interactuar con el programa ingresando números para ver el resultado de su suma.

## Contenido del Código

### Función `sumar`

Esta función realiza la suma de dos números y muestra el resultado en pantalla junto con un mensaje.

```python
def sumar(a, b):
    cantidad = 7
    print(a + b)
    print("Esta suma es muy facil")
```

- **Parámetros**:
  - `a` (int): Primer número a sumar.
  - `b` (int): Segundo número a sumar.
  
- **Descripción**: La función imprime el resultado de la suma de `a` y `b`, además de un mensaje.

- **Nota**: La variable `cantidad` se define pero no se utiliza en el cálculo.

#### Ejemplo de uso:
```python
sumar(5, 6)  # Salida: 11
             # Esta suma es muy facil
```

### Función `multiplicar`

La función `multiplicar` toma dos números y devuelve su producto sin imprimir el resultado en pantalla.

```python
def multiplicar(a, b):
    return a * b
```

- **Parámetros**:
  - `a` (int): Primer número.
  - `b` (int): Segundo número.
  
- **Descripción**: Retorna el producto de `a` y `b` sin mostrar nada en pantalla.

#### Ejemplo de uso:
```python
resultado = multiplicar(3, 5)  # resultado = 15
```

### Función Principal `main`

La función `main` es el punto de entrada del programa. Solicita al usuario ingresar dos números, luego llama a la función `sumar` para mostrar el resultado en pantalla.

```python
def main():
    numero1 = int(input("Ingrese numero 1:"))
    numero2 = int(input("Ingrese numero 2:"))
    obj = sumar(numero1, numero2)
    print(obj)
```

- **Descripción**: 
  - Pide al usuario que ingrese dos números y ejecuta la función `sumar` con estos valores.
  - La variable `obj` almacena el valor retornado por `sumar`, que es `None`, ya que `sumar` solo imprime el resultado sin retornarlo.

#### Ejemplo de Ejecución:
```
Ingrese numero 1: 5
Ingrese numero 2: 6
# Salida: 11
# Esta suma es muy facil
None
```

## Ejecución del Programa

Para ejecutar el programa, simplemente abre el archivo en tu entorno de Python y ejecuta el archivo. La función `main()` solicitará dos números al usuario e imprimirá el resultado de su suma.

