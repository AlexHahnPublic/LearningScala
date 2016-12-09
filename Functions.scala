object Functions {
    def main(args: Array[String]){
        // def funcName ( param1:dataType, param2:dataType) : returnType = {
        // function body
        // return valueToReturn
        // }


        // can assign default values in the parameters of the function
        def getSum(num1 : Int = 1, num2 : Int = 1) : Int = {
            return num1 + num2
        }

        // Test the function with and without specified parameters
        println("1 + 1 = " + getSum())
        println("5 + 4 = " + getSum(5,4))


        // Note that we don't necessarily need the return keyword here, it is
        // really just syntactic sugar


        def getSum2(num1 : Int = 1, num2 : Int = 1) : Int = {
            num1 + num2
        }

        // Test the function with and without specified parameters
        println("1 + 1 = " + getSum2())
        println("5 + 4 = " + getSum2(5,4))
        // We can also use named parameters
        println("7 + 3 = " + getSum2(num2=3, num1=7))

        // Of course we can have functions that don't return anything, these
        // are known as "procedures" in Scala
        def sayHi() : Unit = {
            println("Hi how are you")
        }

        sayHi

        // We could also receive a variable number of arguments
        def getSumMany(args : Int*) : Int = {
            var sum : Int = 0
            for(num <- args) {
                sum += num
            }
            sum
        }

        println("Get Sum 7 8 49 34 = " + getSumMany(7, 8, 49, 34))

        // Let's create the classic factorial recursive function
        def factorial(num : BigInt) : BigInt = {
            if(num <= 1)
                return 1
            else
                num * factorial(num-1)
        }

        println("Factorial of 4 = " + factorial(4))

    }
}


