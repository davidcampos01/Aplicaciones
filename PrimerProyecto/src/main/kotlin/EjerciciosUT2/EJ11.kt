package EjerciciosUT2

// Escribe una aplicación en la que declares un String que contenga una contraseña
//cualquiera. Después te pedirá que introduzcas la contraseña, con 3 intentos.
//Cuando aciertes ya no pedirá más la contraseña y mostrará un mensaje diciendo
//“Enhorabuena, acertaste”. Si fallas debe mostrar un mensaje “Has fallado. Te
//quedan ‘x’ intentos”
//A tener en cuenta: 3 intentos y si acierta termina, aunque le queden intentos

fun main(){
    val contraseña = "12121514aa"
    var intentos = 3

    while (intentos!=0){
        println("Introduzca su contraseña: ")
        val contrasena= readln()
        if (contraseña != contrasena){
            intentos--
            println("Has fallado. Te quedan $intentos intentos")
        }else{
            println("Enhorabuena acertaste!")
            break
        }
    }


}