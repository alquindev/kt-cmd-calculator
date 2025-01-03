# CMD Calculator

## Introduction
This is a basic implementation of a calculator in kotlin. It only supports four operation Addition, Subtraction, Multiplication and Division. The input are whole numbers and a corresponding output is generated as a float. It does not support equations as inputs as a conventional would. 

## Installation Instructions
1. Ensure you have the [android studio](https://developer.android.com/studio) setup and an IDE of choice. I went with [Intellij IDE](https://www.jetbrains.com/idea/download/) .  
2. Clone this repository to your local machine using:
    ```sh
    git clone https://github.com/alquindev/kt-cmd-calculator  
    ```
3. Open the project with you IDE:
    

## Getting Started
1. To start the calculator, run the [main function](https://github.com/alquindev/kt-cmd-calculator/blob/main/src/Main.kt#L3) in the [Main.kt](https://github.com/alquindev/kt-cmd-calculator/blob/main/src/Main.kt) file.
2. Follow the on-screen instructions to perform calculations.

## User Manual
### Controls
- Select an operation for the provided list _(order may change)_
  - **1** for Addition
  - **2** for Subtraction
  - **3** for Division
  - **4** for Multiplication
- 
## API Documentation

### Interfaces
- [Calculator](https://github.com/alquindev/kt-cmd-calculator/blob/main/src/Calculator.kt): Contains the default implementation for each operation. 

### Classes
- [CMDInterface](https://github.com/alquindev/kt-cmd-calculator/blob/main/src/CMDInterface.kt): Manages the Input/Output of the Calculator

### Enums
- [Operations](https://github.com/alquindev/kt-cmd-calculator/blob/main/src/Operations.kt): A list of Available operations with a corresponding function call. 


### Methods
- [Calculator.apply](https://github.com/alquindev/kt-cmd-calculator/blob/main/src/Calculator.kt#L4):A blank function to implement available operations
- [CMDInterface.SelectOperation](https://github.com/alquindev/kt-cmd-calculator/blob/main/src/CMDInterface.kt#L34): Display the available operations to the user and selection fo the same.
- [CMDInterface.GetInputVariables](https://github.com/alquindev/kt-cmd-calculator/blob/main/src/CMDInterface.kt#L40): Populate the parameters used in the operation's function.

## Troubleshooting
### Common Issues
- **Calculator not starting**: Ensure the development setup is done correctly. Also check if you are running the main function.
- **Input Error**: All inputs are inform of whole numbers.
- **Input not working**: Make sure your terminal window is focused.
