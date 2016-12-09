object WhileLoop {
    def main(args: Array[String]){

       // Basic While Loop
        var i = 0

        while(i <= 10) {
            println(i)
            i += 1
        }

        // Do While Loop (guaruntees going through the loop at least once

        var j = 0

        do  {
            println(j)
            j += 1
        }
        while (j <= 20)
    }
}



