import scala.io.StdIn.{readLine} // If we know is an int can import readInt
// Other common libraries to import:
//import scala.math._ // The entire math library
//import scala.collection.mutable.ArrayBuffer // For using array buffers
//import java.io.PrintWriter // Allows us to print to a file
//import scala.io.Source // Allows us to read from a file


object InputOutput{
    def main(args: Array[String]){

        var numberGuess = 0

        do{
            print("Guess a number ")
            numberGuess = readLine.toInt
        }
        while(numberGuess != 15)

        printf("You guessed the secret number %d\n", 15)

    }
}

