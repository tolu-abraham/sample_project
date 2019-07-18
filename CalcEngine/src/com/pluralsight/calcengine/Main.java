package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 135.0d, 50.0d);
        equations[1] = new MathEquation('s', 102.0d, 50.0d);
        equations[2] = new MathEquation('a', 145.0d, 50.0d);
        equations[3] = new MathEquation('m', 100.0d, 50.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }
    }
}

//        public static MathEquation create(double leftVal, double rightVal, char opCode){
//            MathEquation equation = new MathEquation();
//            equation.setLeftVal(leftVal);
//            equation.setRightVal(rightVal);
//            equation.setOpCode(opCode);
//
//            return equation;


