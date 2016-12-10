import scala.collection.mutable.ArrayBuffer // need for creating arraybuffers
object Arrays {
    def main(args : Array[String]){

        // Use an array when the size of the array is fixed, use an array
        // buffer when there could be a variable number of data to be stored

        val favNums = new Array[Int](20)
        val friends = Array("Bob", "Tom")

        // We can easily change a value via it's index
        friends(0) = "Sue"
        println("First friend is: " + friends(0))

        // Working with an array buffer
        val friends2 = ArrayBuffer[String]()

        // Insert at an index
        friends2.insert(0, "Phil")

        // Add to end
        friends2 += "Mark"

        // Add multiple elements (another array) to end
        friends2 ++= Array("Susy", "Paul", "Alex")

        // Can also add items starting at an index (pushes later items back)
        friends2.insert(2, "Mike", "Sally", "Sam")

        // Can remove an item, 2 items starting at the second index
        friends2.remove(2,2)

        // To cycle through and print out the names of the friends2 list
        var friend : String =""

        for(friend <- friends2)
            println(friend)

        // To fill an array using a loop
        for (j <- 0 to (favNums.length - 1)){
            favNums(j) = j
            println(favNums(j))
        }

        // Now that we have the array built, we can cycle through it and
        // perform calculations on each element using yield
        val favNumsTimes2 = for(num <- favNums) yield 2 * num

        // Print out the results without using a loop
        favNumsTimes2.foreach(println)

        // Store values that match conditions
        var favNumsDiv4 = for(num <- favNums if num % 4 == 0) yield num
        favNumsDiv4.foreach(println)

        // Create a multidimensional array
        var multTable = Array.ofDim[Int](10,10)

        for(i <- 0 to 9){
            for(j <- 0 to 9){
                multTable(i)(j) = i*j
            }
        }

        // To print out use a similar double four loop structure
        for(i <- 0 to 9){
            for(j <- 0 to 9){
                printf("%d : %d = %d\n", i, j, multTable(i)(j))
            }
        }

        // Array functions
        println("Sum : " + favNums.sum)
        println("Min : " + favNums.min)
        println("Max : " + favNums.max)

        //To sort
        val sortedNums = favNums.sortWith(_>_)

        // For increasing sort
        //val sortedNums = favNums.sortWith(_<_)

        // Convert an array into a string with a delimeter
        println(sortedNums.deep.mkString(", "))
    }
}
