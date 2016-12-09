object ForLoop{
    def main(args: Array[String]){

        // Classic For Loop example
        var i = 0

        for (i <- 1 to 10){
            println(i)
        }

        // Using "until" in a For Loop (useful in looping through arrays)
        val alphaLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

        for(i <- 0 until alphaLetters.length){
            println(alphaLetters(i))
        }

        // Using a For Loop to iterate through a list

        val aList = List(1,2,3,4,5)
        for(i <- aList){
            println("List items " + i)
        }

        // For loop and conditionals combined
        // Loop through a list and gather only even elements
        var evenList = for {i <- 1 to 20
            if (i % 2) == 0
            } yield i

        for (i <- evenList){
            println(i)
        }

        // Iterate through multiple variables in a loop
        for (i <- 1 to 5; j <- 6 to 10){
            println("i : " + i)
            println("j : " + j)
        }

        // Break and continue statements don't explicitly exist in Scala but we
        // can simulate them fairly straightforwardly
        def printPrimes(){
            val primeList =  List(1,2,3,5,7,11,13)
            for(i <- primeList){
                if(i == 11){
                    return // jumps out of the loop like a break
                }

                if (i != 1){ // Basically a continue statement
                    println(i)
                }
            }

        }
        printPrimes
    }
}

