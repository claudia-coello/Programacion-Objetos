EJERCICIO #1
Manejo de ArrayList en Java Tema:
Gestión de precios de casas y departamentos usando colecciones en Java.
Objetivo:
Aplicar el uso de ArrayList, ciclos, métodos y estructuras de control mediante la construcción de un programa con menú interactivo en consola.
Enunciado de la Actividad
Desarrolle un programa en Java y Modelar UML que permita gestionar los precios de casas y departamentos. Para ello, realice lo siguiente:
1. Estructura de Datos
◦ Utilice un ArrayList<Double> para almacenar los precios ingresados por el usuario.
2. Menú Principal
El sistema debe presentar un menú en consola con las siguientes opciones:
===== MENÚ DE PRECIOS INMOBILIARIOS =====
1. Ingresar precio
2. Mostrar todos los precios
3. Mostrar precio más alto
4. Mostrar precio más bajo
5. Mostrar precio iguales
6. Buscar un precio específico
7. Salir
Seleccione una opción:


    3. Funcionalidades a implementar

Opción 1: Ingresar precio
◦ Solicitar al usuario un valor numérico (double).
◦ Agregar el valor al ArrayList.
◦ Validar que sea un número mayor que cero.


Opción 2: Mostrar todos los precios
◦ Mostrar cada precio almacenado.
◦ Si no hay precios, mostrar el mensaje: "No existen precios registrados."


Opción 3: Mostrar el precio más alto
◦ Recorrer el ArrayList para obtener el valor máximo.
◦ Mostrar el resultado.
◦ ​
Opción 4: Mostrar el precio más bajo
◦ Recorrer el ArrayList para obtener el valor mínimo.
◦ Mostrar el resultado.




Opción 5: Mostrar el precio iguales
◦ Recorrer el ArrayList para obtener el valor igual.
◦ Mostrar el resultado.


Opción 6: Buscar un precio
◦ Pedir un precio al usuario.
◦ Verificar si ese precio existe en el ArrayList usando contains.
◦ Mostrar un mensaje indicando si se encontró o no.

Opción 7: Salir
◦ Finaliza el programa.


Indicaciones
1. Crear una clase principal llamada GestionPrecios.
2. Declarar un ArrayList<Double> para almacenar los precios.
3. Implementar un menú repetitivo usando while o do-while.
4. Usar Scanner para ingresar datos.
5. Validar que los precios ingresados sean positivos.
6. Utilizar métodos para organizar mejor el código (opcional):
◦ ingresarPrecio()
◦ mostrarPrecios()
◦ precioMasAlto()
◦ precioMasBajo()
◦ precioIguales()
◦ buscarPrecio()
7. Probar el programa ingresando al menos 5 precios distintos.
![img.png](img.png)
![img_1.png](img_1.png)
![img_2.png](img_2.png)
![img_3.png](img_3.png)
![img_4.png](img_4.png)
![img_5.png](img_5.png)
![img_6.png](img_6.png)
![img_7.png](img_7.png)

EJERCICIO #2
Sistema de Registro de Olimpiadas
Desarrolle un programa en Java que permita registrar información básica sobre unas Olimpiadas, sus eventos y los participantes. El objetivo es aplicar conceptos fundamentales de la Programación Orientada a Objetos, tales como clases, herencia, polimorfismo, manejo de listas (ArrayList) y
excepciones personalizadas.
Objetivo General
Modelar un sistema UML de gestión de Olimpiadas, permitiendo registrar participantes, eventos y la información principal de la olimpiada, utilizando herencia y polimorfismo para distinguir entre los tipos de participantes.
Requerimientos Generales
1. Crear una clase abstracta 'Participante' con atributos base y un método abstracto.
2. Crear clases hijas 'Atleta' y 'Equipo' que hereden de Participante.
3. Implementar la clase 'Evento' para registrar participantes.
4. Implementar la clase 'Olimpiada' para almacenar información general y sus eventos.
5. Aplicar polimorfismo mostrando el tipo de participante mediante sobrescritura de métodos.
6. Utilizar excepciones personalizadas para validar datos insuficientes o incorrectos.
7. Gestionar toda la información utilizando listas dinámicas (ArrayList).
8. Crear un menú principal que permita registrar y consultar información.
Diagrama UML (Descripción)
El sistema debe incluir un conjunto de clases que se relacionan mediante herencia y composición. El diagrama UML debe mostrar:

        ◦ Una clase abstracta Participante.
        ◦ Clases hijas Atleta y Equipo.
        ◦ La clase Evento, que contiene una lista de participantes.
        ◦ La clase Olimpiada, que contiene una lista de eventos.

![img_8.png](img_8.png)\n
![img_9.png](img_9.png)\n
![img_10.png](img_10.png)\n
![img_11.png](img_11.png)\n
![img_12.png](img_12.png)\n
Subir el Git Hub Readme detalle del trabajo realizado, Enunciado,captura de código y resultados.
