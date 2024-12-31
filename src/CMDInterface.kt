class CMDInterface {
    private val instructions:String
        get() = """
            Hello there,
            This is a basic cmd calculator were you select the operation, input the numbers and yield some result.
        """.trimIndent()
    var activeOperation:Operations = Operations.ADD

    init{
        ClearConsole()
        println(instructions)
        activeOperation = SelectOperation()
        val inputs:List<Int> = GetInputVariables(activeOperation)
        val result = activeOperation.apply(inputs[0], inputs[1])
        print("Result: ${result}")
//        ClearConsole()
    }

    private fun ClearConsole(){
        val clsCommand =  ProcessBuilder("cmd", "/c", "cls")
        clsCommand.inheritIO().start().waitFor()
    }

    fun SelectOperation():Operations{
        println("Select Operation:")
        val optionsList = Operations.entries

        for((index, operation) in optionsList.withIndex()){
            println("\t${index+1} ${operation}")
        }
        print(">>> ")
        val selectedOperation = readln().toInt() - 1
        if(selectedOperation < 0 || selectedOperation > optionsList.size){
            throw IllegalArgumentException("The selected option is out of bound.")
        }

        return optionsList[selectedOperation]
    }

    fun GetInputVariables(operation: Operations):List<Int>{
        println("\nEnter the value of A followed by B (use Whole Numbers): ")
        when(operation){
            Operations.ADD -> println("\tA + B = C")
            Operations.SUBTRACT -> println("\tA - B = C")
            Operations.MULTIPLY -> println("\tA x B = C")
            Operations.DIVIDE -> println("\tA / B = C")
        }
        print(">>>")
        val num1: Int = readln().toInt()
        print(">>>")
        val num2: Int = readln().toInt()

        return listOf(num1, num2)
    }



}