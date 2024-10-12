package com.Mary.Task14;

public class classB {
    public static void main(String[] args) {
        classA squareShape = new classA();
        squareShape.setShapeLength(14);
        int squareShapeLength = squareShape.getShapeLength();

        squareShape.setShapeBreadth(11);
        int squareShapeBreath = squareShape.getShapeBreadth();

        //Calculate Area of Square
        int areaOfSquare = squareShapeLength * squareShapeBreath;
        System.out.println("The area of a square of length "+squareShapeLength+ " and breath "+ squareShapeBreath +" is " +areaOfSquare);

    }
}
