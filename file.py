def sumar(a, b):
    return a + b


mi_lista = [1, 2, 3, 4]

for num in mi_lista:
    pass
    # print(num)

contador = 0
while contador < 10:
    # print('Funcionando')
    contador += 1

### [1,2,3]
def doble(lista):
    lista2 = []
    for elemento in lista:
        lista2.append(elemento * 2)
    return lista2


# print(doble(mi_lista))
# print([x*2 for x in mi_lista])

lista_de_listas = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

# print([y*2 for y in [max(x) for x in lista_de_listas]])

a = 3
b = "abc"
b = 4
print(a + b)

eleccion = input("Ingresa tu nombre: ")
print(f'Hola {eleccion}!')