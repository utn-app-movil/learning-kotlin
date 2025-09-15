fun main() {
    var p = persona("Ever", "Barahona", "Mendoza")
    println(p.nombre_completo)
}


class persona {
    private var _nombre:String =""
    private var _Apellido1:String =""
    private var _Apellido2:String =""

    constructor()

    constructor(nombre:String, apellido1:String, apellido2:String){
        this._nombre=nombre
        this._Apellido1=apellido1
        this._Apellido2=apellido2
    }

    var nombre: String
        get()= this._nombre
        set(value) {this._nombre = value}

    var apellido1: String
        get()= this._Apellido1
        set(value) {this._Apellido1 = value}

    var apellido2: String
        get()= this._Apellido2
        set(value) {this._Apellido2 = value}

    val nombre_completo: String
        get()= "$_nombre $_Apellido1 $_Apellido2"
}