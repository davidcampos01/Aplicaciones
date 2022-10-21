package EjerciciosUT2

import kotlin.math.roundToInt

//Realiza una aplicación que pida por pantalla cuántas ventas ha realizado un
//comercial en los últimos 15 días. A continuación, pedirá tantas cantidades como
//ventas haya realizado el comercial. Al final, se mostrará por pantalla la suma de
//todas las ventas de ese comercial con 2 decimales.

fun main(){
    println("¿Cuantas ventas has tenido en los ultimos 15 días?")
    val ventas= readln().toInt()
    println("Has vendido $ventas cosas")
    var i:Int
    var total = 0.00
    var dinero = 0.00
    for (i in 1..ventas){
        println("Cuanto dinero has sacado con la $i venta: ")
        dinero = readln().toDouble()
        total = total+dinero
    }
    println("Has sacado un total de ${(total * 100.0).roundToInt()/100.0} Euros")
}