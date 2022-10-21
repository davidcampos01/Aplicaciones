package EjerciciosUT2

//Modifica el ejercicio anterior de tal manera que el usuario vaya introduciendo
//ventas hasta que escriba un * (asterisco). Al finalizar, se mostrará el número de
//ventas realizado y la suma total de las ventas del comercial con 2 decimales

fun main() {
    var ventas = "0"
    var total = 0.00
    var dinero = "0.00"
    var contador = 0
    while (dinero != "*")//(!dinero.equals("*"))
         {
            println("Cuanto dinero has sacado con la venta: ")
            dinero = readln()
        if (dinero == "*"){
           println("Fin del programa")
            contador=contador-1
       }else
            total = total + dinero.toDouble()
            contador++
        }
        println("Has realizado un total de $contador ventas")
        println("Has sacado un total de $total Euros")
    }

