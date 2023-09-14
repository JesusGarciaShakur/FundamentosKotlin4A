fun main(){
    //variables y tipos de datos Kotlin
    // val para constantes
    // avr para variables

    val name = "Jesus Garcia Shakur"
    var age = 20

    print("Hola, soy $name y tengo ")
    println("$age años ")

    // name = "si" las variables val no cambian (inmutables)
    age = 19
    age += 10

    //age = "diez" Variables var cambian de valor pero de no de tipo
    // Especificar Tipo de Dato en declaración

    // Declaración
    // Inicialización
    val city: String = "Apizaco"

    //Decalaracion e inicialización
    val isMarried: Boolean = false

    val cars: Int = 3
    val children: Int = 0
    val height: Double = 1.68

    //String Templates
    //$ para imprimir tipos de variables
    //$ {} para procesos antes de imprimir
    println("Hola soy $name y tengo $age años")
    println("Vivo en $city, tengo $children hijos")

    println("En 2030 tendre ${ children + 3 } hijos")
    println("En 2030 tendre ${ cars+3 } 🚌")
}