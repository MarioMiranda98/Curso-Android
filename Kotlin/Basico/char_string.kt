fun main(args: Array<String>) {
    var char: Char = 'a'
    println(char)

    //Para insertar caracteres unicode
    var charUnicode: Char = '\uFA10'
    println(charUnicode)

    //Para imprimir numeros como caracteres
    var charNumero: Char = '8'
    println(charNumero)

    //Para convertir caracteres a numeros
    //Al convertir un numero a traves de caracteres 
    //regresa el valor del caracter, restarle 48 para obtener 
    //el numero de conversion del valor real
    var charToInt: Int = charNumero.toInt()
    println(charToInt)

    charToInt = charToInt - 48
    var suma: Int = charToInt + 8

    println(suma)

    //Cadenas
    var cadena: String = 'Mario'
    println(cadena)

    //Acceder a una posicion o letra de la cadena
    println(cadena[0])
    
}