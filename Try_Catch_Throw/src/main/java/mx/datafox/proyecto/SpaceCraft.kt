package mx.datafox.proyecto

import mx.datafox.proyecto.exceptions.BrokenEngineException
import mx.datafox.proyecto.exceptions.OutOfFuelException
import mx.datafox.proyecto.exceptions.SpaceToEarthConnectionFailedException

class SpaceCraft {
    private var isConnectionAvailable: Boolean = false

    private var isEngineInOrder: Boolean = false

    private var fuel: Int = 0

    var isInSpace: Boolean = false

    fun launch() {
        if (fuel < 5) {
            throw OutOfFuelException()
        }

        if (!isEngineInOrder) {
            throw BrokenEngineException()
        }

        if (!isConnectionAvailable) {
            throw SpaceToEarthConnectionFailedException()
        }

        sendMessageToEarth("Intentando el lanzamiento...")
        fuel -= 5
        isInSpace = true
        sendMessageToEarth("¡Estoy en el espacio!")
        sendMessageToEarth("¿Esos son extraterrestres?")
    }

    fun refuel() {
        fuel += 5
        sendMessageToEarth("El depósito de combustible está lleno")
    }

    fun repairEngine() {
        isEngineInOrder = true
        sendMessageToEarth("Los impulsores están en funcionamiento")
    }

    fun fixConnection() {
        isConnectionAvailable = true
        sendMessageToEarth("Tlatelolco, tlatelolco ¿Pueden escucharme?")
        sendMessageToEarth("La conexión se ha establecido")
    }

    fun land() {
        sendMessageToEarth("Aterrizando...")
        isInSpace = false
    }

    fun sendMessageToEarth(message: String) = println("Nave espacial a la tierra: $message")
}