public class Calculator {
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;

    // Constructor
    public Calculator() {
    }

    // Setter methods
    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    // Perform operation based on the set operation
    public void performOperation() {
        if (operation.equals("+")) {
            result = operandOne + operandTwo;
        } else if (operation.equals("-")) {
            result = operandOne - operandTwo;
        } else {
            System.out.println("Invalid operation");
        }
    }

    // Getter method for the result
    public double getResults() {
        return result;
    }
}
