object Tuples {
    def main(args: Array[String]){

        // Create a tuple
        var tupleMarge = (103, "Marge Simpson", 10.25)

        // Return a value from the tuple (note _ is 1 indexed)
        printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)

        // To loop through a tuple we can use the productIterator
        tupleMarge.productIterator.foreach{i => println(i)}

        // Convert a tuple to a string
        println(tupleMarge.toString())

    }
}


