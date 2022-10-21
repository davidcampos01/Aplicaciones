package EjerciciosUT2

import java.util.Random

//Programa que pide por teclado dos números y genera 10 números aleatorios
//entre ellos (ambos incluidos).
fun main(){
    println("Dime un numero: ")
    var n1 = readln().toInt()
    println("Dime otro numero: ")
    var n2 = readln().toInt()

    if (n1>n2){
        var n3: Int
        n3 = n1
        n1=n2
        n2 = n3
    }

    for (numeros in 1..10)println((n1..n2).random())

}

fun IntRange.random() =
    Random().nextInt((endInclusive + 1) - start) + start