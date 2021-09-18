import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args:Array<String>){

<<<<<<< HEAD
    println("Mi primera corrida con Kotlin (Hil)")
=======
    println("Mi primera corrida con Kotlin con cambio para git")
>>>>>>> dfb3c22450f4db13bd5d2e775d16c2e591a01796
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
    var num = readLine()?.toInt() as Int

    print("Digite una palabra")
    var palabra = readLine() as String

    println("Los valores digitados fueron: $num y $palabra")
}