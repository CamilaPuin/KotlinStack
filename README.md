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

Instalación de Kotlin en macOS (en la terminal)
1. Verificar Homebrew
    brew --version

    Si no está instalado:
    /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

2. Instalar Kotlin
    brew install kotlin

3. Verificar instalación
    kotlin -version
    kotlinc -version

Instalación de Kotlin en Windows

1. Instalar Kotlin:  
Descargar el compilador en [kotlinlang.org](https://kotlinlang.org/docs/command-line.html) y extraer los archivos dentro de `kolinc` en una nueva carpeta con ruta `C:\Kotlin`. Agregar `C:\Kotlin\bin` al `PATH` del sistema.

2. Verificar instalación:  
Abrir PowerShell o CMD y ejecutar:
`kotlinc -version`

3. Compilar y generar JAR ejecutable en vscode: 
Descargar el .zip del proyecto, segurese de tener únicamente la carpeta `KOTLIN STACK` para poder ejecutar lo siguiente
Desde la carpeta raíz del proyecto ejecutar:
`kotlinc src -include-runtime -d bin/main.jar`  
- `src` → carpeta con los archivos `.kt`  
- `-include-runtime` → incluye la librería estándar de Kotlin  
- `-d bin/main.jar` → crea el JAR dentro de la carpeta `bin`

4. Ejecutar el proyecto:  
Forma 1:
Ejecutar `java -jar bin/main.jar` en la consola.
    Los archivos `.class` pueden eliminarse; el JAR funciona de forma independiente.
Forma 2:
Instalar la extensión **Code Runner by Jun Han**.
Abrir settings.json (acceder a el con ctrl+shift+P y dar clic en Preferences:Open User Settings (JSON)) 
Añadir al settings.json:
"[kotlin]": {
        "editor.defaultFormatter": "fwcd.kotlin"
    }
Ejecutar con ctrl+alt+N o con el botón de run
