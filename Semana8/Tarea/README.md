ACTIVIDAD – Sistema de Registro de Juegos
Indicaciones Generales
Desarrolle un programa en Java que permita registrar información sobre juegos de Mario
Bros y juegos de Carreras de Vehículos.
El objetivo es aplicar herencia, polimorfismo, excepciones personalizadas y manejo de
listas (ArrayList) mediante un menú interactivo.
Requerimientos
1. Crear una clase abstracta llamada Juego con atributos base y un método abstracto.
2. Crear las clases hijas MarioBros y CarreraVehiculos que hereden de Juego.
3. Implementar una excepción personalizada para validar datos incorrectos.
4. Gestionar los juegos dentro de un ArrayList<Juego>.
5. Implementar un menú en consola que permita registrar y consultar juegos.
6. Aplicar polimorfismo al mostrar los detalles de cada juego.
7. Validar datos ingresados por el usuario (números positivos, texto no vacío, etc.).
8. Probar el sistema ingresando al menos cinco juegos de ambos tipos.
Modelo UML Requerido
El estudiante debe generar un diagrama UML que incluya:
• La clase abstracta Juego
• Las clases hijas MarioBros y CarreraVehiculos
• La clase Main que controla el menú
• Relaciones de herencia y uso
• Atributos y métodos principales
Resultados Esperados
Al finalizar la actividad, el estudiante debe entregar:
1. Programa funcional en Java
Capaz de:
• Registrar juegos de Mario y juegos de carreras

• Mostrar todos los juegos registrados

• Buscar juegos por nombre

• Filtrar por tipo de juego

• Detectar y manejar errores mediante excepciones personalizadas

• Aplicar correctamente polimorfismo al mostrar los detalles de cada juego

3. Diagrama UML completo
Debe reflejar:

• Herencia

• Clases hijas

• Métodos sobrescritos

• Relaciones entre clases



<img width="497" height="414" alt="image" src="https://github.com/user-attachments/assets/a4649fc5-5344-4bcb-98fd-a32f5b78ec2d" />

<img width="346" height="320" alt="imagen" src="https://github.com/user-attachments/assets/5c934bfc-cddd-4e58-a88e-4975d8fe2dbf" />

<img width="349" height="507" alt="imagen" src="https://github.com/user-attachments/assets/c262f00b-09e4-4ee1-8121-54fdb8e399d3" />

<img width="415" height="556" alt="imagen" src="https://github.com/user-attachments/assets/28d393fc-f294-4077-91d8-4a5ef705e4f6" />

<img width="517" height="447" alt="imagen" src="https://github.com/user-attachments/assets/3061ac25-9dfe-41f7-8a62-b31f0e3602b5" />

<img width="424" height="582" alt="imagen" src="https://github.com/user-attachments/assets/9ed85f3e-d21e-4dce-8598-5e862324b445" />

<img width="343" height="466" alt="imagen" src="https://github.com/user-attachments/assets/24e59a01-e8ff-48e4-aac2-4a97a75031e1" />

<img width="283" height="533" alt="imagen" src="https://github.com/user-attachments/assets/4fa8d21b-9db1-48d9-bc68-5d6049de2c4e" />

<img width="366" height="393" alt="imagen" src="https://github.com/user-attachments/assets/5b917816-1e13-4218-9a52-a235575614a1" />

<img width="432" height="289" alt="imagen" src="https://github.com/user-attachments/assets/550b23bb-a2c4-4d0d-bd4c-9bfe6e1db65e" />

<img width="323" height="583" alt="imagen" src="https://github.com/user-attachments/assets/74a74e5f-f1c9-4428-8f96-cbb22911a6ce" />

ENUNCIADO DEL EJERCICIO
ENUNCIADO:
Desarrollar un programa en Java que simule el registro y funcionamiento de diferentes
dispositivos electrónicos.
Debe aplicarse: encapsulamiento, herencia, polimorfismo, sobrescritura, manejo de
listas y excepciones personalizadas.
Requerimientos del programa
1. Crear una clase padre llamada Dispositivo con atributos privados (marca, modelo,
precio).
2. Implementar getters y setters para aplicar encapsulamiento, validando datos
incorrectos.
3. Crear dos clases hijas:
o Laptop
o Telefono
Ambas deben heredar de Dispositivo.
4. La clase padre debe incluir un método mostrarInfo() que luego será sobrescrito en
cada clase hija para demostrar polimorfismo.
5. Crear una excepción personalizada llamada DatoInvalidoException, la cual debe
lanzarse cuando se ingrese un precio negativo o una marca vacía.
6. En el método main, crear un ArrayList de tipo Dispositivo, registrar objetos de
tipo Laptop y Telefono, y mostrar la información usando polimorfismo.
7. Capturar excepciones con try–catch cuando se creen dispositivos con datos inválido
Evidencia en GitHub

• Carpeta del proyecto

• README que explique el trabajo

• Capturas del código y de la ejecución en consola

<img width="562" height="404" alt="image" src="https://github.com/user-attachments/assets/c5924c56-6f67-4b23-b263-3b7d80e01019" />
