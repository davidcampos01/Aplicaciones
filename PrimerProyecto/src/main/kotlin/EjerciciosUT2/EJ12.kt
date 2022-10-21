package EjerciciosUT2

fun main(){
    combinarVariasOpciones()
}

fun combinarVariasOpciones() {
    val meses = arrayOf("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre")
    println("Escribe el mes del año con numero que quieras saber cuantos dias tiene ")
    val mes= readln().toInt()
    when (mes) {
        1, 3, 5, 7, 8, 10, 12 -> println("El mes de ${meses[mes-1]} tiene 31 dias")
        2 -> println("El mes de ${meses[mes-1]} tiene 28 o 29 dias")
        else -> println("El mes de ${meses[mes-1]} tiene 30 dias")
    }
}