package mx.datafox

fun main() {
    /*
    Leer de la consola un dato y convertirlo en un número
    Si es posible, multiplicarlo por 5 e imprimirlo
    Si ocurre una excepción, atraparla e imprimir un mensaje explicativo
     */

    println("Favor de ingresar un número")
    val entrada = readLine()
    try {
        val numero = entrada?.toInt()
        println("$numero * 5 = ${ numero?.times(5) }")
    } catch (e: Exception) {
        println("El valor '$entrada' no es un número")
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
        val distanciaKm = kilometros?.toDouble()
        println("$distanciaKm km es igual a ${ distanciaKm?.times(0.62) } millas")
    } catch (e: Exception) {
        println("No se puede leer la distancia")
        e.stackTrace
    }

    /*
    Un cliente le dice al programa que producto quiere comprar
    después le dice cuántos productos quiere
    Si el precio es de 14.99
    ¿Cuál es el total?
    Manejar cualquier excepción que pueda ocurrir
     */

    println("¿Cuál producto quiere comprar?")
    val producto = readLine()
    println("¿Cuántos desea llevar?")
    val cantidad = readLine()
    val precio = 14.99
    var cantidadProductos: Int? = 0
    try {
        cantidadProductos = cantidad?.toInt()
    } catch (e: java.lang.Exception) {
        println("No se puede leer la cantidad")
        e.printStackTrace()
    } finally {
        println("$cantidadProductos $producto tiene un costo de ${ cantidadProductos?.times(precio)}")
        println("Transacción completa")
    }
}