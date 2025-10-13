# Programacion-Objetos
EJERCICIO 1 Problema: Jugadores de un equipo de fútbol. Cada jugador tiene un nombre, una posición en el campo, una edad y un número de camiseta. Objetivo: Desarrollar una clase en Java llamada Jugador que tenga los atributos y un método para mostrar la información del jugador. Luego, crear tres objetos de esta clase, cada uno representando un jugador diferente.
Realizar EL REGISTRO de los atributos con datos quemados y utilizando Scanner combinar
<img width="1785" height="825" alt="image" src="https://github.com/user-attachments/assets/3fed7ea0-f444-488f-8eb3-e4242b65510f" />

EJERCICIO 2
Problema: Sistema de gestión de empleados en una empresa. Cada empleado tiene un nombre, un cargo, un salario y una fecha de ingreso a la empresa.
Objetivo: Desarrollar una clase en Java llamada Empleado que tenga los atributos mencionados anteriormente y un método para mostrar la información del empleado. Luego, crearemos tres objetos de esta clase, cada uno representando un empleado diferente,
<img width="594" height="849" alt="image" src="https://github.com/user-attachments/assets/3bcef2c0-1de6-4d38-9123-f288fbdd1fb0" />


<------------------------------------------------------------>
Semana 2: Tarea
Práctica 1: Clase Libro
Objetivo: Crear una clase con atributos, constructor y método para mostrar información.
Descripción:
        ◦ Crear la clase Libro con atributos: titulo, autor, anioPublicacion.
        ◦ Crear un constructor.
        ◦ Crear un método mostrarInformacion() que imprima los datos del libro.
        ◦ Crear 2 objetos de tipo Libro y mostrar su información.

Actividad 3: Tipos de Constructores
Un constructor en Java es un método especial que se ejecuta automáticamente al crear un objeto. Sirve para inicializar los atributos de la clase. Existen tres formas comunes de definirlo:
    • Constructor con parámetros
Asigna valores.
    • Constructor sin parámetros con valores directos
Los valores son predeterminados, no recibe parámetros.
    • Constructor vacío
No hace nada, se usa cuando se pondrán los valores mas adelante. Los objetos creados a partir de estos pueden tener parámetros distintos entre si.
      
      Tarea práctica
Objetivo: Comprender y aplicar los tipos de constructores en Java. Indicaciones:
    1. Explica con tus propias palabras qué es un constructor.
Método automático al crear un objeto, este inicializa sus atributos.
    2. Crea una clase llamada Producto con tres atributos: nombre, precio, cantidad.
    3. Implementa los tres tipos de constructores: uno con parámetros, uno con valores fijos, y uno vacío.
    4. Crea tres objetos usando cada tipo de constructor.
    5. Muestra los datos de cada objeto en consola.

Actividad 4: Simulación básica de una cuenta bancaria

Objetivo:
Aplicar los conceptos básicos de Programación Orientada a Objetos (POO) creando una clase con atributos privados, constructor público y tres métodos propios públicos.

Enunciado:
Imagina que estás desarrollando un programa sencillo para un banco. Cada cliente puede abrir una cuenta, consultar su saldo, depositar dinero y retirar dinero.

Tu tarea es crear una clase llamada CuentaBancaria que permita reutilizar la información del cliente y realizar acciones mediante métodos propios.

Requisitos técnicos:
    6. Crear la clase CuentaBancaria con los siguientes atributos privados:
        ◦ nombreTitular (String)
        ◦ saldo (double)
    7. Crear un constructor público que permita inicializar los datos del titular y el saldo inicial.
    8. Implementar los siguientes métodos propios públicos:
        ◦ mostrarInformacion(): Muestra el nombre del titular y el saldo actual.
        ◦ depositar(double monto): Aumenta el saldo.
        ◦ retirar(double monto): Disminuye el saldo si hay suficiente dinero.
    9. En la clase principal (Main):
        ◦ Crear un objeto de tipo CuentaBancaria.
        ◦ Llamar a los tres métodos en orden lógico.
        ◦ Mostrar cómo se reutiliza la información del objeto en cada acción.
          
          ¿Qué acciones realiza el objeto?
El objeto creado a partir de la clase CuentaBancaria puede realizar acciones a través de sus métodos propios. Estas acciones son:
    • mostrarInformacion(): muestra los datos almacenados en el objeto.
    • depositar(): modifica el saldo sumando un monto.
    • retirar(): modifica el saldo restando un monto si hay fondos suficientes.

Estas acciones se ejecutan desde la clase principal usando el objeto. Por ejemplo: CuentaBancaria cuenta1 = new CuentaBancaria("Lucía", 100.0); cuenta1.mostrarInformacion();
cuenta1.depositar(50.0); cuenta1.retirar(30.0);

