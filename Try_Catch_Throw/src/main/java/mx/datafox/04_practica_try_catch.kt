package mx.datafox

fun main() {
    /*
    Leer de la consola un dato y convertirlo en un número
    Si es posible, multiplicarlo por 5 e imprimirlo
    Si ocurre una excepción, atraparla e imprimir un mensaje explicativo
     */

    println("Escriba un numero: ")
    val eNum = readLine()
    try {
        val num = eNum?.toInt()  // para asegurar que el caracter no es null y  el simbolo se utilice como entero.
        val multi = num?.times(5)
        println("$num * 5 = ${multi}")
    } catch (e: Exception) {
        println(" '$eNum' no es tipo número , intente de nuevo por favor")
        e.stackTrace
    }

    /*
    El usuario debe ingresar cuántos kilométros corrió el día de hoy
    Convertir el valor en millas
    Manejar cualquier excepción que pueda ocurrir
    1 kilometro = 0.62 millas
     */

    println("Ingresa la distancia que corriste en kilométros")
    val kilometros = readLine()
    try {
        val kmDouble = kilometros?.toDouble()
        val millas = kmDouble?.times(0.62)
        println("$kilometros km es igual a ${ millas } millas")
    } catch (e: Exception) {
        println("el dato que ingresaste no se puede utilizar para calcular la distancia")
        e.stackTrace
    }

    /*
    Un cliente le dice al programa que producto quiere comprar
    después le dice cuántos productos quiere
    Si el precio es de 14.99
    ¿Cuál es el total?
    Manejar cualquier excepción que pueda ocurrir
     */


    println("Cual producto quiere comprar?")
    val producto = readLine()

    println("Cuantos productos quiere llevar?")
    val cant = readLine()
    val precio = 14.99
    var cantProd: Int? = 0

    try {
        cantProd = cant?.toInt()

    } catch (e: java.lang.Exception) {
        println("No se pudo leer la cantidad")
        e.printStackTrace()
    } finally {
        println("$cantProd $producto tiene un costo de ${ cantProd?.times(precio)}")
    }


}