package EjerciciosUT2

import java.util.*
import kotlin.math.pow

        fun main() {
            println("Introduzca un número: ")
            var x = readln().toDouble()
            println("Introduce el segundo numero: ")
            var y = readln().toDouble()
            var opcion = 0
            //Mostramos las opciones de la calculadora
            while (opcion != 8) {
                println("\n\n--------CALCULADORA----------------")
                println("1.-Suma de dos números")
                println("2.-Resta de dos números")
                println("3.-Multiplicacion de dos números")
                println("4.-División de dos números")
                println("5.-Potencia (1º operando como base y 2º como exponente).")
                println("6.-Módulo , resto de la división entre operando1 y operando2.")
                println("7.-Pedir 2 operandos nuevos")
                println("8.-SALIR")
                println("Introduzca una opción: ")
                opcion = readln().toInt()
                when (opcion) {
                    1 -> {
                        println("--SUMA DE DOS NÚMEROS--")
                        println("El resultado de la operación es: ${sumar(x, y)}")
                    }

                    2 -> {
                        println("--RESTA DE DOS NÚMEROS--")
                        println("El resultado de la operación es: ${(restar(x, y))}")
                    }

                    3 -> {
                        println("--MULTIPLICACION DE DOS NÚMEROS--")
                        println("El resultado de la operación es: ${multiplicar(x,y)}")
                    }

                    4 -> {
                        println("--DIVISIÓN DE DOS NÚMEROS--")
                        println("El resultado de la operación es: ${dividir(x,y)}")
                    }

                    5 -> {
                        println("--POTENCIA DE DOS NÚMEROS--")
                        println("El resultado de la operación es: ${potencia(x,y)}")
                    }

                    6 -> {
                        println("--RESTO DE DOS NÚMEROS--")
                        println("El resultado de la operación es: ${resto(x,y)}")
                    }

                    7 -> {
                        println("--DIME DOS OPERADORES DE NUEVO")
                        println("Introduzca un número: ")
                        x = readln().toDouble()
                        println("Introduce el segundo numero: ")
                        y = readln().toDouble()
                    }
                    8 -> {
                        println("--ADIOS--")
                        }

                    else -> {
                        println("Esa opcion no es válida, revise las opciones dadas.")
                    }
                }
            }
        }

fun sumar(x: Double, y: Double): Double {
    return x + y
}

fun restar(x: Double, y: Double): Double {
    return x - y
}

fun multiplicar(x: Double, y: Double): Double {
    return x * y
}

fun dividir(x: Double, y: Double): Double {
    return x / y
}

fun resto(x: Double, y: Double): Double {
    return x % y
}
fun potencia(x: Double, y:Double): Double {
    return x.pow(y)
}