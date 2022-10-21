package EjerciciosUT2

//Contar (y mostrar por pantalla) las vocales, consonantes, números y espacios en
//blanco de una cadena de caracteres que se pedirá por pantalla



fun main() {

    var vocal: Int = 0
    var consonante: Int = 0
    var numero: Int = 0
    var espacio: Int = 0
    println("Dime una cadena de caracteres, menos los especiales que nos conocemos")
    val palabra: String = readln().uppercase()
    val vocales = "aeiou"
    val consonantes = "bcdfghjklmnñpqrstvwxyz"
    for(i in 0 .. palabra.length-1) {
        val carac = palabra[i]
        when (carac) {
            in vocales -> vocal++
            in consonantes -> consonante++
            in '0'..'9' -> numero++
            ' '  -> espacio++

        }
    }

    println("$palabra tiene  $vocal vocales, $consonante consonantes, $espacio espacios " +
            "y $numero números")

}
