package EjerciciosUT2

// Muestra los números del 100 al 1 (ambos incluidos) que sean divisibles entre 2 y
//3.

fun main(){
    for (num in 100 downTo 1){
        if (num%2==0 && num%3==0)
            println(num)
    }
}