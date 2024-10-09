# Practica8 - Documentación del Código

Este proyecto implementa un sistema de geometría para manejar polígonos y un sistema musical para manejar instrumentos de viento en Java. Se utilizan conceptos de programación orientada a objetos, como herencia, interfaces y encapsulación.

## Índice

1. [Descripción General](#descripción-general)
2. [Clases y Interfaces](#clases-y-interfaces)
   - [Poligono](#poligono)
   - [Triangulo](#triangulo)
   - [Cuadrilatero](#cuadrilatero)
   - [InstrumentoMusical](#instrumentomusical)
   - [InstrumentoDeViento](#instrumentodeviento)
   - [Flauta](#flauta)
   - [Meses](#meses)

## Descripción General

Este proyecto tiene como objetivo demostrar el uso de herencia y polimorfismo en Java al modelar diferentes tipos de polígonos (triángulos y cuadriláteros) y un sistema para manejar instrumentos musicales de viento. Cada clase tiene métodos para calcular el área y el perímetro de las figuras, así como para tocar y afinar los instrumentos.

## Clases y Interfaces

### Poligono

La clase `Poligono` representa la clase base para todos los polígonos.

#### Métodos

- `public float area()`: Devuelve el área del polígono, por defecto 0.0.
- `public float perimetro()`: Devuelve el perímetro del polígono, por defecto 0.0.
- `@Override public String toString()`: Devuelve una representación en cadena del polígono.

### Triangulo

La clase `Triangulo` hereda de `Poligono` y representa un triángulo con atributos específicos.

#### Atributos

- `int alfa, beta, gamma`: Ángulos del triángulo.
- `float a, b, c`: Longitudes de los lados.
- `float base, altura`: Base y altura del triángulo.

#### Métodos

- `public float area()`: Calcula el área del triángulo como `(base * altura) / 2`.
- `public float perimetro()`: Calcula el perímetro sumando las longitudes de los lados `a`, `b` y `c`.
- `@Override public String toString()`: Devuelve una representación en cadena del triángulo.

### Cuadrilatero

La clase `Cuadrilatero` hereda de `Poligono` y representa un cuadrilátero.

#### Atributos

- `int alfa, beta, gamma`: Ángulos del cuadrilátero.
- `float a, b`: Longitudes de dos lados.
- `float base, altura`: Base y altura del cuadrilátero.

#### Métodos

- `public float area()`: Calcula el área del cuadrilátero como `base * altura`.
- `public float perimetro()`: Calcula el perímetro sumando las longitudes de los lados `a` y `b`.
- `@Override public String toString()`: Devuelve una representación en cadena del cuadrilátero.

### InstrumentoMusical

La interfaz `InstrumentoMusical` define los métodos que deben implementarse en los instrumentos musicales.

#### Métodos

- `void tocar()`: Método para tocar el instrumento.
- `String tipoDeInstrumento()`: Método que devuelve el tipo de instrumento.
- `void afinar()`: Método para afinar el instrumento.

### InstrumentoDeViento

La clase `InstrumentoDeViento` implementa la interfaz `InstrumentoMusical` y representa un instrumento musical de viento.

#### Métodos

- `@Override public void tocar()`: Imprime un mensaje indicando que se está tocando un instrumento musical.
- `@Override public String tipoDeInstrumento()`: Devuelve el tipo de instrumento como "Instrumento de Viento".
- `@Override public void afinar()`: Imprime un mensaje indicando que se está afinando el instrumento de viento.
- `@Override public String toString()`: Devuelve una representación en cadena del instrumento de viento.

### Flauta

La clase `Flauta` hereda de `InstrumentoDeViento` y representa una flauta específica.

#### Métodos

- `@Override public void tocar()`: Imprime un mensaje indicando que se está tocando la flauta.
- `@Override public void afinar()`: Imprime un mensaje indicando que se está afinando la flauta.
- `@Override public String tipoDeInstrumento()`: Devuelve el tipo de instrumento como "Flauta".
- `@Override public String toString()`: Devuelve una representación en cadena de la flauta.

### Meses

La interfaz `Meses` define constantes y un array con los nombres de los meses.

#### Constantes

- `int UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, DIEZ, ONCE, DOCE`: Constantes que representan los números de los meses.
- `String[] MESES`: Array que contiene los nombres de los meses.

## Ejecución del Programa

El programa crea instancias de polígonos (triángulos y cuadriláteros) y utiliza los métodos definidos para calcular el área, el perímetro y la identificación de las figuras. Además, se crean instancias de instrumentos musicales, específicamente una flauta, y se llaman a sus métodos para tocar, afinar y mostrar el tipo de instrumento.
