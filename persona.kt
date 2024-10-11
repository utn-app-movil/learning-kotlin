class persona {
    private var _nombre:String =""
    private var _Apellido:String =""

    constructor()
        
    constructor(nombre:String, apellido:String){
        this._nombre=nombre
        this._Apellido=apellido
    }

    var nombre: String
        get()= this._nombre
        set(value) {this._nombre = value}

    var apellido: String
        get()= this._Apellido
        set(value) {this._Apellido = value}
}

//cambios
