import kotlin.random.Random

fun main() {

    var cara = 0;
    var sello = 0;

    for (i in 1..20){
        val resultado = Random.nextInt(2)
        if (resultado==1){
            cara++
        }
        else{
            sello++
        }
    }
    println("cara: $cara")
    println("sello: $sello")
}