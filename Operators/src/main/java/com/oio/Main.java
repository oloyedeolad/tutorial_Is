package com.oio;

public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        // 3 + 2 = 5
        System.out.println("Addition = " +(x + y));
        // 3 - 2 = 1
        System.out.println("Subtraction = " + (x - y));
        // 3 * 2 = 6
        System.out.println("Multiplication = " + (x * y));
        // 3 / 2 = 1
        System.out.println("Division = " + (x / y));
        // 3 % 2 = 1
        System.out.println("Modulus = " + (x % y));

        System.out.println("increament x = " + (++x));
        System.out.println("decreament y = " + (--y));

        //Comparison Operators
        // == (equal to),
        // != (not equal to),
        // > (greater than),
        // < (less than),
        // >= (greater than or equal to),
        // <= (less than or equal to)
        int candidateScore = 70;
        int passMark = 50;
        if (candidateScore >= 75 ){
            System.out.println("You have an A");
        } else if (candidateScore >= 60){
            System.out.println("You have a B");
        } else if (candidateScore >= 50){
            System.out.println("You have a C");
        } else {
            System.out.println("You have failed");
        }

        //Logical Operators
        // && (logical and one and the other must be true),
        if (candidateScore >= 50 && candidateScore <= 100){
            System.out.println("You have passed");
        } else {
            System.out.println("You have failed");
        }
        // || (logical or, one or the other must be true),
        if (candidateScore >= 50 || candidateScore <= 100){
            System.out.println("You have passed");
        } else {
            System.out.println("You have failed");
        }
        // ! (logical not if it is true, make it false and vice versa)
        if (!(candidateScore >= 50)){
            System.out.println("You have failed");
        } else {
            System.out.println("You have passed");
        }
    }

    // Arithmetic Operators
    // + (addition),
    // - (Subtraction),
    // * (Multiplication),
    // / (division),
    // % (modulus)
    // ++ (increment),
    // -- (decrement)


    //Assignment Operators
    // = (simple assignment),
    // += (addition assignment),
    // -= (subtraction assignment),
    // *= (multiplication assignment),
    // /= (division assignment),
    // %= (modulus assignment)

    //Logical Operators
    // && (logical and),
    // || (logical or),
    // ! (logical not)



}