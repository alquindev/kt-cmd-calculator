
enum class Operations:Calculator{
    ADD{
        override fun apply(num1:Int, num2:Int): Float {
            return add(num1, num2).toFloat()
        }
    },
    SUBTRACT{
        override fun apply(num1: Int, num2: Int): Float {
            return subtract(num1, num2).toFloat()
        }
    },
    DIVIDE{
        override fun apply(num1: Int, num2: Int): Float {
            return divide(num1, num2).toFloat()
        }
    },
    MULTIPLY{
        override fun apply(num1: Int, num2: Int): Float {
            return multiply(num1, num2).toFloat()
        }
    }
}
