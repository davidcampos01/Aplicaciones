package basics

class Principal {
    var car5: String? = null // Variable global
    // Top-level variable
    fun main() {

        // Tipos primitivos numéricos
        // Sin decimales
        // Byte -> 8 bits -128 .. 127
        // Short -> 16 -32mil..
        //

        var cadena: String = "Saludo" // Lectura-escritura
        val PI = 3.141592 //Solo Lectura / Constantes

        // PI = 5.0
        // var numero: Int = 100
        var numero = 100

        // Al poner la F al final de la variable se nos queda de tipo float
        var tipoFloat = 5.1432343F

        // Al poner la L al final de la variable se nos queda de tipo long
        var tipoLong = 1000L

        // Al poner la interrogación a la derecha te deja asignarla a null
        // pero es como si le estuvieras poniendo un tipo de variable nueva
        var car3: String? = null

        // En cambio si no ponemos el tipo nos la declara como tipo Nothing?
        var car4 = null

        // Valores largos
        val unMillon = 1_000_000_000
        val hexadecimal = 0xFF_AA_01_BD

        // Casting de tipos
        val x = 5.25
        val y: Int = x.toInt()

        // Entrada/Salida
        print("Escribe tu nombre: ") // Si no le pones nada entre los parentesis da error
        val nombre = readln()
        println("Hola $nombre") // Al no poner nada escribiria un salto de linea



    }
}