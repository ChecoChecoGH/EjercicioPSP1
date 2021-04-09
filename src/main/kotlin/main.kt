import kotlinx.coroutines.*

const val tiempoDormir = 1000L

fun main() {
    runBlocking {
        this.launch {
            repeat (10){
                println(it+1)
                delay(tiempoDormir)
            }
        }
        this.launch {
            for (it in 1..2){
                delay(tiempoDormir*5)
                println("Sigo Vivo")
            }
        }
    }
    println("He terminado el runBlocking")
}

