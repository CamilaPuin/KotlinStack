# KotlinStack

Este proyecto es una implementación de la **estructura de datos Pila (Stack)** en **Kotlin**, con operaciones básicas como push, pop, peek y toString.  
Está pensado para fines educativos y para practicar programación orientada a objetos y estructuras de datos en Kotlin.

## Descripción

El proyecto contiene:

- Clase `Node` para representar cada nodo de la pila.
- Clase `Stack` con las operaciones principales:
  - `push(value: T)`: Agrega un elemento a la pila.
  - `pop(): T?`: Elimina y retorna el elemento superior de la pila.
  - `peek(): T?`: Retorna el elemento superior sin eliminarlo.
  - `isEmpty(): Boolean`: Verifica si la pila está vacía.
- Clase `Book.kt`Para realizar pruebas con otras clases
- Clase `Main.kt` para probar la pila con ejemplos de uso.


## Requisitos

- [Kotlin](https://kotlinlang.org/docs/command-line.html) (instalado en el sistema, con la ruta del bin en el Path de variables de entorno)
- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (para ejecutar Kotlin)
- VS Code con la extensión **Kotlin by fwcd** y **Code Runner by Jun Han** para facilitar la ejecución

## Instalación

Instalación de Kotlin en macOS
1. Verificar Homebrew
    brew --version

Si no está instalado:
    /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

2. Instalar Kotlin
    brew install kotlin

3. Verificar instalación
    kotlin -version
    kotlinc -version




