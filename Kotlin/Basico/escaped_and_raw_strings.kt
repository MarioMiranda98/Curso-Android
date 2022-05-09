fun main(args: Array<String>) {
    // \n -> saltod de linea
    // \t -> tabulacion
    var cadena: String = "Mario\n\tMiranda"
    println(cadena)

    //Para escribir una cadena con multiples renglones
    var cadenaVariasLineas: String = """Mario
                        Miranda"""
    println(cadenaVariasLineas)

    //Ver la cantidad de caracteres de una cadena
    println(cadenaVariasLineas.length)

    //Para concatenar cadenas
    var cadena2: String = "\tConcatenando"
    println(cadena + cadena2)

    //Imprimir dentro de una cadena de texto
    println("Mi nombre es: $cadena y tengo ${cadena.length} caracteres")

    //Para imprimir variables numericas y simbolos 
    var dinero: Int = 10
    println("Mi nombre es $cadena y tengo ${'$'}$dinero dolares")
}