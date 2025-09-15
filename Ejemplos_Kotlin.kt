fun main() { 
    var texto: String
    var otrotexto: String
 
    //Concatenación
    texto = "Ever Barahona"
    otrotexto = "El nuevo texto agredado es $texto"
    println(otrotexto)
    
   /* var numero: Int = 9
    when (numero){
        1 -> println("El número es un uno") 
        in 2..6 -> println("El número es entre 2 a 6")
        7, 8 -> println("El número es siete u ocho")
        else -> println("El número es diferente entre 1 a 8")
    }*/
    
    //val numList = listOf<Int> (1,2,3,4,5,6)
    //imprimir(numList)
    
    /*var num1: Int = 26
    var num2: Int = 3
    println ("El resultado de la suma ${sumar(num1, num2)}")
    println ("El resultado de la suma2 ${sumar2(num1, num2)}")*/
    
        
    var student = EStudent("ABC-01", "Ever", "Barahona Mendoza", 88888, "ebarahona@utn.ac.cr")
    println("El id del estudiante es ${student.Id}")
    println("El id del estudiante es ${student.FullName}")
    
    student.Name = "Juan"
    student.LastName = "Barrantes Garcia"
    println("El id del estudiante es ${student.FullName}")
}

fun imprimir (numeros: List<Int>){
    for (item in numeros){
        println(item)
    }
}

fun sumar (num1: Int, num2: Int): Int {
    return num1 + num2
}

fun sumar2 (num1: Int, num2: Int) = num1 + num2    


class EStudent {
    private var _id: String = ""
    private var _name: String = ""
    private var _lastName: String = ""
    private var _phone:Int = 0
    private var _email: String = ""
    
    constructor()
    
    constructor(id: String, name: String, lastName: String, phone: Int, email: String){
        this._id=id
        this._name=name
        this._lastName=lastName
        this._phone=phone
        this._email=email        
    }
    
    var Id: String
    	get() = this._id
    	set(value) {this._id = value}
        
    var Name: String
    	get() = this._name
    	set(value) {this._name = value}
        
    var LastName: String
    	get() = this._lastName
    	set(value) {this._lastName = value}
        
    var FullName: String = ""
    	get() = this._name + " " + this._lastName
        
    var Phone: Int
    	get() = this._phone
    	set(value) {this._phone = value}
        
	var Email: String
    	get() = this._email
    	set(value) {this._email = value}
}
