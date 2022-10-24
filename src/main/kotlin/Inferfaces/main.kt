package Inferfaces

interface main {
    val tipoPersona:String
    fun imprimirDatos()
     fun saludar()   {

    class Persona(override val tipoPersona:String, var nombre:String, var apellido:String):main{
    override fun imprimirDatos() {
        println()

    }
}

  class Empleado(var nombre:String,override var tipoPersona: String):main{
var _salario:Float?=0f
    set(value) {

        if ()
    }
      override fun imprimir() {
          super.imprimir()
      }
  }
    }

}