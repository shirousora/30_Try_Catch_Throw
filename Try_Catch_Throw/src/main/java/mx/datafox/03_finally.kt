package mx.datafox

import java.lang.Exception

fun main() {
    var noNumeros = false
    var noValor = false
    val prueba = readLine()
    try {
        println(prueba?.toInt())
    } catch (e: Exception) {

        println("Ha ocurrido un error: \n ${ e.localizedMessage }")
    } finally {
        if(noNumeros){
            println("favor de ingresar unnumero")
            ruta1()
        }else {
            println("favor de no dejar en blanco")
            ruta2()
        }

    }
    println("aqui sigue")
}

fun ruta2() {
    TODO("Not yet implemented")
}

fun ruta1() {
    TODO("Not yet implemented")
}
