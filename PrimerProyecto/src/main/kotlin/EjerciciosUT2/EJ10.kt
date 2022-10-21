package EjerciciosUT2

//Lee un número por teclado y comprueba si es mayor o igual que cero. Si no lo es,
//lo volverá a pedir. Después muestra ese número por consola.

fun main(){
    println("Introduce un numero ")
    var num1 = readln()?.toInt()
        while (num1!! < 0){
            println("Introduce un numero ")
            num1= readln().toInt()
        }
        println("El numero es:  $num1")


}