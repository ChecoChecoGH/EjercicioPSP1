import kotlinx.coroutines.*

const val tiempoDormir = 1000L

fun main() {
    runBlocking {
        this.launch {
            funAsync()
            println("He terminado funAsync1")
        }
        this.launch {
            funAsync2()
            println("He terminado funAsync2")
        }
    }
}

private suspend fun funAsync(){
    val result = GlobalScope.async{
        repeat (10){
            println(it+1)
            delay(tiempoDormir)
        }
    }
    result.await()
}

private suspend fun funAsync2(){
    val result = GlobalScope.async{
        for (it in 1..2){
            delay(tiempoDormir*5)
            println("Sigo Vivo")
        }
    }
    result.await()
}

