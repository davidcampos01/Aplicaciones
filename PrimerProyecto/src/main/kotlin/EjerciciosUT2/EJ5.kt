package EjerciciosUT2

//Lee un número por teclado e indica si es divisible entre 2. Si no lo es, indícalo
//también.

fun main(){
    println("Introduce un numero ")
    val num1 = readln()?.toInt()

    if (num1 != null) {
        if (num1%2==0){
            println("El numero $num1 es divisible entre 2")
        }
        else {
            print("El numero $num1 no es divisible entre 2")
        }
    }


}