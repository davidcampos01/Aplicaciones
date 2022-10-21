package EjerciciosUT2

//Pregunta tipo test. Realiza un programa que muestre una pregunta y 4 opciones
//(a, b, c y d). Solicita al usuario la respuesta por teclado y muestra si la respuesta
//es correcta o no. El programa termina cuando el usuario acierta.

fun main() {
    val a = "La Paz"
    val b = "Buenos Aires"
    val c = "La Habana"
    val d = "Bogotá"
    var respuesta: String? = null

    while (respuesta != "d"){
        println("¿Cual es la capital de Colombia?")
        println("a. $a")
        println("b. $b")
        println("c. $c")
        println("d. $d")
        println("Respuesta: ")
        respuesta = readln()
        if (respuesta=="d"){
            println("Felicitaciones!!")
        }else{
            println("Vuelve a intentarlo")
        }

    }
}