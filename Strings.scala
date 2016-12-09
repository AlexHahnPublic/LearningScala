object Strings{
    def main(args: Array[String]){
        var randSent = "I saw a dragon fly by"
        // lists are 0 indexed in scala, a string is a list of chars
        println("2nd index : " + randSent(2))

        // Return the length of a string (length of a charlist!)
        println("String length : " + randSent.length)

        // To concatenate strings
        println(randSent.concat(" and explode"))

        // To compare strings
        println("Are the two strings equal? " + "I saw a dragon".equals(randSent))

        // To find a match (where a substring appears in a list)
        println("dragon starts at index " +
            randSent.indexOf("dragon"))

        // To convert the string to an Array
        val randSentArray = randSent.toArray

        // Cycle through and print each element of the array
        for(v <- randSentArray){
            println(v)
        }


    }
}
