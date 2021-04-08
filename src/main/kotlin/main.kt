import kotlinx.coroutines.*
import javax.xml.bind.JAXBElement

val tiempoDormir = 1000L

fun main() {

    println("Hola")

    //var result = GlobalScope.launch{
        repeat (10){
            if(it%5 == 0){
               println("Sigo Vivo")
            }
            println(it)
            //delay(tiempoDormir)
        }
    //}
    //result.await()
    //GlobalScope.launch {
        println("He terminado")
    //}

}

