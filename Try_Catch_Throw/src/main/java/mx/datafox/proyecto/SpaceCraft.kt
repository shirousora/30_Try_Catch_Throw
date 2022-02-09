package mx.datafox.proyecto

import mx.datafox.proyecto.exceptions.*

class SpaceCraft {
    private var isConnectionAvailable: Boolean = false

    private var isEngineInOrder: Boolean = false

    private var fuel: Int = 0

    var isInSpace: Boolean = false

    private var landingTerrainOk: Boolean = false

    private var laserAntiExtraterrestre: Int = 0

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


        if (laserAntiExtraterrestre<5){
            throw LaserIsEmptyException()
        }



        if(!landingTerrainOk){
            throw LandingFailedException()
        }
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

    fun fixLaser(){
        laserAntiExtraterrestre = 5
        sendMessageToEarth("Laser recargado")
        for (i in 1..5){
            sendMessageToEarth("¡Disparos lanzados $i!")
        }
        sendMessageToEarth("Escapamos!")
    }

    fun fixLanding(){
        landingTerrainOk = true
        sendMessageToEarth("adaptandose a terreno para aterrizar")
    }

    fun land() {
        sendMessageToEarth("Aterrizando...")
        isInSpace = false
    }



    fun sendMessageToEarth(message: String) = println("Nave espacial a la tierra: $message")
}