package basics

fun main() {
    //if
    var edad = 16
    if (edad < 18)
        println("Menor de edad")

    //if else
    if (edad < 18)
        println("Menor de edad")
    else
        println("Mayor de edad")

    //if - else if - else
    val hora = 22
    if(hora <10)
        println("Buenos dias")
    else if (hora < 20)
        println("Buenas Tardes")
    else
        println("Buenas noches")

    //No existe operador ternario como tal de Java
    // En kotlin if puede ser una expresion
    val mayorEdad = if (edad < 18) "Eres menor"
                    else ("Eres mayor de edad")
    println(mayorEdad)

    //OPERADOR IN
    val coches = arrayOf("Volvo", "BMW", "Tesla", "Ford")
    if ("BMW" in coches) {
        println()
    }
    val numeros = intArrayOf(2,4,6,8)
    if (4 in numeros) println("Contiene el numero 4")
}

