package Inferfaces

interface Interface_persona {
    var  x:Int;
    var  y:Int
    fun imprimir(){

class PuntoPlano(override var x:Int,override var y:Int):Interface_persona{
    override fun imprimir() {
        println()

    }
}

  class PuntoEspacio(override var x:Int,override  var y:Int,var z:Int):Interface_persona{

      override fun imprimir() {
          super.imprimir()
      }
  }
    }

}