# Conversor de Monedas

## Descripción
Este es un programa de consola en Java que permite convertir entre varias monedas utilizando datos obtenidos de una API de conversión de monedas en tiempo real. Los usuarios pueden seleccionar entre varias opciones de conversión y obtener el valor de la moneda seleccionada después de aplicar la tasa de conversión actual. El programa también guarda las conversiones realizadas en formato JSON.

## Características
- Conversión entre diferentes monedas (USD, ARS, BRL, COP).
- Consulta de tasas de conversión en tiempo real usando la API `exchangerate-api.com`.
- Gestión de entradas incorrectas con manejo de excepciones.
- Guarda los resultados de las conversiones en un archivo JSON.

## Estructura de Archivos

El proyecto está dividido en las siguientes clases y archivos, respetando las importaciones:

### `Principal.java`
Este archivo contiene la lógica principal del programa. Muestra un menú de opciones para que el usuario seleccione la conversión deseada, luego solicita un valor a convertir y realiza la operación con los datos obtenidos de la API.

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Código principal del conversor
    }
}
```
### `TazaDeConvercion.java`

Este archivo define la `clase TazaDeConvercion`, que contiene la moneda base y las tasas de conversión. Utiliza un `Map<String, Double>` para almacenar las tasas de conversión correspondientes a cada moneda.

```java
import java.util.Map;

public class TazaDeConvercion {
// Definición de la clase para manejar las tasas de conversión
}
```
### `ConsultaMoneda.java`
Este archivo se encarga de realizar la consulta a la API para obtener las tasas de conversión. Utiliza las bibliotecas `HttpClient` y `Gson` para manejar la respuesta y parsear el JSON recibido.

```java
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.net.http.*;
import java.net.URI;
import java.util.Map;

public class ConsultaMoneda {
    // Lógica para consultar la API de monedas
}
```
### `JsonGuardado.java`
Esta clase se encarga de gestionar el archivo `conversion.json` donde se almacenan las conversiones realizadas. Utiliza `Gson` para convertir los datos de las conversiones a formato JSON y guardarlos en el archivo.

```java
import com.google.gson.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonGuardado {
    public void guardarJson(String monedaBase, double valorOriginal, String monedaSeleccionada, double valorConvertido) {
        // Lógica para guardar las conversiones en JSON
    }
}
```
### Estructura del archivo `conversion.json`
El archivo `conversion.json` almacena cada conversión en formato JSON. Un ejemplo del formato de este archivo podría verse así:

```java
[
{
"monedaBase": "USD",
"valorIngresado": 100.0,
"MonedaDestino": "ARS",
"valorConvertido": 9800.0
},
{
"monedaBase": "ARS",
"valorIngresado": 5000.0,
"MonedaDestino": "USD",
"valorConvertido": 50.0
}
]
```
Cada conversión incluye:

    monedaBase: La moneda original (por ejemplo, USD).
    valorIngresado: La cantidad que el usuario desea convertir.
    MonedaDestino: La moneda destino (por ejemplo, ARS).
    valorConvertido: El resultado de la conversión basado en la tasa actual.

Instalación

#### 1) Clona este repositorio: 
`git clone https://github.com/tu-usuario/conversor-monedas.git`

#### 2) Configura tu API key: 
El programa utiliza la API de ExchangeRate API para obtener las tasas de conversión en tiempo real. Asegúrate de reemplazar la API key en la URL dentro del archivo `ConsultaMoneda.java`.

#### 3) Compila y ejecuta el proyecto:
Compilar:
```
javac Principal.java
```
##### Uso

1) El programa mostrará un menú con las opciones de conversión. Selecciona la opción deseada ingresando el número correspondiente.
2) Ingresa el valor que deseas convertir.
3) El programa calculará el valor convertido y lo mostrará en la consola.
4) Si lo deseas, puedes continuar realizando más conversiones o salir del programa seleccionando la opción 7.

#### Ejemplo de salida:

```
*****************************************
Sea bienvenido/a al Conversor de Monedas

1) Dólar => Peso argentino
2) Peso argentino => Dólar
3) Dólar => Real brasileño
4) Real brasileño => Dólar
5) Dólar => Peso colombiano
6) Peso colombiano => Dólar
7) Salir
   Elija una opción válida:
*****************************************

Ingrese el valor que desea convertir:
100
El valor convertido es: 9800.0 ARS
```

[![Ver video](https://img.youtube.com/vi/SvlMlfZrK_U/0.jpg)](https://www.youtube.com/watch?v=SvlMlfZrK_U)

