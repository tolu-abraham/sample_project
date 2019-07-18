package com.pluralsight.calcengine;

public class MathEquation {
    public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;

    public double getLeftVal(){
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal(){
        return rightVal;
    }

    public void setRightVal(double rightVal){
        this.rightVal = rightVal;
    }

    public char getOpCode(){
        return opCode;
    }

    public void setOpCode(char opCode){
        this.opCode = opCode;
    }

    public double getResult(){
        return result;
    }

    public void setResult(double result){
        this.result = result;
    }

    public MathEquation(){
    }

    public MathEquation(char OpCode){
        this.opCode = OpCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal * rightVal;
                break;

            case 'd':
                result = leftVal + rightVal;
                break;

            case 's':
                result = leftVal - rightVal;
                break;

            case 'm':
                result = leftVal / rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }
}

