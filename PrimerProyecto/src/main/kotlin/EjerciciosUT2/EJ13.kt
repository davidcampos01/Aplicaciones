package EjerciciosUT2

//Crea un programa que pida por pantalla un día de la semana (como String) y nos
//indique si es un día laborable (considerando de lunes a viernes) o es fin de
//semana.

fun main() {
    println("Escribe el dia de la semana y te digo si es laborable o no")
    val diaSemana= readln().uppercase()
    when(diaSemana){
        "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES" -> println("El dia $diaSemana es laborable")
        "SABADO", "DOMINGO" -> println("El dia $diaSemana es fin de semana")
    }
}