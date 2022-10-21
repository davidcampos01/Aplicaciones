package basics

fun main(){
    val cadena: String = "Hola Buenas Tardes"
    //val cadena2 = ""
    println(cadena[1])
    val cadena2: String = "Hola"
    println(cadena2?.get(1) ?: "Adios")
    println(cadena2?.length)
    println(cadena.toUpperCase())//YA no se usa
    println(cadena.uppercase())
    println(cadena.lowercase())
    //comparar cadenas
    println(cadena.compareTo(cadena2))
    //Localizar una cadena dentro de otra
    println(cadena.indexOf(cadena2))
    //Obtener una subcadena
    println("subcadena es \"${cadena.subSequence(5,11)}\"")

}