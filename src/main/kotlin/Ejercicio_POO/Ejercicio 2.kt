fun main(args: Array<String>) {


class cPersona (vnombre: String, vedad:Int){
    var nombre: String = vnombre
    var edad:Int = vedad

    init {
        if (nombre.isEmpty() || nombre.isBlank()) nombre = "Nombre vacio" else nombre.uppercase()
        if (edad < 0 || edad > 120) edad = 0
    }

    fun imprimir()=when(edad){

        in 0 .. 17 -> "$nombre Persona menor de edad"
        in 17 .. 29 -> "$nombre Persona joven"

        else -> {"persona adulta"}
    }
}

class  cTriangulo(var lado1:Int ,var lado2:Int,var lado3:Int)



}