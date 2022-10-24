package Inferfaces

interface myInterface_persona {
    val tipoPersona:String
    fun imprimirDatos()
     fun saludar()   {

    class Persona(override val tipoPersona:String, var nombre:String, var apellido:String):myInterface_persona{
    override fun imprimirDatos() {
        println()

    }
}

  class Empleado(var nombre:String,override var tipoPersona: String):myInterface_persona{
var _salario:Float?=0f
    set(value) {

        if ()
    }

  }
    }

}