package basics

fun main() {
    //Leer desde el teclado: readLine()
    print("Introduce tu nombre")
    val nombre = readLine()
    println("Bienvenido, $nombre")//String templates
    println("Bienvenido, $nombre, buenos dias")//String templates
    println("Tu nombre tiene ${nombre?.length} caracteres")

    // \n \t \" \'

    // Raw strings
    val cadena = """ 
        Aqui puedo escribir lo que quiera no hace falta 
        que escriba caracteres de escape """.trimIndent()//quita tabulaciones
    println(cadena)

    val cadena1 = """ 
        |Aqui puedo escribir lo que quiera no hace falta 
        |que escriba caracteres de escape """.trimMargin()//quita margen
    println(cadena1)

    //Arrays
    val coches = arrayOf("Renault", "Ferrari", "Aston Martin", "Porsche")
    val coches2 = arrayOf<String>("Renault", "Ferrari", "Aston Martin", "Porsche")
    //Declaracion array INT
    val numero = intArrayOf(1,2,3,4)
    //Acceso a un valor
    println(coches[1])
    println(coches.get(1))
    //Modificar un valor
    coches[0] = "BMW"
    coches.set(0, "BMW")
    //Mostrar una posicion del array
    println("Coches[1]=${coches[1]}")
    println("Coches[1]=${coches.get(1)}")
    //Mostrar el tamaño o longitud del array
    println(coches2.size)
    numero[2] = numero[0] + numero[1]
    println(numero[2])
    //Crea un array con 4 valores inicializados a 0
    val array = IntArray(4)
    //Inicializar con otros valores
    val array2 = IntArray(4){2}
    //println("array")
    //println(array2)

    val arr2 = IntArray(5)
    arr2[0] = 21
    arr2[0] = 10
    arr2[0] = 8
    arr2[0] = 18
    arr2[0] = 56

    val arr3 = IntArray(5) { 42 }
}