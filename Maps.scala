object Maps {
    def main(args: Array[String]){

        //Maps are a collection type that use key value pairs

        // An immutable map
        val employees = Map("Manager" -> "Bob Smith",
                            "Secretary" -> "Sue Brown")

        // To check/retrieve values:
        if(employees.contains("Manager")){
            printf("Manager : %s\n", employees("Manager"))
        }

        // A mutable map
        val customers = collection.mutable.Map(100 -> "Paul Smith",
                                               101 -> "Sally Smith")

        // Return the customer with key 100
        printf("Cust 1 : %s\n", customers(100))

        // Change a value using the key
        customers(100) = "Tom Marks"

        // Add a customer (is mutable remember!)
        customers(102) = "Megan Swift"

        // Output entire map with a loop
        for((k,v) <- customers){
            printf("%d : %s\n", k, v)
        }
    }
}

