import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.*
import kotlinx.coroutines.launch

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    println("Main program starts: ${Thread.currentThread().name}")

    GlobalScope.launch {
        println("Fake work starts: ${Thread.currentThread().name}")
        delay(1000)
        println("Fake work finish: ${Thread.currentThread().name}")
    }
    Thread.sleep(3000)
    println("Main program ends: ${Thread.currentThread().name}")
}