

fun main(args:Array<String>){
    println(saludo("Juan"))
    println(saludo2("Viendo padrinos magicos "))

    var vector = arrayOf(5,4,3,2,1)
    var clrutina = subrutina()

    clrutina.imprimirVector(vector)
}

fun saludo(nombre: String): String{
    return "Hola $nombre cómo está?"
}

fun saludo2(nombre: String)= "Hola $nombre cómo está?"
