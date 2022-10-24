fun main(args: Array<String>) {


    //Creacion del Map
    val paises: Map<String,Int> = mapOf(Pair("Argentina", 40000000),
        Pair("España", 46000000),
        Pair("Jamaica", 2973462),
        Pair("Canada", 38000000),
        Pair("Brasil", 213993441),
        Pair("Uruguay", 3400000))

    //Inicializamos el bucle
    do {
        println("Pulse para saleccionar lo que desea hacer \n" +
                "1) Imprimir elementos \n" +
                "2) Cantidad de elementos\n" +
                "3) Cantidad de habitantes de España y Brasil\n" +
                "4) Total de habitantes\n" +
                "0) Cerrar Aplicacion ")
        var seleccion= readLine()!!.toInt();
        //Creamos Variable suma
        var suma =0
        //Almacenamos en la variable suma el valor del map mediante el forEach
        paises.forEach {   suma += it.value }
        when(seleccion){
            0 -> println("Aplicacion cerrada");
            1 ->  println("Listado completo del Map $paises");
            2 ->println("Tamaño del Map ${paises.size}");
            3 -> println("Habitante Brasil ${paises.get("Brasil")}  Habitante España  ${paises.get("España")}");
            4 ->  println("La cantidad de habitantes es $suma")
            else -> println("Fallo al introducir datos")
        }
    }while (seleccion != 0)
//Cerramos Aplicacion



}