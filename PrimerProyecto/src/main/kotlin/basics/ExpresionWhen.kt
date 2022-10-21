package basics

fun main() {
    //whenComoExpresion()
    //whenComoSentencia()
    combinarVariasOpciones()
    //comprobarTipo(5)
   // comprobarTipo("Cadena")
   // comprobarTipo('c')
}

fun whenComoSentencia() {
    val a = 12
    val b = 5

    println("Introduce operador: +, -, *, /")
    val operador = readln()

    var resultado = when (operador) {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a + $b = ${a - b}")
        "*" -> println("$a + $b = ${a * b}")
        "/" -> println("$a + $b = ${a / b}")
        else -> "$operador no es un opeador valido"


    }
}
    fun whenComoExpresion() {
        //A LA DERECHA DE UN IGUAL
        val a = 12
        val b = 5

        println("Introduce operador: +, -, *, /")
        val operador = readln()

        var resultado = when (operador) {
            "+" -> println("$a + $b = ${a + b}")
            "-" -> println("$a + $b = ${a - b}")
            "*" -> println("$a + $b = ${a * b}")
            "/" -> println("$a + $b = ${a / b}")
            else -> "$operador no es un opeador valido"

        }
        //println("El resultado es:"  + resultado)
    }

    fun combinarVariasOpciones(){
        println("Escribe el dia de la semana con numero: (1 lunes, 2 martes, 3miercoles,....)")
        val diaSemana= readln().toInt()
        when(diaSemana){
            1,2,3,4,5 -> println("El dia $diaSemana es laborable")
            6,7 -> println("El dia $diaSemana es fin de semana")
            else -> println("Dia no valido")
        }
    }
    fun valorEnRango(){
        val a = 100

        when (a){
            in 1..10 -> println("Numero entre 1 y 10")
            in 11..100 -> println("Numero entre 11 y 100")
        }
    }
    fun comprobarTipo(x: Any) {
        when (x) {
            is Int -> println("El valor es un entero")
            is String -> println("El valor es una cadena")
            else -> println("Tipo no contemplado")
        }
    }