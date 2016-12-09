object PrintLnMethods {
    def main(args: Array[String]){
        val name = "Derek"
        val age = 39
        val weight = 175.5

        // To print with string variable
        println(s"Hello $name")

        // To print with float (double)
        println(f"I am ${age +1} and weigh $weight%.2f")

        // To print with:
        // character : %c
        // integer types : %d

        // For right justification with 5 spaces:
        printf("'%5d'\n", 5)

        // For left justification with 5 spaces:
        printf("'%-5d'\n", 5)

        // For filling with zeros:
        printf("'%05d'\n", 5)

        // For rounding to 5 decimal places:
        printf("'%.5f'\n", 3.1234567)

        // Left and right justification can also be done with strings
        printf("'%-5s'\n" , "hi")
        printf("'%5s'\n" , "hi")

        // we see that \n is the newline character, other special characters:
        // backspace : \b
        // backslash : \\
        // alert sound : \a
        // etc
    }
}

