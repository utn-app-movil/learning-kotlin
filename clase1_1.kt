import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args:Array<String>){

    println("Mi primera corrida con Kotlin con cambio para Git")
    println("-------------------------\n")

    //Variables
    var resultado: Int
    var entero= 34
    var logico: Boolean
    logico= false

    //constante
    val pi = 3.14

    println("El valor de pi es: $pi")
    println("La multiplicacion $pi * $entero = ${pi*entero}")


    print("Danny")
    print("Henry")

    print("Digite un número")

    var num = readLine()?.toInt() as Int

    print("Digite una palabra")
    var palabra = readLine() as String

    println("Los valores digitados fueron: $num y $palabra")
}