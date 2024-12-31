//import java.lang.IllegalArgumentException

interface Calculator {
    fun apply(num1:Int, num2:Int): Float

    fun add(num1:Int, num2:Int): Int {
        return   num1 + num2
    }

    fun subtract(num1:Int, num2:Int): Int{
        return num1 - num2
    }

    fun multiply(num1:Int, num2:Int):Int{
        return num1 * num2
    }

    fun divide(num1:Int, num2:Int):Float{
        if(num2 ==  0){
            throw IllegalArgumentException("The denominator cannot be zero")
        }
        return num1.toFloat() / num2.toFloat()
    }
}

