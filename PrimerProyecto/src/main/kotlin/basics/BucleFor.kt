package basics

fun main() {
    val nombres = arrayOf("Juan", "Jorge", "Daniel")

    //recorrerArray(nombres)
    //rangos()

    bucleWhile()
}

fun recorrerArray(array: Array<String>){
    for (elemento in array) {
        println(elemento)
    }
}

fun rangos() {
    for(caracter in 'a'..'z')print(caracter)
    println()
    for (num in 1..100) print("$num ")
    println()
    //iteracion con avance de 2
    for (num in 1..100 step 2) print("$num ")
    println()

    //iteracion inversa
    for (caracter in 'z' downTo 'a') print(caracter)
    println()

    for (num in 100 downTo 1 step 2) print("$num ")
    println()
}

fun bucleWhile(){

    var i = 0
    while (i < 5){
        println(i)
        i++
    }
    // do-while
    var j = 0
    do{
        println(j++)
    }while (j < 5)

}