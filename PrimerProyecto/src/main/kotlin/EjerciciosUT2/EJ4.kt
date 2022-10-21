package EjerciciosUT2

//Solicita por pantalla 2 números y muestra cuál es mayor de los dos. Si son iguales
//indicarlo también.

fun main(){
    println("Introduce un numero ")
    val num1 = readln()?.toInt()
    println("Introduce un segundo numero ")
    val num2 = readln()?.toInt()

    if (num1 != null && num2 !=null) {
        if (num1 > num2) {
            println("El $num1 es mayor que $num2")
        } else if (num2 == num1){
            println("Los numeros $num1 y $num2 son iguales")
        }
        else {
            println("El $num2 es mayor que $num1")
        }

    }
}


