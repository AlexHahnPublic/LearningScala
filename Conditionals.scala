object Conditional{
    def main(args: Array[String]){

        // Basic conditional control flow example
        val age = 18

        if ((age >5) && (age <= 6)){
            println("Go to kindergarten")
        }
        else if((age >6) && (age <= 7)){
            println("Go to grade 1")
        }
        else{
            println("Go to grade " + (age - 5))
        }

    }
}
