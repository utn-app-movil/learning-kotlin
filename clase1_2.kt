
fun main(args:Array<String>){

    print("Digite un numero ")
    var valor1 = readLine()?.toInt() as Int

    print("Digite otro numero ")
    var valor2 = readLine()?.toInt() as Int

    if (valor1 == valor2){
        println("Los números son iguales ")
    }else{
        println("Los números son diferentes")
    }

    println("Los números son ${if (valor1== valor2) "iguales" else "diferentes"}")

    when(valor1){
        1 -> println("valor = 1")
        2 -> println("valor = 2")
        3, 4 -> println("valor entre 3 y 4")
        else ->{
            println("ni 1 ni 2 ni 3 ni 4")
        }
    }

    val numeros = listOf<Int>(11, 12, 13, 14, 15)
    when (valor2){
        in 1..10 -> println("Valor2 entre 1 a 10")
        in numeros -> println("Valor2 dentro de la lista")
        !in 16..20 -> println("Valor2 no pertenece al rango")
        else -> println("Ninguna de las anteriores")
    }
}